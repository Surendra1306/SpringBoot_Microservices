package in.surendra.beans;

import org.springframework.stereotype.Component;

@Component("chip64")//bean name should be matched with varaible name for byname autowiring
public class Chip64Bit implements Ichip {
 
	public Chip64Bit() {
	 System.out.println("64 bit :: constructor");
	}

	@Override
	public boolean processTask() {
		 System.out.println("64 bit chioi processing.....");
		return  true;
	}

}
