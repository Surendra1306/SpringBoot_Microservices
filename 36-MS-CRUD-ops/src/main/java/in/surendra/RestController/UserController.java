package in.surendra.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.surendra.entity.User;
import in.surendra.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping(value="/savedUser", consumes="application/json")
	public ResponseEntity<String> createUser(@RequestBody User user){
		String status = service.saveUser(user);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/user/{uid}")
	public ResponseEntity<User> getUser(@PathVariable Integer uid){
		User userById = service.getUserById(uid);
		return new ResponseEntity<>(userById,HttpStatus.OK);
	}
	
	@GetMapping(value="/users", produces="application/json")
	public ResponseEntity<List<User>> getUsers(){
		List<User> allUsers = service.getAllUsers();
		return new ResponseEntity<>(allUsers,HttpStatus.OK);
	}

	@PutMapping(value="/upsertUser")
	public ResponseEntity<String> updateUser(@RequestBody User user){
		String updatedUser = service.saveUser(user);
		return new ResponseEntity<>(updatedUser,HttpStatus.OK);
	}
	
	@DeleteMapping("/removeUser/{uid}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer uid){
		String deleteById = service.deleteUserById(uid);
		return new ResponseEntity<>(deleteById,HttpStatus.OK);
	}
}