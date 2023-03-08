package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
	
	@RequestMapping("/contact")
	public String showForm()
	{
		
		return "contact";
	}
	
	
	//@RequestMapping(path="/processform", method= RequestMethod.POST)
	//public String handleForm(HttpServletRequest request)
	//{
	//	String email =request.getParameter("email");
		//
		//System.out.println("user email is" +email);
		
		//return"";
	//}
	
	@RequestMapping(path="/processform", method= RequestMethod.POST)
	public String handleForm (@ModelAttribute User user ,Model model)
	{
		
		return "success";		
	}
	
	
	

}
;
