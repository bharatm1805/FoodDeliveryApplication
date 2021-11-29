package FoodDeliveryAppResOwner.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration con=new Configuration().configure("hibernate.cfg.xml");
			ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			sessionFactory=con.buildSessionFactory(reg);
			
			
		}
		return sessionFactory;
	}

}