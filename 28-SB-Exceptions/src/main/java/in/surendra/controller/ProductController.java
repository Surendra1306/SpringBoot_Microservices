package in.surendra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.surendra.exceptions.ProducNotFoundException;

@Controller
public class ProductController {
	
	@GetMapping("/product")
	public String handleUserDefinedExep() {
		try {
			throw new ProducNotFoundException("Entered invalid data....");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "exview";
	}
	
}
