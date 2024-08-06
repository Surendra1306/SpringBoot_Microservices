package in.surendra.exceptions;

import java.time.LocalDate;

public class Exmsg {
	
	private String excode;
	private String msg;
	private LocalDate exdate;
	
	public String getExcode() {
		return excode;
	}
	public void setExcode(String excode) {
		this.excode = excode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDate getExdate() {
		return exdate;
	}
	public void setExdate(LocalDate exdate) {
		this.exdate = exdate;
	}
	
	

}
