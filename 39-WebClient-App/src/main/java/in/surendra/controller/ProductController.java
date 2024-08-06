package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.surendra.response.Product;
import in.surendra.service.ProductService;
import reactor.core.publisher.Mono;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<Mono<Product[]>> getAllProducts(){
		Mono<Product[]> product = service.getProducts();
		return new ResponseEntity<Mono<Product[]>>(product,HttpStatus.OK);
	}
	
	@GetMapping("/product")
	public ResponseEntity<Mono<Product>> getProduct(){
		Mono<Product> product = service.getProduct();
		return new ResponseEntity<Mono<Product>>(product,HttpStatus.OK);
	}
}
