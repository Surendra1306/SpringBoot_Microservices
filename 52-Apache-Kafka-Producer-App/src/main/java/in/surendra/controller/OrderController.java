package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.surendra.Bindings.Order;
import in.surendra.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/order")
	public String placeOrder(Order order) {
		return service.createOrder(order);
	}
}
