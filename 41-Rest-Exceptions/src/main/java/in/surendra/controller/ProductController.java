package in.surendra.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.surendra.bindings.Product;
import in.surendra.exceptions.ProductNotFoundException;

@Controller
public class ProductController {
	
	
	
	@GetMapping(value="/product" )
	public ResponseEntity<Product> getProduct(){
		//int i=10/0;
	 
			Product p=new Product();
		 	p.setId(1);
			p.setName("laptop");
			p.setPrice(30000);
			
			return new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	
//user defined exception
	@GetMapping(value="/product/{id}",produces="application/json")
	public ResponseEntity<Product> getProductId(@PathVariable("id") Integer id) throws Exception{
		//int i=10/0;
		if(id == 2) {
			Product p=new Product();
			p.setId(2);
			p.setName("laptop");
			p.setPrice(30000);
			
			return new ResponseEntity<Product>(p,HttpStatus.OK);
		}
		else {
			throw new ProductNotFoundException("Invalid id");
		}
		
	}
}


