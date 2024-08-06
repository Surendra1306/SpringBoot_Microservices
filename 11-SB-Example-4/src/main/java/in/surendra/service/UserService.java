package in.surendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.dao.UserDao;

@Service
public class UserService {
	
	//@Autowired   -   for field injeciton ,but its not recomended because its private variable ,accessing within the class
	private UserDao userdao; //but can access, because IOC using reflection api to access private variable	
//	if u want to use field inj. put @autowired above the UserDao userDao and no need to write cons and settr methods 
	
	
//  private UserDao userdao;
//	@Autowired							//its optional for CI when u have only one const,but mandatory when having more than one constructor
//	public UserService(UserDao usrdao) {  //for this @autowired annotation is not required for parameterised constructor,by default it will consider
//		 System.out.println("UserSrevice :: constructor...");
//		 this.userdao=userdao;
//	}
	
	//private UserDao userdao;
	@Autowired
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;						//for setter injection
	}



	public void fetchName(int id) {
		String str = userdao.findName(id);
		System.out.println(str);
	}

}
