package in.surendra.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao :: constructor");	
	}
	
	public String findName(int id) {
		if(id==100) {
			return "Ram";
		}
		else {
			return "Sita";
		}
	}

}
