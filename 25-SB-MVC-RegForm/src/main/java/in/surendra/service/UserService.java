package in.surendra.service;

import in.surendra.entity.User;

public interface UserService {
	
	public boolean saveUser(User user);
	
	public User getUser(String userMail,String userPwd);

}
