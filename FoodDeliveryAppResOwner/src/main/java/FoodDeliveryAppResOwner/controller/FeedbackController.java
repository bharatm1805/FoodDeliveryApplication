package FoodDeliveryAppResOwner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import FoodDeliveryAppResOwner.Dao.FeedbackDao;
import FoodDeliveryAppResOwner.entity.FeedbackEntity;




@Controller
public class FeedbackController
{
	@Autowired
	FeedbackDao fbDao;
	
	@RequestMapping("/feedback")
	public String registrationPage(@ModelAttribute("userReg") FeedbackEntity dto) {

		return "feedback-page";
	}
	
	@RequestMapping("/viewfeedbacks")
	public ModelAndView displayAllUserDetails(@ModelAttribute("userReg") FeedbackEntity dto) {
		
		fbDao.save(dto);
		ModelAndView mv = new ModelAndView();
		List<FeedbackEntity> list = fbDao.fetchfeedbacks();
		mv.addObject("detailsList", list);
		mv.setViewName("view-feedbacks");
		return mv;
	}
}