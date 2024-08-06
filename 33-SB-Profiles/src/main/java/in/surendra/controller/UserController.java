package in.surendra.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@Value("${msg}")
	private String msgTxt;
	
	@ResponseBody
	@GetMapping("/")
	public String getMsg() {
		return msgTxt;
	}

}
