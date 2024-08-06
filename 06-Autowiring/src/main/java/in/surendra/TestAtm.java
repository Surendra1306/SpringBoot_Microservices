package in.surendra;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAtm {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("bean6.xml");
		
		 ATM atm = ctxt.getBean(ATM.class);
		 
		 atm.withdraw();
	}

}
