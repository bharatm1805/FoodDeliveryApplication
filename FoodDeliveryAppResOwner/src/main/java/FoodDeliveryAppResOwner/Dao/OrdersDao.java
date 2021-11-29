package FoodDeliveryAppResOwner.Dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import FoodDeliveryAppResOwner.HibernateUtil.HibernateUtil;
import FoodDeliveryAppResOwner.entity.Orders;
import FoodDeliveryAppResOwner.entity.User;



public class OrdersDao {
	static SessionFactory sessionFactory=null;
	public Integer createOrder(Orders o) {
		System.out.println("*** Creating order ***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(o);
		session.getTransaction().commit();
		session.close();
		System.out.println("Order successfully created \n");
		return o.getOid();
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> fetchOrder(){
		System.out.println("**fetching orders***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<Orders> orders=session.createQuery("FROM Orders").list();
		session.close();
		System.out.println("Fetched "+orders.size()+" orders");
		return orders;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> fetchOrderByResName(String resname){
		System.out.println("**fetching orders***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<Orders> orders=session.createQuery("FROM Orders a where a.resName=:resName").setParameter("resName",resname).list();
		
		session.close();
		System.out.println("Fetched "+orders.size()+" orders");
		return orders;
	}

}
