package in.surendra.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.surendra.entity.EmployeeTable;
@Repository
public interface EmployeeRepo extends CrudRepository<EmployeeTable, Integer> {
	
		public 	List<EmployeeTable> findByEid( Integer eid);
		
		public List<EmployeeTable> findByName(String ename);
		
		public  List<EmployeeTable> findBySalaryGreaterThanEqual(double esalary);

}
