package in.surendra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.surendra.bindings.Product;
import in.surendra.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	@GetMapping("/")
	public ModelAndView loadForm() {

		ModelAndView mv = new ModelAndView();

		mv.addObject("productObj", new Product());
		mv.setViewName("index");
		return mv;
	}

	@PostMapping("/product")
	public ModelAndView saveTheProducts(Product product) {
		ModelAndView mv = new ModelAndView();
		service.setAll(product);
		mv.addObject("product","records saved sucessfully..");
		mv.setViewName("data");
		return mv;
	}

	@GetMapping("/product")
	public ModelAndView getTheProducts(Product product) {

		ModelAndView mv = new ModelAndView();
		List<Product> list = service.getprods();
		mv.addObject("msg1", list);
		mv.setViewName("display");
		return mv;
	}

}
