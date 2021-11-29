package FoodDeliveryAppResOwner.Dao;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import FoodDeliveryAppResOwner.HibernateUtil.HibernateUtil;
import FoodDeliveryAppResOwner.entity.ResOwnerEntity;

import org.hibernate.Query;

public class ResOwnerDao
{ 
	static SessionFactory sessionFactory=null;
	@SuppressWarnings("unchecked")
	public List<ResOwnerEntity> getUserWithUsernameAndPassword(String username, String password) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<ResOwnerEntity> list=new ArrayList<ResOwnerEntity>();	
		session.beginTransaction();
		String hql = "FROM ResOwnerEntity a where a.username=:username and a.password=:password";
		Query query = session.createQuery(hql);
		query.setParameter("username",username);
		query.setParameter("password",password);
		list=query.list();
		session.getTransaction().commit();
		return list;
		
	}   
	public List<ResOwnerEntity> getrestaurantname(String username) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<ResOwnerEntity> list1=new ArrayList<ResOwnerEntity>();	
		session.beginTransaction();
		String hql = "FROM ResOwnerEntity a where a.username=:username";
		Query query = session.createQuery(hql);
		query.setParameter("username",username);
		list1=query.list();
		session.getTransaction().commit();
		return list1;
		
	}   
	
}