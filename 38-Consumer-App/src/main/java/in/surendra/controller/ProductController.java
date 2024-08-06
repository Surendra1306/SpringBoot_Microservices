package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import in.surendra.response.Product;
import in.surendra.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/")
	public String viewProducts(@ModelAttribute("prod") Product p,Model model) {
		//service.getProducts();
		return "index";
	}
	
	@GetMapping("/product")
	public String viewProduct(@RequestParam("pid") String prodId,Model model) {
		Product product = service.getProduct(prodId);
		model.addAttribute("prod", product);
		return "index";
	}

}
