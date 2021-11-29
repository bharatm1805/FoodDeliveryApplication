package FoodDeliveryAppResOwner.controller;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import FoodDeliveryAppResOwner.Dao.PayDao;
import FoodDeliveryAppResOwner.entity.Payment;
import FoodDeliveryAppResOwner.entity.Orders;

@Controller
@SessionAttributes("cost")
public class PayController {
	
	@Autowired(required=true)
	PayDao payDao;
	
	@RequestMapping(value="/payment",method=RequestMethod.POST)
	public ModelAndView pay(@RequestParam("email") String email,
			@RequestParam("pass") String pass,@RequestParam("name") String name,@RequestParam("cno") String cno,@RequestParam("cvv") int cvv,@RequestParam("date") String date,ModelAndView model )
	{
		
		model.setViewName("payment");
		return model;
			
	}
	@RequestMapping(value="/pay",method=RequestMethod.POST)
	public ModelAndView paysave(@RequestParam("email") String email,
			@RequestParam("pass") String pass,@RequestParam("name") String name,@RequestParam("cno") String cno,@RequestParam("cvv") int cvv,@RequestParam("date") String date,ModelAndView model )
	{
		Payment p=new Payment();
		p.setCardholder(name);
		p.setCardno(cno);
		p.setGmail(email);
		p.setPassword(pass);
		p.setCvv(cvv);
		p.setDate(date);
		
		
		this.payDao.save(p);
		model.setViewName("payment1");
		return model;
		
		
		
		
		
			
	}
	
	@RequestMapping("/payfill")
	public String payw()
	{
		return "payfill";
	}
	@RequestMapping("/paylogin")
	public String login()
	{
		return "paylogin";
	}
	

	
	
	
	@RequestMapping(value="/Cre",method=RequestMethod.POST)
	public String Cre(@RequestParam("uname") String uname,
			@RequestParam("pswd") String pswd,Model m)
	{
		
		return "CreditCards";
	}
	
	
	
	
	@RequestMapping("/ConformCredit")
	public String ConformCredit()
	{
		return "ConformCredit";
	}
	
	
	
	@RequestMapping("/successing")
	public String success()
	{
		return "paymentsuccess";
	}
	
	@RequestMapping("/sbi")
	public String sbi()
	{
		return "sbi";
	}
	
	@RequestMapping("/payment")
	public String Payment()
	{
		
		return "payment";
	}
	

	
	@RequestMapping("/DebitCard")
	public String DebitCard()
	{
		
		return "DebitCard";
	}
	@RequestMapping("/cash")
	public String cash()
	{
		
		return "cash";
	}
	
	
	@RequestMapping("/CreditCards")
	public String CreditCards()
	{
		
		return "CreditCards";
	}
	
	

	
}
