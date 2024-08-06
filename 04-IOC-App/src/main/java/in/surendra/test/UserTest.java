package in.surendra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
    // UserService us = context.getBean(UserService.class);
    //	String name= us.getName(101);
	//	System.out.println(name);
	}

}
