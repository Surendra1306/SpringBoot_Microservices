package in.surendra.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") -- by default it is singleton .if u want u can make prototype by using this annotation 
public class Robot {
	
	
	//@Qualifier("Chip32Bit") -- used for Autowire byType .it will identify the type of the (interface)variable data type
	//private Ichip chip; 			//and it have multiple implementing classes and you have to specify
						//to resolve ambiguity another way to specify called @primary
	//or 
	
	//@Qualifier		-- use @primary annotation in any of the class that you want to give priority
	//private Ichip chip;
	
	@Autowired
	private Ichip chip32;// variable name must be matched with bean class names.first prioirity will be given to byName
	 
	 public Robot() {
	 System.out.println("robot :: constructor");
	}
	 
	 public void task() {
		 
		 System.out.println("Injected::"+ chip32.getClass().getName());
		 boolean status = chip32.processTask();
		 
		 if(status) {
			 System.out.println("Processer is working....");
		 }
		 else {
			 System.out.println("Processer is not working....");
		 }
	 }

}
