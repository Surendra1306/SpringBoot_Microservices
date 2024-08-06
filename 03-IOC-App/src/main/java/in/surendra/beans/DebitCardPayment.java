package in.surendra.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("DebitCard:constructer created");
	}

	@Override
	public boolean payBill(double amt) {
		 System.out.println("Debitcard Payment done...");
		return true;
	}
	
}
