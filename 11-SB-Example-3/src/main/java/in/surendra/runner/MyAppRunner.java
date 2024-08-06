package in.surendra.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyAppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//  uses logic to execute only once at time of running application
		//logic comes here
		System.out.println("My App running here....");
	}

}
