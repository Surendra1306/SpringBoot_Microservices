package in.surendra.service;

import in.surendra.dao.IUserDao;

public class UserServiceImpl implements UserService {
	
	private IUserDao userdao;
	
	public UserServiceImpl() {
		 System.out.println("0-param constructor...");
	}
	
	public UserServiceImpl(IUserDao userdao) {
		System.out.println("param constructor...");
		this.userdao=userdao;
	}

	@Override
	public String getName(int id) {
		return userdao.findName(id);
	}

}
