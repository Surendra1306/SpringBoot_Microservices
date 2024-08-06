package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import in.surendra.entity.User;
import in.surendra.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl service;

	@GetMapping("/login")
	public String loadLogin(Model model) {
		model.addAttribute("user1", new User());
		return "login";
	}

	@PostMapping("/login")
	public String saveLogin(@ModelAttribute("user1") User user, Model model) {
		User userObj = service.getUser(user.getuserMail(), user.getuserPwd());		
		if (userObj != null) {
			model.addAttribute("succmsg",  "Hi," + userObj.getuserName() + " Welcome to AshokIt.." );
			return "dashboard";
		} else {
			model.addAttribute("errmsg", "login Failed..Enter valid data...");
			return "login";
		}
	}

	@GetMapping("/registerPage")
	public String loadRegister(Model model) {
		model.addAttribute("user2", new User());
		return "register";
	}

	@PostMapping("/registerPage")
	public String getRegister(User user, Model model) {
		
//	 String getexistMail = user.getuserMail();
//				if(getexistMail!=null) {
//			model.addAttribute("extmsg" , "E-mail already registered");
//			return "register";
//		}
		
		boolean su = service.saveUser(user);
		model.addAttribute("user2", new User());
		if (su) {
			model.addAttribute("msg1", "Successgully registered");
		} else {
			model.addAttribute("msg2", "Registration Failed");
		}
		return "register";
	}

	@GetMapping("/logout")
	public String loadDashboard(Model model) {
		model.addAttribute("user3", new User());
		return "login";
	}
}
