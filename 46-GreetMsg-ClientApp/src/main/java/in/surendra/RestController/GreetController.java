package in.surendra.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.surendra.WelcomeClient.WelcomeApiClient;

@RestController
public class GreetController {
	
	@Autowired
	private WelcomeApiClient apiclient;
	
	@Autowired
	private Environment env;

	@GetMapping("/greet")
	public String getGreet() {
		
		String msg="Hello...,Good Morning...";
		
		String api = apiclient.invokeWelcomeApi();
		
		String port = env.getProperty("server.port");
		
		return api +",,,"+ msg+"="+port;
	}
}
