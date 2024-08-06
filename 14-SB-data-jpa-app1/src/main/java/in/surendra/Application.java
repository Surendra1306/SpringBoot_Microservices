package in.surendra;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.surendra.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpService es = context.getBean(EmpService.class);
		
		es.saveTheEmp();
		
	 	es.saveEmps();
		
	 	es.findEmpl(201);
 
	 	List<Integer> eids = Arrays.asList(201,202);
	 	es.findEmpls(eids);
	// or
   //	es.findEmpls(Arrays.asList(201,202));
		
	 	es.findemps();
		
	 	es.callEmpsOnId();
		
	}

}
