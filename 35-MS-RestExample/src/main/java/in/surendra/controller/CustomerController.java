package in.surendra.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.surendra.entity.Customer;

@RestController
public class CustomerController {
	
	@GetMapping(value="/customer" ,produces="application/json")
	public ResponseEntity<Customer> getcustomer(){
		Customer c1=new Customer(10,"Samson","samson@gmail.com");
		 
		return new ResponseEntity<>(c1,HttpStatus.OK);
	}
	
	@GetMapping(value="/customersData", produces="application/json")
	public ResponseEntity<List<Customer>> getcustomers(){
		Customer c1=new Customer(10,"Samson","samson@gmail.com");
		Customer c2=new Customer(11,"Kohli","kohli@gmail.com");
		Customer c3=new Customer(12,"Jadeja","jadeja@gmail.com");
		Customer c4=new Customer(13,"Ashwin","ashwin@gmail.com");
		
		List<Customer> clist = Arrays.asList(c1,c2,c3,c4);
		return new ResponseEntity<>(clist,HttpStatus.OK);
	}
	
	@PostMapping(value="/customerSaved", consumes="application/json")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer c){	//to get data from the body of the consumer
		System.out.println(c);
		return new ResponseEntity<String>("customer saved..", HttpStatus.OK);
	}
	
	@DeleteMapping(value="/customerDelete/{cid}", produces="text/plain")	//localhost:8081/customerDelete/1
	public ResponseEntity<String> removeCustomer(@PathVariable("cid") Integer cid){
		return new ResponseEntity<>("Successfully deleted the record", HttpStatus.OK);
	}
	
	@PutMapping(value="/customerUpdate",
			produces="text/plain",
			consumes="application/json")
	public ResponseEntity<String> resetCustomer(@RequestBody Customer c){
		return new ResponseEntity<>("updated successfully..", HttpStatus.OK);
	}
	
 
	//we use swagger dependency to get the documentation of rest api
	//goto browser and access -> http://localhost:8081/swagger-ui/index.html
}
