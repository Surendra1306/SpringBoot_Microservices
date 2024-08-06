package in.surendra.WelcomeClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="WelcomeMsg-ClientApp") // this is the app name
public interface WelcomeApiClient {
	
	@GetMapping("/welcome") //this is the url to access welcome message
	public String invokeWelcomeApi();
}

//feignclient used for interservice communication.to communicate one microserevice with another microsevces 
//add openfeign client dependency