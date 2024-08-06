package in.surendra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.surendra.bindings.User;
import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String loadUser(Model model) {
		model.addAttribute("user",new User());
		return "index";
	}
	
	@PostMapping("/user")
	public String loadDetails(@Valid User user,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "index";
		}
		else {
			System.out.println(user);
			model.addAttribute("msg","saved successfully....");
			return "index";
		}
	}

}
