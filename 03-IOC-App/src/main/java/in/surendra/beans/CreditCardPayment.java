package in.surendra.beans;

public class CreditCardPayment implements IPayment {
	
	CreditCardPayment(){
		System.out.println("Creditcard constructor created");
	}

	@Override
	public boolean payBill(double amt) {
		 System.out.println("credit card payment done...");
		return true;
	}
}
