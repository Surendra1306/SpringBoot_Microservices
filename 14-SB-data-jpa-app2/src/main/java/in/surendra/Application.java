package in.surendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.surendra.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpService bean = context.getBean(EmpService.class);

		//bean.saveAllTheEmps();
		
	   // bean.callCustomQuery();
		
	   // bean.callCustomQueryforId();
		
		bean.callCustomBySql();

	}

}
