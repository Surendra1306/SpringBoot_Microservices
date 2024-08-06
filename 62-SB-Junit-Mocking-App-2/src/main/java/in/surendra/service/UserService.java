package in.surendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public String findName(Integer id) {
		String name = dao.findNameById(id);
		System.out.println(name);
		return name;
	}
	
	
	
	
	
	
	
}
