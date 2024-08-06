package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.surendra.entity.User; 
import in.surendra.service.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	@GetMapping("/login")
	 public String loadLogin(Model model) {
		 model.addAttribute("user1", new User());
		return "login";	 
	 }
	
	@PostMapping("/loginPage")
	public String saveLogin(Model model,User user) {
	 User userObj = service.getUser(user.getuserMail(), user.getuserPwd());
	 
	 if(userObj!=null) {
		 model.addAttribute("succmsg","Hi,"+ user.getuserName() +"Welcome to AshokIt..");
		 return "dashboard";
	 }
	 else {
		 model.addAttribute("errmsg","login Failed..Enter valid data...");
		 return "login";
	 }
		
	}
	
	@GetMapping("/registerPage")
	public String loadRegister(Model model) {
		model.addAttribute("user2", new User());
		return "register";
	}
	
	@PostMapping("/registerPage")
	public  String getRegister(User user,Model model) {
		boolean su = service.saveUser(user);
		if(su) {
			model.addAttribute("msg1","Successgully registered");
		}
		else{
			model.addAttribute("msg2","Registration Failed");
		}
		return "register";
	}
	
	@GetMapping("/logout")
	public String loadDashboard(Model model) {
		model.addAttribute("user3",new User());
		return "login";
	}
	
}
