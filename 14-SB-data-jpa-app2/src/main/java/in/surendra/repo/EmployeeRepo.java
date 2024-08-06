package in.surendra.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.surendra.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	@Query("from Employee")
	public List<Employee> getAllEmpsHql();
	
	@Query("from Employee where id=:id")
	public Employee getEmployeeByidHql(Integer id);
	
	//to write native sql queries
	@Query(value="select * from Employee",nativeQuery = true)	
	public List<Employee> getEmpsBySql();
	
	}
