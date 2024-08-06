package in.surendra;

public class HpPrinter implements IPrinter {
	
	public HpPrinter() {
		System.out.println("HpPrinter -- constructor");
	}

	@Override
	public void print() {
		 System.out.println("HpPrinter  -- printed");

	}

}
