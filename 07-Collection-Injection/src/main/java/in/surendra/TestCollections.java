package in.surendra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("bean7.xml");
		
		Student st=ctxt.getBean(Student.class);
		
		System.out.println(st);
	}

}
