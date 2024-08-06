package in.surendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.surendra.bindings.Order;
import in.surendra.constants.AppConstants;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@KafkaListener(topics = AppConstants.ORDER_TOPIC, groupId = "group_surendra_order")
	public void getMsg(Order order) {
		System.out.println("****Msg received from Kafka Topic");
		System.out.println(order);
	}
}
