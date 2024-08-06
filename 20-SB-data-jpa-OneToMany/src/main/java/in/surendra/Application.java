package in.surendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.surendra.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		StudentService bean = context.getBean(StudentService.class);
		
		bean.savePerson();
		bean.getAddress();
		bean.removePerson();
	}

}
