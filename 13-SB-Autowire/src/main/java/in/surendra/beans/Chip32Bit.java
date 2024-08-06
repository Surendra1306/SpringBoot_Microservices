package in.surendra.beans;

import org.springframework.stereotype.Component;

//@Primary			//autowire byType
@Component("chip32")  // autowire byName
public class Chip32Bit implements Ichip {
	
	
	public Chip32Bit() {
		 System.out.println("32 bit :: constructor");
	}

	@Override
	public boolean processTask() {
		 System.out.println("32 bit chip processing....");
		return true;
	}

}
