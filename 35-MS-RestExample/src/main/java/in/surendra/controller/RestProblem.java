package in.surendra.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestProblem {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Banglore.....";
	}
	
	@PostMapping("/date")
	public String getdate(){
		LocalDate now = LocalDate.now();
		return String.valueOf(now);
	}
	
	@GetMapping("/greet/{name}")
	public String getGreet(@PathVariable("name") String name) {
		return name+" ,Good Morning...";
	}
	
	@GetMapping("/wish")
	public String getWishes(@RequestParam("name") String name) {
		return name+", Happy new Year";
	}
	
	@GetMapping(value="/msg", produces="text/plain")
	public ResponseEntity<String> getStudent(){
		String str="This is Rest Api Example...";
		return new ResponseEntity<>(str,HttpStatus.ACCEPTED);
	}

}
