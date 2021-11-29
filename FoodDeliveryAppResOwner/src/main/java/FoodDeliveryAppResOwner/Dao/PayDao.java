package FoodDeliveryAppResOwner.Dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import FoodDeliveryAppResOwner.HibernateUtil.HibernateUtil;
import FoodDeliveryAppResOwner.entity.Confirmation;
import FoodDeliveryAppResOwner.entity.NetConform;
import FoodDeliveryAppResOwner.entity.Payment;



@Component
public class PayDao {
//	@Autowired
//	HibernateTemplate hibernateTemplate;
	

	static SessionFactory sessionFactory=null;
	public void save(Payment p)
	{
//		String i=(String)this.hibernateTemplate.save(p);
//		return i;
		
		
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
	}
	
//	public List<Payment> getAll()
//	{
//	   List<Payment> li=this.hibernateTemplate.loadAll(Payment.class);
//	   return li;
//	}
//	
	public void savePayCon(Confirmation pa) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(pa);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public void saveNet(NetConform pa) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(pa);
		session.getTransaction().commit();
		session.close();
	}
	
	
	

}
