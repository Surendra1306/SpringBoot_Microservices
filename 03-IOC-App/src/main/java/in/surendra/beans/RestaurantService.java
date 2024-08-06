package in.surendra.beans;

public class RestaurantService {
	private IPayment payment;
	
	public RestaurantService() {//0-param const is not used for CI,we need parameterised const
		System.out.println("zero param constructor");//by default IOC choose 0-param cont to create obj
	}//by using this target obj will create but DI will not perform,for that we write const-arg tag in xml file
	//To perform CI
	public RestaurantService(IPayment payment) {//take the dependent class obj and store into varaible 
		System.out.println("param constructor is called");
		this.payment=payment;//initializing the varaiable using constructor parameter
	}
	//To perform SI
	public void setPayment(IPayment payment) {  //passing interface implementation object as a parameter to
	//	-setter method and store in the variable.This is called when u specify property tag in xml file
		System.out.println("setter method called");//SI performed
		this.payment=payment;// method parameter(obj) is storing into current class varaible
	}       //--initializing the payment (interface) variable otherwise gives nullpointerexecption
	
	public void processPayment(double amt) {
		boolean status = payment.payBill(amt);
	
	if(status) {
		System.out.println("payment successfull...");
	}
	else {
		System.out.println("payment failed");
	}
		
	}
}
//CI - injecting dependent class obj into target class obj using target class constructor
//SI - injecting dependent class obj into target class obj using target class setter method
// when we perform both ,setter injection will override the constr injection and perform SI .
//setter is reinitialising the value.
//interface reference variable can hold the object of any implement class
