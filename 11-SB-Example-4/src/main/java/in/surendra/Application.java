package in.surendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.surendra.dao.UserDao;
import in.surendra.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
	//	UserDao ud = context.getBean(UserDao.class);
	//  String name=ud.findName(100);	
	//	System.out.println(name);
		
		UserService us=context.getBean(UserService.class);
		
		us.fetchName(100);
 
		
	}

}
