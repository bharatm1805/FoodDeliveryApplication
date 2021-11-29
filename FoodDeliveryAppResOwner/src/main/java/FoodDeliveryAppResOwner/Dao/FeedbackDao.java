package FoodDeliveryAppResOwner.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import FoodDeliveryAppResOwner.HibernateUtil.HibernateUtil;
import FoodDeliveryAppResOwner.entity.FeedbackEntity;



public class FeedbackDao {
	
	static SessionFactory sessionFactory = null;
	//create Entities or update entity
	public void save(FeedbackEntity fb) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(fb);
		session.getTransaction().commit();
		session.close();
	}
	
	
	//Read Entities
	@SuppressWarnings("unchecked")
	public List<FeedbackEntity> fetchfeedbacks() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<FeedbackEntity> cabs = session.createQuery("FROM FeedbackEntity").list();
		session.close();
		return cabs;
	}
	
	
	
	
	
}