package FoodDeliveryAppResOwner.Dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import FoodDeliveryAppResOwner.HibernateUtil.HibernateUtil;
import FoodDeliveryAppResOwner.entity.User;



public class UserDao {
	static SessionFactory sessionFactory=null;
	
	public Integer createUser(User u) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		session.close();
		return u.getId();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUserWithUsernameAndPassword(String username, String password) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<User> list=new ArrayList<User>();	
		session.beginTransaction();
		String hql = "FROM User a where a.username=:username and a.password=:password";
		Query query = session.createQuery(hql);
		query.setParameter("username",username);
		query.setParameter("password",password);
		list=query.list();
		session.getTransaction().commit();
		return list;
		
	}   
	
	public User getUserDetails(int id) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	    User user = (User)session.get(User.class, id);
	    session.getTransaction().commit();
	    return user;
	}

}

