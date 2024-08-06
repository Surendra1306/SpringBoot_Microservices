package in.surendra.service;

import java.util.List;

import in.surendra.entity.User;

public interface UserService {
	
	public String saveUser(User user);
	
	public List<User> getAllUsers();
	
	public User getUserById(Integer uid);
	
	public String deleteUserById(Integer uid);
	
}
