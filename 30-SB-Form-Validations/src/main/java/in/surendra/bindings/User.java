package in.surendra.bindings;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
	
	@NotEmpty(message="User name is mandatory")
	@Size(min=3,max=15,message="min 3 characters and max 15 characters")
	private String name;
	
	@NotEmpty(message="Mail is mandatory")
	@Email(message="Enter Valid mail id")
	private String mail;
	
	@NotNull(message="phone number is mandatory")
	private long phn;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", mail=" + mail + ", phn=" + phn + "]";
	}
	
}
