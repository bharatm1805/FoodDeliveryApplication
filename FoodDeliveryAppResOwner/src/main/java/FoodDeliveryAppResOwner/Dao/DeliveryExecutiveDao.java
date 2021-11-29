package FoodDeliveryAppResOwner.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import FoodDeliveryAppResOwner.HibernateUtil.HibernateUtil;
import FoodDeliveryAppResOwner.entity.DeliveryExecutive;
import FoodDeliveryAppResOwner.entity.Orders;

public class DeliveryExecutiveDao {
	static SessionFactory sessionFactory=null;
	public DeliveryExecutive fetchExecutiveById(Integer eid){
		System.out.println("*** Fetching Executive***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		DeliveryExecutive m=(DeliveryExecutive) session.load(DeliveryExecutive.class, eid);
		System.out.println(m.toString());
		session.close();
		return m;
	}
	
	public  void setTable(Orders o)
	{
	
		DeliveryExecutive de=new DeliveryExecutive();
		de.setEid(125);
		de.setPhno(7611234);
		de.setEname("Sani");
		de.setVehicleno("poipo");
		de.setOrderid(o);
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(de);
		session.getTransaction().commit();
	}
	
	public DeliveryExecutive setExecutive(Orders o) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//String hql="FROM DeliveryExecutive";
		//Query query =session.createQuery(hql);
		//query.setMaxResults(1);
		//List<DeliveryExecutive> list=query.list();
		//DeliveryExecutive de=(DeliveryExecutive)list;
		//de.setOrderid(o);
		DeliveryExecutive de=(DeliveryExecutive)session.createQuery("FROM DeliveryExecutive").setMaxResults(1).uniqueResult();
		de.setOrderid(o);
		System.out.println(de.toString());
		
		session.save(de);
		session.getTransaction().commit();
		System.out.println(de.toString());
		return de;
		
		
	}
	
	
}