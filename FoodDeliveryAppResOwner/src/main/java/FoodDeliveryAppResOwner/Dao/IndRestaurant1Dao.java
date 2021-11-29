package FoodDeliveryAppResOwner.Dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import FoodDeliveryAppResOwner.HibernateUtil.HibernateUtil;
import FoodDeliveryAppResOwner.entity.IndianRestaurant1;



public class IndRestaurant1Dao {
	static SessionFactory sessionFactory=null;
	public void displayDishes() {
		List<IndianRestaurant1> menuList=fetchMenu();
		for(IndianRestaurant1 m:menuList) {
			System.out.println(m.toString());
		}
	}
	
	public Integer createDish(IndianRestaurant1 m) {
		System.out.println("*** Creating Dish ***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(m);
		session.getTransaction().commit();
		session.close();
		System.out.println("Dish successfully created \n"+m.toString());
		return m.getId();
	}
	
	@SuppressWarnings("unchecked")
	public List<IndianRestaurant1> fetchMenu(){
		System.out.println("**fetching dishes***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<IndianRestaurant1> dishes=session.createQuery("FROM IndianRestaurant1").list();
		session.close();
		System.out.println("Fetched "+dishes.size()+" dishes");
		return dishes;
		
	}
	
	public IndianRestaurant1 fetchMenuById(Integer id){
		System.out.println("*** Fetching Dishes***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		IndianRestaurant1 m=(IndianRestaurant1) session.load(IndianRestaurant1.class, id);
		System.out.println(m.toString());
		session.close();
		return m;
	}
	
	public void deleteMenu(Integer id) {
		System.out.println("deleting dish");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		IndianRestaurant1 m=fetchMenuById(id);
		session.delete(m);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully deleted "+m.toString());
	
	}
	public void update(IndianRestaurant1 m,String name,int cost) {
		System.out.println("***updating menu***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		IndianRestaurant1 m1=(IndianRestaurant1) session.get(IndianRestaurant1.class,m.getId());
		m1.setName(name);
		m1.setCost(cost);
		session.getTransaction().commit();
		session.close();
		System.out.println("Menu successfully updated\n"+m.toString());
		
	}
	public void save(IndianRestaurant1 items) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(items);
		session.getTransaction().commit();
		session.close();
	}


}




