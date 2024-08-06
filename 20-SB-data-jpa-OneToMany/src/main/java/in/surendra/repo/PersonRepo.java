package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Person;
import java.util.List;


public interface PersonRepo extends JpaRepository<Person, Integer>{

	public  List<Person> findByPname(String pname);
	

}
