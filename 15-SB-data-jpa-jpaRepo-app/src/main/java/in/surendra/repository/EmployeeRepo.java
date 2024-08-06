package in.surendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
