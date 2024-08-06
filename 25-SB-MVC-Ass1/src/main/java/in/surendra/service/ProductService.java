package in.surendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.bindings.Product;
import in.surendra.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;


	public Product setAll(Product p) {
		
		return productRepo.save(p);
	}

	public List<Product> getprods() {
		List<Product> prodlist = productRepo.findAll();
		return prodlist;
	}
}
