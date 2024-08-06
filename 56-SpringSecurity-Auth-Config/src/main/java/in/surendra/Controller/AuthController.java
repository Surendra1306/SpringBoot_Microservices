package in.surendra.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping("/deposit")
	public String depositMoney() {
		return "Money deposited successfully....";
	}
	
	@GetMapping("/withdraw")
	public String withdrawMoney() {
		return "Money withdrawed successfully....";
	}

	@GetMapping("/about")
	public String aboutUs() {
		return "We are the leading bank service providers....";
	}
	
	@GetMapping("/contact")
	public String contactUs() {
		return "contact to our number for more information.....";
	}

}
