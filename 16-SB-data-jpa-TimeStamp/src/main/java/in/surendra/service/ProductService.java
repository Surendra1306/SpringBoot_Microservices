package in.surendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.Product;
import in.surendra.repo.ProductRepo;

@Service
public class ProductService {
	 
	@Autowired
	private ProductRepo repo;
	
	public void getPdts() {
		
		Product prod=new Product();
		
	 
		prod.setProdName("mouse");
		prod.setProdPrice(230);
		
		repo.save(prod);
		
		System.out.println("Product saved...");
	}
}
