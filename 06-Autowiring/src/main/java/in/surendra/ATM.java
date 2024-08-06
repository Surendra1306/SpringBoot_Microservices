package in.surendra;

public class ATM {
	
	private IPrinter printer;
	
	public ATM() {
		System.out.println("ATM -- constructor");
	}
	
	public ATM(IPrinter printer) {
		System.out.println("param constructor...");
		this.printer = printer;
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}
	
	public void withdraw() {
		System.out.println("ATM printing started...");
		printer.print();
	}
	
	

}
