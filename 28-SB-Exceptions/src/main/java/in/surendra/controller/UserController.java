package in.surendra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String userMsg(Model model) {
		
		String str=null;
		str.length();
		model.addAttribute("msg","Another execption in another controller");
		//This controller message will rise execption ,it will not handle by controller execp.we need global exception to handle this
		return "index";
		}

}
