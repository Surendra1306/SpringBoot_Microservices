package in.surendra.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "welcome to my secured application";
	}
//in login page user name is defaultly user and pwd is on console
	//you can configure your username and pwd in app.prop
	//you have to pass those details in postman ->authorisation ->user name & pwd
}
