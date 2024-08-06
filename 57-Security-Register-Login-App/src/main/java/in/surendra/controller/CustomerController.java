package in.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import in.surendra.entity.Customer;
import in.surendra.repo.CustomerRepo;
import in.surendra.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private PasswordEncoder pwdEncoder;
	
	@Autowired
	private CustomerService service;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@PostMapping("/register")
	public ResponseEntity<String> userRegister(@RequestBody Customer customer){
		String encodedPwd = pwdEncoder.encode(customer.getPwd());
		customer.setPwd(encodedPwd);
		repo.save(customer);
		return new ResponseEntity<String>("User registered successfully....",HttpStatus.CREATED);
	}
	
	public ResponseEntity<String> userLogin(@RequestBody Customer customer){
		UsernamePasswordAuthenticationToken token =
				new UsernamePasswordAuthenticationToken(customer.getEmail(), customer.getPwd());
		
		try {
			Authentication auth = authManager.authenticate(token);
			if(auth.isAuthenticated()) {
				return new ResponseEntity<String>("Login Successfull......",HttpStatus.OK);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Login Failed....try again",HttpStatus.UNAUTHORIZED);
	}
	
}




