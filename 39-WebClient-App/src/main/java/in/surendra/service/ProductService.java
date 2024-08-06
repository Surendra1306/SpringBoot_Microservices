package in.surendra.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.surendra.response.Product;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	public Mono<Product[]> getProducts(){
		
		String apiUrl="https://api.restful-api.dev/objects";
		
		WebClient webClient = WebClient.create();
		Mono<Product[]> body = webClient.get()//send the get request
				 .uri(apiUrl) //provider url
				 .retrieve() //get response body
				 .bodyToMono(Product[].class);
		System.out.println(body);
		return body;
	}
	
public Mono<Product> getProduct(){
		
		String apiUrl="https://api.restful-api.dev/objects/1";
		
		WebClient webClient = WebClient.create();
		Mono<Product> body = webClient.get() 
				 .uri(apiUrl)  
				 .retrieve()  
				 .bodyToMono(Product.class);
		System.out.println(body);
		return body;
	}

}
