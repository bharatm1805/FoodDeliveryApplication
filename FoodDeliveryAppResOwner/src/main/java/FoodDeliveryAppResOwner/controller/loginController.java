package FoodDeliveryAppResOwner.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import FoodDeliveryAppResOwner.Dao.UserDao;
import FoodDeliveryAppResOwner.entity.User;

import java.util.List;

@Controller
public class loginController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value="signup",method=RequestMethod.GET)
	public ModelAndView signup() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("signup");
		return mv;
	}
	
	@RequestMapping(value="signupsuccess",method=RequestMethod.GET)
	public ModelAndView signupSuccess(HttpServletRequest request,HttpServletResponse response) {
		String name=request.getParameter("name");
		String mobileNumber=request.getParameter("mobile_no");
		String address=request.getParameter("address");
		String password=request.getParameter("psw");
		String confirmPassword=request.getParameter("confirm_password");
		String username=request.getParameter("username");
		User u=new User(name,username,password,confirmPassword,mobileNumber,address);
		userDao.createUser(u);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("signupsuccess");
		return mv;
	}
	
	@RequestMapping(value="login")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value="welcome")
	public ModelAndView checkLogin(HttpServletRequest request,HttpServletResponse response) {
		String username=request.getParameter("uname");
		String password=request.getParameter("psw");
		ModelAndView mv=new ModelAndView();
		List<User> list=userDao.getUserWithUsernameAndPassword(username, password);
		if(list.isEmpty()) {
			mv.setViewName("loginfailed");
		}
		else {
			mv.setViewName("welcome");
		}
		return mv;
	}
	
	@RequestMapping(value="home")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
	
	@RequestMapping(value="logout")
	public ModelAndView logout() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("logout");
		return mv;
	}

}

