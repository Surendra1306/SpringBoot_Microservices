package in.surendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.surendra.Bindings.Order;
import in.surendra.Constants.AppConstants;

@Service
public class OrderService {
	
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	public String createOrder(Order order) {
		kafkaTemplate.send(AppConstants.ORDER_TOPIC,order);
		return "order message puiblished to kafka topic successfully";
	}
	
	//to send another topic 
//	public String sendMessage(Payment pay) {
//		kafkaTmplate.send(AppConstants.PAYMENT_TOPIC,pay);
//		return "payment message published to kafka topic successfuly";
//	}

}
