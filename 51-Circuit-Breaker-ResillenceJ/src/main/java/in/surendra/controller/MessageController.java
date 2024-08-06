package in.surendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MessageController {
	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDb",name="surendraApp")
	public String getDataFromRedis() {
		System.out.println("*******Redis method executed*******");
		
		//logic to connect redis
		int i=10/0;
		return "Data fetched from Redis database......";
	}
	
	public String getDataFromDb(Throwable t) {
		System.out.println("*******db method called*********");
		//logic to connect with db
		return "Data fetched from DB server.......";
	}
}