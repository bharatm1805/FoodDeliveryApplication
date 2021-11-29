package FoodDeliveryAppResOwner.controller;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.springframework.ui.Model;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import FoodDeliveryAppResOwner.Dao.DeliveryExecutiveDao;
import FoodDeliveryAppResOwner.Dao.IndRestaurant1Dao;
import FoodDeliveryAppResOwner.Dao.IndRestaurant2Dao;
import FoodDeliveryAppResOwner.Dao.ItaRestaurant1Dao;
import FoodDeliveryAppResOwner.Dao.ItaRestaurant2Dao;
import FoodDeliveryAppResOwner.Dao.OrdersDao;
import FoodDeliveryAppResOwner.Dao.PayDao;
import FoodDeliveryAppResOwner.entity.Confirmation;
import FoodDeliveryAppResOwner.entity.DeliveryExecutive;
import FoodDeliveryAppResOwner.entity.IndianRestaurant1;
import FoodDeliveryAppResOwner.entity.IndianRestaurant2;
import FoodDeliveryAppResOwner.entity.ItalianRestaurant1;
import FoodDeliveryAppResOwner.entity.ItalianRestaurant2;
import FoodDeliveryAppResOwner.entity.NetConform;
import FoodDeliveryAppResOwner.entity.Orders;


@Controller
@SessionAttributes("order")
public class RestaurantController {
	
	@Autowired
	IndRestaurant1Dao ind1Dao;
	
	@Autowired
	IndRestaurant2Dao ind2Dao;
	
	@Autowired
	ItaRestaurant1Dao ita1Dao;
	
	@Autowired
	ItaRestaurant2Dao ita2Dao;
	
	@Autowired
	OrdersDao orderDao;
	
	@Autowired
	DeliveryExecutiveDao deDao;
	
	@Autowired(required=true)
	PayDao payDao;
	
	
	static HashMap<Integer,Integer> IndRest1Orders=new HashMap<Integer,Integer>(); 
	HttpSession s;
	
	@RequestMapping(value="indrest1")
	public ModelAndView IndRest1(HttpServletRequest request,HttpServletResponse response) {
		List<IndianRestaurant1> menuList=ind1Dao.fetchMenu();
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("indrest1");
		mv.addObject("list",menuList);
		mv.addObject("cart","empty");
		
		return mv;
		
	}
	
	@RequestMapping(value="indrest2")
	public ModelAndView IndRest2(HttpServletRequest request,HttpServletResponse response) {
		List<IndianRestaurant2> menuList=ind2Dao.fetchMenu();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("indrest2");
		mv.addObject("list",menuList);
		return mv;
		
	}
	
	@RequestMapping(value="itarest1")
	public ModelAndView ItaRest1(HttpServletRequest request,HttpServletResponse response) {
		List<ItalianRestaurant1> menuList=ita1Dao.fetchMenu();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("itarest1");
		mv.addObject("list",menuList);
		return mv;
	}
	
