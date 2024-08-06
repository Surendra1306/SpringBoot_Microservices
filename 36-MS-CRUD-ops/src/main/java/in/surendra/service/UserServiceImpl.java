package in.surendra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.User;
import in.surendra.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public String saveUser(User user) {
		 repo.save(user);
		return "Successfully saved..";
	}

	@Override
	public List<User> getAllUsers() {
		 List<User> list = repo.findAll();
		return list;
	}

	@Override
	public User getUserById(Integer uid) {
		Optional<User> id = repo.findById(uid);
		if(id.isPresent()) {
			return id.get();
		}
		return null;
	}

	@Override
	public String deleteUserById(Integer uid) {
		 boolean existsById = repo.existsById(uid);
		 if(existsById) {
			 repo.deleteById(uid);
			 return "Successfully deleted";
		 }
		 else {
			 return "ID doesn't exist...";
		 }
	}
}
