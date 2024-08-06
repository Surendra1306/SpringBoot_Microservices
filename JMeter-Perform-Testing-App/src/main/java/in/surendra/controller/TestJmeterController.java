package in.surendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJmeterController {

	@GetMapping("/perform")
	public String checkPerformance() {
		return "Checking perormance of the app using JMeter......";
	}
}
