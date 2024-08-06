package in.surendra.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public String findNameById(Integer id) {
		return "Rohit";
	}
}
