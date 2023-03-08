package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		
		
		System.out.println("this is home url");
		model.addAttribute("name","krishna kashid");
		model.addAttribute("id",44);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Roshni");
		friends.add("Tej");
		friends.add("saga");
		
		model.addAttribute("f",friends);
		
		
		
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about()
	{
		
		System.out.println("this is about controller");
		return "about";
		
		
	}
	
	
	

}
