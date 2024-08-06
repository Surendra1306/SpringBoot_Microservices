package in.surendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByUserMailAndUserPwd(String UserMail,String UserPwd);
	
	//public User findBYUserMail(String userMail);

}
