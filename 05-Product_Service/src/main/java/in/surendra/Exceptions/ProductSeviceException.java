package in.surendra.Exceptions;

public class ProductSeviceException extends RuntimeException{
	
	private String errCode;
	
	
	public ProductSeviceException(String msg, String errCode) {
		
		super(msg);
		this.errCode = errCode;
	}


	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	
	
}
