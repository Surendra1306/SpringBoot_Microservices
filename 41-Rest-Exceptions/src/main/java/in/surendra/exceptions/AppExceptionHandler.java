package in.surendra.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	 public ResponseEntity<Exmsg> getexception(Exception e){
		
		// String msg =  e.getMessage();
		// return new ResponseEntity<>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
		 
		 Exmsg em=new Exmsg();
		 em.setExcode("GJS783191");
		 em.setMsg(e.getMessage());
		 em.setExdate(LocalDate.now());
		 
		 return new ResponseEntity<>(em,HttpStatus.INTERNAL_SERVER_ERROR);
	 }
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<Exmsg> getUserdefinedEx(ProductNotFoundException pe){
		Exmsg info=new Exmsg();
		info.setExcode("NJK93209");
		info.setMsg(pe.getMessage());
		info.setExdate(LocalDate.now());
		return new ResponseEntity<Exmsg>(info,HttpStatus.BAD_REQUEST);
	}
}










