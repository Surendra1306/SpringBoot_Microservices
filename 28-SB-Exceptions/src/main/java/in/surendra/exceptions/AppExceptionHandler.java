package in.surendra.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice   // its a global based exception handler -- it handles exceptions occur in all the controller classes
public class AppExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public String handleExcept(Exception e) {
		// logic comes here
		return "exview";
	}
	
	@ExceptionHandler(ProducNotFoundException.class)
	 public String handleProdExcep(ProducNotFoundException pe) {
		return "exview";
	}
}
