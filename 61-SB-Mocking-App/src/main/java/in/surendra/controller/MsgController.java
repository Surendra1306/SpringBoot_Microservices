package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.surendra.service.MsgService;

@RestController
public class MsgController {

	@Autowired
	private MsgService msgService;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String welcomeMsg = msgService.printWelcomeMsg();
		welcomeMsg = welcomeMsg.toUpperCase();
		return welcomeMsg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetMsg = msgService.printGreetMsg();
		greetMsg=greetMsg.toLowerCase();
		return greetMsg;
	}
	
	
	//create mock components in test/java folder and run as jUnit test
	//for code coverage, add 'jacoco' plugin in pom.xml and run as 'maven test',
	//then goto project folder target ->site ->jacoco ->index.html
}









