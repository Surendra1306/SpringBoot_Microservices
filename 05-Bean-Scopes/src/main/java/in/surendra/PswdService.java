package in.surendra;

import java.util.Base64;

public class PswdService {
	
	
	
	public PswdService() {
	 System.out.println("0-param constructor..");
		 
	}

	public String encodePassword(String pwd) {
		
		java.util.Base64.Encoder encoder=Base64.getEncoder();

		byte[] encodedPassword = encoder.encode(pwd.getBytes());
		
		return new String(encodedPassword);

	}

}
