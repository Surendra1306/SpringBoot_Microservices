package in.surendra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@GetMapping("/welcome")
	public String getMsg(Model model) {
		model.addAttribute("msg","Welcome to AshokIT");
		return "index";
	}
	
	@GetMapping("/greet")
	@ResponseBody		
	public String getGreet() {
		return "Good Morning Mike,have a nice day...";
	}	
		//Controller+Responsebody = Restcontroller
		// it will return direct response to the client body.we can write at method level and class level
	
	@GetMapping("/welcomes/{name}")	//this path variable can pass at any place in the url to send the data form UI to server
	public String getMsgs(@PathVariable("name") String name,Model model) {
		model.addAttribute("msgs",name+"Welcome to AshokIT...");
		return "indexes";	
	}	//http://localhost:8082/welcomes/ram
	
	@GetMapping("/greets")
	@ResponseBody	//used to send data to server in the form of key-pair value
	 public String getGreets(@RequestParam("name") String name) {
		 return name+"good morning,have a nice day..";
	 }  //http://localhost:8082/welcomes?name=ram   -we can also send multiple parameters
}	//Get request will send the data in the url as a query param,but its not recomended.so we use post req to hide data in url
