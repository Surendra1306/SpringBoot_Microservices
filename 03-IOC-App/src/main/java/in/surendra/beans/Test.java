package in.surendra.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		RestaurantService restaservice = context.getBean(RestaurantService.class);
		
	//	RestaurantService restaservice2 = ()context.getBean("cp");  --- Another way to get the bean object
	//	restaservice2.processPayment(1300);
		
		restaservice.processPayment(1200);
	}

}
