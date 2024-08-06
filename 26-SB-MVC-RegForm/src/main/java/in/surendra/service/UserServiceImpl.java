package in.surendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.User;
import in.surendra.repository.UserRepository;
import in.surendra.utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;
	@Autowired
	private EmailUtils emailUtils;

	@Override
	public boolean saveUser(User user) {
		User savedUser = repository.save(user);
		if(savedUser!=null) {
			String subj="Your account was successfully created";
			String body = "<h2>Welcome to our Institute..</h2>";
			emailUtils.sendEmail(user.getuserMail(), subj, body);
			return true;
		}
		return false;
	}
	
	@Override
	public User getUser(String userMail, String userPwd) {
		return repository.findByUserMailAndUserPwd(userMail, userPwd);	 
	}

//	@Override
//	public User getMail(String userMail) {
//		return repository.findBYUserMail(userMail);
//	}
}