	@RequestMapping(value="itarest2")
	public ModelAndView ItaRest2(HttpServletRequest request,HttpServletResponse response) {
		List<ItalianRestaurant2> menuList=ita2Dao.fetchMenu();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("itarest2");
		mv.addObject("list",menuList);
		return mv;
		
	}
	

	
	@RequestMapping(value="confirmorderindrest1")
	public ModelAndView confirmOrder(HttpServletRequest request,HttpServletResponse response,Model m) {
		int id=Integer.parseInt(request.getParameter("dish"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		IndianRestaurant1 res=ind1Dao.fetchMenuById(id);
		String name=res.getName();
		int cost=res.getCost();
		int total=(cost*quantity)+50;
		Orders order=new Orders();
		order.setDish_name(name);
		order.setQuantity(quantity);
		order.setResName("Indian Restaurant 1");
		order.setCost(total);
		s=request.getSession();
		s.setAttribute("order", order);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("confirmorder");
		mv.addObject("name",name);
		mv.addObject("quantity",quantity);
		mv.addObject("cart",cost*quantity);
		mv.addObject("cost",total);
		return mv;
		
		
		
	}
	@RequestMapping(value="confirmorderindrest2")
	public ModelAndView confirmOrder2(HttpServletRequest request,HttpServletResponse response) {
		int id=Integer.parseInt(request.getParameter("dish"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		IndianRestaurant2 res=ind2Dao.fetchMenuById(id);
		String name=res.getName();
		int cost=res.getCost();
		int total=(cost*quantity)+50;
		Orders order=new Orders();
		order.setDish_name(name);
		order.setQuantity(quantity);
		order.setResName("Indian Restaurant 2");
		order.setCost(total);
		s=request.getSession();
		s.setAttribute("order", order);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("confirmorder");
		mv.addObject("name",name);
		mv.addObject("quantity",quantity);
		mv.addObject("cart",cost*quantity);
		mv.addObject("cost",total);
		return mv;
		
		
		
	}
	@RequestMapping(value="confirmorderitarest1")
	public ModelAndView confirmOrder3(HttpServletRequest request,HttpServletResponse response) {
		int id=Integer.parseInt(request.getParameter("dish"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		ItalianRestaurant1 res=ita1Dao.fetchMenuById(id);
		String name=res.getName();
		int cost=res.getCost();
		int total=(cost*quantity)+50;
		Orders order=new Orders();
		order.setDish_name(name);
		order.setQuantity(quantity);
		order.setResName("Italian Restaurant 1");
		order.setCost(total);
		s=request.getSession();
		s.setAttribute("order", order);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("confirmorder");
		mv.addObject("name",name);
		mv.addObject("quantity",quantity);
		mv.addObject("cart",cost*quantity);
		mv.addObject("cost",total);
		return mv;
		
		
		
	}
	@RequestMapping(value="confirmorderitarest2")
	public ModelAndView confirmOrder4(HttpServletRequest request,HttpServletResponse response) {
		int id=Integer.parseInt(request.getParameter("dish"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		ItalianRestaurant2 res=ita2Dao.fetchMenuById(id);
		String name=res.getName();
		int cost=res.getCost();
		int total=(cost*quantity)+50;
		Orders order=new Orders();
		order.setDish_name(name);
		order.setQuantity(quantity);
		order.setResName("Italian Restaurant 2");
		order.setCost(total);
		s=request.getSession();
		s.setAttribute("order", order);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("confirmorder");
		mv.addObject("name",name);
		mv.addObject("quantity",quantity);
		mv.addObject("cart",cost*quantity);
		mv.addObject("cost",total);
		return mv;
		
		
		
	}
	
	@RequestMapping(value="/payments",method=RequestMethod.POST)
	public ModelAndView handleform(@RequestParam("card") String card,
			@RequestParam("cardNo") String cardNo,@RequestParam("exp") String exp,@RequestParam("cvv") String cvv,ModelAndView model )
	{
		
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		String date1=date.toString();
		String time1=time.toString();
		Random t=new Random();
		int trans=t.nextInt();
		
		Orders o=(Orders)s.getAttribute("order");
		int amount=o.getCost();
		Confirmation payc=new Confirmation();
		payc.setAmount(amount);
		payc.setDate(date1);
		payc.setTid(trans);
		payc.setName(card);
		payc.setTime(time1);
		payDao.savePayCon(payc);
		orderDao.createOrder(o);
		model.addObject("card",card);
		model.addObject("cardNo",cardNo);
		model.addObject("exp",exp);
		model.addObject("cvv",cvv);
		model.addObject("date",date);
		model.addObject("time",time);
		model.addObject("trans",trans);
		model.addObject("amount",amount);
		
		model.setViewName("ConformCredit");
		return model;		
	}
	
	@RequestMapping(value="/NetBanking",method=RequestMethod.POST)
	public ModelAndView Net(@RequestParam("usname") String usname,
			@RequestParam("psswd") String psswd,ModelAndView model )
	{
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		String date1=date.toString();
		String time1=time.toString();
		Random t=new Random();
		int trans=t.nextInt();
		
		Orders o=(Orders)s.getAttribute("order");
		int amount=o.getCost();
		NetConform nt=new NetConform();
		nt.setAmount(amount);
		nt.setDate(date1);
		nt.setTid(trans);
		nt.setTime(time1);
		nt.setUsername(usname);
		payDao.saveNet(nt);
		orderDao.createOrder(o);
		
		
		model.addObject("usname",usname);
		model.addObject("psswd",psswd);
		model.addObject("date",date);
		model.addObject("time",time);
		model.addObject("trans",trans);
		model.addObject("amount",amount);
		model.setViewName("confirmnet");
		
		return model;		
	}
	
	@RequestMapping(value="tracking")
	public ModelAndView trackOrder() {
		
		try {
		Orders o=(Orders)s.getAttribute("order");
		
		DeliveryExecutive de=deDao.setExecutive(o);
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("trackorder");
		mv.addObject("phone",de.getPhno());
		mv.addObject("name",de.getEname());
		mv.addObject("vehicle",de.getVehicleno());
		mv.addObject("orderid",o.getOid());
		mv.addObject("dname",o.getDish_name());
		mv.addObject("rname",o.getResName());
		mv.addObject("quantity",o.getQuantity());
		return mv;
		}
		catch(Exception e) {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("exception");
			return mv;
		}
	}
	
	
	

}

