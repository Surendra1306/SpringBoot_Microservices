package in.surendra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@GetMapping("/")
	@ResponseBody
	public String getMsg() {
		return "Hi,Good moring..";
	}
}


//management.endpoints.web.exposure.include=*		- localhost:8081/actuators/mappings

//management.endpoints.web.exposure.exclude=beans	- localhost:8081/actuators/beans

//management.endpoint.shutdown.enabled=true			- localhost:8081/actuator/shutdown