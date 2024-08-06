package in.surendra.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {
	
	public String printWelcomeMsg() {
		String msg="Welcome to Banglore...";
		return msg;
	}
	
	public String printGreetMsg() {
		String msg="Good Morning...";
		return msg;
	}

}
