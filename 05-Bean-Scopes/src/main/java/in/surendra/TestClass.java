package in.surendra;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		
	  ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
	  
	// PswdService serv1 = context.getBean(PswdService.class);
	 
	//PswdService serv2 = context.getBean(PswdService.class);
	 
	// System.out.println(serv1.hashCode());  --to know how many objects are created  -for singleton only one obj will be created
	// System.out.println(serv2.hashCode());		--for prototype multiple objects will be crated -- eager loading 
	 
	// String encodedpwd = serv1. encodePassword("Suri@123");
	 
    //System.out.println(encodedpwd);
	 
	 Engine en = context.getBean(Engine.class);    
	 en.performTask();
	// ConfigurableApplicationContext cn=new (ConfigurableApplicationContext)context;
	 //cn.close();
	 context.close();
	 
	}

}
