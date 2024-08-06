package in.surendra.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.surendra.response.Product;

@Service
public class ProductService {
	
	public void getProducts() {
		
		String apiUrl = "https://api.restful-api.dev/objects";
		
		RestTemplate template = new RestTemplate();  //disadv is when heavy req is coming, it willn't handle,so we go for feignclient
													 //url is tightly coupled
		ResponseEntity<Product[]> entity = template.getForEntity(apiUrl, Product[].class);
		
		int value = entity.getStatusCode().value();
		
		if(value==200) {
			 Product[] body = entity.getBody();
			 for (Product p : body) {
				System.out.println(p);
			}
		}
	}
	
	public Product getProduct(String productId) {
		
		String apiUrl = "https://api.restful-api.dev/objects/"+productId;
						 
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Product> entity = restTemplate.getForEntity(apiUrl, Product.class);
		
		int statusCode = entity.getStatusCode().value();
		
		if(statusCode==200) {
			 return entity.getBody();
			}
		return null;
	}

}
