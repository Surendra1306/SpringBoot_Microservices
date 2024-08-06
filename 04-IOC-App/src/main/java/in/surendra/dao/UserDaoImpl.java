package in.surendra.dao;

public class UserDaoImpl implements IUserDao {
	
	public UserDaoImpl() {
		 System.out.println("DaoImplementation class constructor...");
	}

	@Override
	public String findName(int id) {
		// db logic comes here
		if(id==101) {
			return "rama";
		}
			else if(id==102) {
				return "Sita";
			}
		
		return null;
	}
}
