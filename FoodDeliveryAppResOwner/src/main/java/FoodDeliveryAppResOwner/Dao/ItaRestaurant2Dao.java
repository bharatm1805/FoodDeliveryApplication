package FoodDeliveryAppResOwner.Dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import FoodDeliveryAppResOwner.HibernateUtil.HibernateUtil;
import FoodDeliveryAppResOwner.entity.IndianRestaurant1;
import FoodDeliveryAppResOwner.entity.ItalianRestaurant2;



public class ItaRestaurant2Dao {
	static SessionFactory sessionFactory=null;
	public void displayDishes() {
		List<ItalianRestaurant2> menuList=fetchMenu();
		for(ItalianRestaurant2 m:menuList) {
			System.out.println(m.toString());
		}
	}
	
	public Integer createDish(ItalianRestaurant2 m) {
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
	public List<ItalianRestaurant2> fetchMenu(){
		System.out.println("**fetching dishes***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<ItalianRestaurant2> dishes=session.createQuery("FROM ItalianRestaurant2").list();
		session.close();
		System.out.println("Fetched "+dishes.size()+" dishes");
		return dishes;
		
	}
	
	public ItalianRestaurant2 fetchMenuById(Integer id){
		System.out.println("*** Fetching Dishes***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		ItalianRestaurant2 m=(ItalianRestaurant2) session.load(ItalianRestaurant2.class, id);
		System.out.println(m.toString());
		session.close();
		return m;
	}
	
	public void deleteMenu(Integer id) {
		System.out.println("deleting dish");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ItalianRestaurant2 m=fetchMenuById(id);
		session.delete(m);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully deleted "+m.toString());
	
	}
	public void update(ItalianRestaurant2 m,String name,int cost) {
		System.out.println("***updating menu***");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ItalianRestaurant2 m1=(ItalianRestaurant2) session.get(ItalianRestaurant2.class,m.getId());
		m1.setName(name);
		m1.setCost(cost);
		session.getTransaction().commit();
		session.close();
		System.out.println("Menu successfully updated\n"+m.toString());
		
	}
	public void save(ItalianRestaurant2 items) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(items);
		session.getTransaction().commit();
		session.close();
	}

}

