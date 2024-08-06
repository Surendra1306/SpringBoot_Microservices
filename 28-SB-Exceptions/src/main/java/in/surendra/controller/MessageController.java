package in.surendra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MessageController {
	
	@GetMapping("/message")
	public String getMsg(Model model)
	{
	 int i=10/0;
	model.addAttribute("msg", "This is my Index page");
	return "index";
	}
	
//	class based execptiion handler
//	@ExceptionHandler(value=ArithmeticException.class)
//	public String getexecption(ArithmeticException ae)//exexption occus at above method and return this method
//	{
//	return "exview";
//	}
	
	@GetMapping("/greet")
	public String getWishes(Model model)
	{
	  
	model.addAttribute("msg", "Happy new Year");
	return "index";
	}
}
