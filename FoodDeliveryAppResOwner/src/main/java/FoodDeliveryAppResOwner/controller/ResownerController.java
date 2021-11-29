package FoodDeliveryAppResOwner.controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import FoodDeliveryAppResOwner.entity.*;
import FoodDeliveryAppResOwner.Dao.*;


@Controller
public class ResownerController
{
	@Autowired
	IndRestaurant1Dao ind1Dao;
	
	@Autowired
	IndRestaurant2Dao ind2Dao;
	
	@Autowired
	ItaRestaurant1Dao ita1Dao;
	
	@Autowired
	ItaRestaurant2Dao ita2Dao;
	
	@Autowired
	ResOwnerDao resDao;
	
	@Autowired
	OrdersDao orderDao;
	
	@RequestMapping(value="ownerlogin")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ownerlogin");
		return mv;
	}
	@RequestMapping(value="ownerwelcome")
	public ModelAndView checkLogin(HttpServletRequest request,HttpServletResponse response) {
		String username=request.getParameter("uname");
		String password=request.getParameter("psw");
		ModelAndView mv=new ModelAndView();
		List<ResOwnerEntity> list=resDao.getUserWithUsernameAndPassword(username, password);
	    
		if(list.isEmpty()) {
			mv.setViewName("ownerloginfailed");
		}
		else {
			
			List<ResOwnerEntity> list1=resDao.getrestaurantname(username);
			mv.addObject("res",list1);
			mv.setViewName("ownerwelcome");
			
		}
		return mv;
	
	}
	@RequestMapping(value="indianres1")
	public ModelAndView Indrest1() {
		List<IndianRestaurant1> detailsList=ind1Dao.fetchMenu();
		System.out.println(detailsList);
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",detailsList);
		mv.setViewName("Indianres1");
		return mv;
		
	}
	@RequestMapping(value = "/editindianres1/{id}")
	public ModelAndView editIndres1(@PathVariable("id") int id,@ModelAttribute("userReg") IndianRestaurant1 dto) {
		
		ModelAndView mv = new ModelAndView();
		IndianRestaurant1 editdto=ind1Dao.fetchMenuById(id);
		mv.addObject("editdto",editdto);
		mv.setViewName("editindianres1");
		return mv;
	}
	@RequestMapping(value={"/addindianres1"})
	public String addIndres1(@ModelAttribute("userReg") IndianRestaurant1 dto) {
		return "addindianres1";
	}
	
	
	@RequestMapping(value={"/saveindianres1"})
	public ModelAndView saveIndres1(@ModelAttribute("userReg") IndianRestaurant1 dto) {
		ind1Dao.save(dto);
		List<IndianRestaurant1> detailsList=ind1Dao.fetchMenu();
		System.out.println(detailsList);
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",detailsList);
		mv.setViewName("Indianres1");
		return mv;
	}
	@RequestMapping(value={"editindianres1/saveindianres1"})
	public String editsaveIndres1(@ModelAttribute("userReg") IndianRestaurant1 dto) {
		ind1Dao.save(dto);
		List<IndianRestaurant1> detailsList=ind1Dao.fetchMenu();
		
		return "redirect:/indianres1";
	}
	
	
	@RequestMapping(value = "/deleteindianres1/{id}")
	public String deleteIndres1(@PathVariable("id") int id) {

		ind1Dao.deleteMenu(id);
		return "redirect:/indianres1";
	}
	@RequestMapping(value="indianres2")
	public ModelAndView IndRest2() {
		List<IndianRestaurant2> detailsList=ind2Dao.fetchMenu();
		System.out.println(detailsList);
		ModelAndView mv=new ModelAndView();
		mv.addObject("list2",detailsList);
		mv.setViewName("Indianres2");
		return mv;
		
	}
	@RequestMapping(value = "/editindianres2/{id}")
	public ModelAndView editIndres2(@PathVariable("id") int id,@ModelAttribute("userReg") IndianRestaurant2 dto) {
		
		ModelAndView mv = new ModelAndView();
		IndianRestaurant2 editdto=ind2Dao.fetchMenuById(id);
		mv.addObject("editdto2",editdto);
		mv.setViewName("editindianres2");
		return mv;
	}
	@RequestMapping(value={"/addindianres2"})
	public String addIndres2(@ModelAttribute("userReg") IndianRestaurant2 dto) {
		return "addindianres2";
	}
	@RequestMapping(value={"/saveindianres2"})
	public String saveIndres2(@ModelAttribute("userReg") IndianRestaurant2 dto) {
		ind2Dao.createDish(dto);
		return "redirect:/indianres2";
	}
	
	@RequestMapping(value={"editindianres2/saveindianres2"})
	public String editsaveIndres2(@ModelAttribute("userReg") IndianRestaurant2 dto) {
		ind2Dao.save(dto);
		List<IndianRestaurant2> detailsList=ind2Dao.fetchMenu();
		
		return "redirect:/indianres2";
	}
	
	@RequestMapping(value = "/deleteindianres2/{id}")
	public String deleteIndres2(@PathVariable("id") int id) {

		ind2Dao.deleteMenu(id);
		return "redirect:/indianres2";
	}
	@RequestMapping(value="italianres1")
	public ModelAndView ItaRest1() {
		List<ItalianRestaurant1> detailsList=ita1Dao.fetchMenu();
		System.out.println(detailsList);
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",detailsList);
		mv.setViewName("Italianres1");
		return mv;
		
	}
	@RequestMapping(value = "/edititalianres1/{id}")
	public ModelAndView edititares1(@PathVariable("id") int id,@ModelAttribute("userReg") ItalianRestaurant1 dto) {
		
		ModelAndView mv = new ModelAndView();
		ItalianRestaurant1 editdto=ita1Dao.fetchMenuById(id);
		mv.addObject("editdto",editdto);
		mv.setViewName("edititalianres1");
		return mv;
	}
	@RequestMapping(value={"/additalianres1"})
	public String addItares1(@ModelAttribute("userReg") ItalianRestaurant1 dto) {
		return "additalianres1";
	}
	@RequestMapping(value={"/saveitalianres1"})
	public String saveItares1(@ModelAttribute("userReg") ItalianRestaurant1 dto) {
		ita1Dao.createDish(dto);
		return "redirect:/italianres1";
	}
	
	@RequestMapping(value={"edititalianres1/saveitalianres1"})
	public String editsaveItares1(@ModelAttribute("userReg") ItalianRestaurant1 dto) {
		ita1Dao.save(dto);
		List<ItalianRestaurant1> detailsList=ita1Dao.fetchMenu();
		
		return "redirect:/italianres1";
	}
	
	@RequestMapping(value = "/deleteitalianres1/{id}")
	public String deleteItares1(@PathVariable("id") int id) {

		ita1Dao.deleteMenu(id);
		return "redirect:/italianres1";
	}
	@RequestMapping(value="italianres2")
	public ModelAndView ItaRest2() {
		List<ItalianRestaurant2> detailsList=ita2Dao.fetchMenu();
		System.out.println(detailsList);
		ModelAndView mv=new ModelAndView();
		mv.addObject("list2",detailsList);
		mv.setViewName("Italianres2");
		return mv;
		
	}
	@RequestMapping(value = "/edititalianres2/{id}")
	public ModelAndView edititares2(@PathVariable("id") int id,@ModelAttribute("userReg") ItalianRestaurant2 dto) {
		
		ModelAndView mv = new ModelAndView();
		ItalianRestaurant2 editdto=ita2Dao.fetchMenuById(id);
		mv.addObject("editdto",editdto);
		mv.setViewName("edititalianres2");
		return mv;
	}
	@RequestMapping(value={"/additalianres2"})
	public String addItares2(@ModelAttribute("userReg") ItalianRestaurant2 dto) {
		return "additalianres2";
	}
	@RequestMapping(value={"/saveitalianres2"})
	public String saveItares2(@ModelAttribute("userReg") ItalianRestaurant2 dto) {
		ita2Dao.createDish(dto);
		return "redirect:/italianres2";
	}
	
	@RequestMapping(value={"edititalianres2/saveitalianres2"})
	public String editsaveItares2(@ModelAttribute("userReg") ItalianRestaurant2 dto) {
		ita2Dao.save(dto);
		List<ItalianRestaurant2> detailsList=ita2Dao.fetchMenu();
		
		return "redirect:/italianres2";
	}
	
	@RequestMapping(value = "/deleteitalianres2/{id}")
	public String deleteItares2(@PathVariable("id") int id) {

		ita2Dao.deleteMenu(id);
		return "redirect:/italianres2";
	}
	
	@RequestMapping(value="vieworders/indianres1")
	public ModelAndView viewOrders() {
		
		List<Orders> orders=orderDao.fetchOrderByResName("Indian Restaurant 1");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("vieworders");
		mv.addObject("list",orders);
		return mv;
		
	}
	
	@RequestMapping(value="vieworders/indianres2")
	public ModelAndView viewOrders2() {
	
		List<Orders> orders=orderDao.fetchOrderByResName("Indian Restaurant 2");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("vieworders");
		mv.addObject("list",orders);
		return mv;
		
	}
	
	@RequestMapping(value="vieworders/italianres1")
	public ModelAndView viewOrders3() {
		
		List<Orders> orders=orderDao.fetchOrderByResName("Italian Restaurant 1");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("vieworders");
		mv.addObject("list",orders);
		return mv;
		
	}
	
	@RequestMapping(value="vieworders/italianres2")
	public ModelAndView viewOrders4() {
		
		List<Orders> orders=orderDao.fetchOrderByResName("Italian Restaurant 2");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("vieworders");
		mv.addObject("list",orders);
		return mv;
		
	}


}
