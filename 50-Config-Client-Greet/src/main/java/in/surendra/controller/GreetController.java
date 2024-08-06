package in.surendra.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetController {
	
	@Value("${msg}")
	private String getMsg;
	
	@GetMapping("/message")
	public String getGreetMsg() {
		return getMsg;
	}
}
