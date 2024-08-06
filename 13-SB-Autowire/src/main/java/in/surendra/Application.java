package in.surendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.surendra.beans.Robot;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Robot robot = context.getBean(Robot.class);
		robot.task();
		
													//use @Scope="prototype" at class level
		//Robot robot1 = context.getBean(Robot.class);  --- to check for (bean scope) prototypes that how many objects will create
		//System.out.println(robot1.hashCode());
		
		//Robot robot2 = context.getBean(Robot.class);  --- to check for prototypes that how many objects will create
				//System.out.println(robot2.hashCode());
	}

}
