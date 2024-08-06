package in.surendra.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.surendra.entity.Product;

@RestController
public class ProductController {

	
	@PostMapping("/product")
	public ResponseEntity<String> saveProduct(@RequestBody Product p){
		System.out.println(p);
		//logic
		return new ResponseEntity<String>("product saved....",HttpStatus.CREATED);
	}
}
