package in.surendra.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import in.surendra.entity.Employee;
import in.surendra.repository.EmployeeRepo;


@Service
public class EmpService {
	
	
	private EmployeeRepo empRepo;
	public EmpService(EmployeeRepo repo) {
		this.empRepo=repo;
	}
	
	
	public void showEmpls() {
			List<Employee> emps = empRepo.findAll();
			emps.forEach(e -> System.out.println(e));
	}
	
	//	Sorting
	
	public void empsSort() {
		org.springframework.data.domain.Sort sort = org.springframework.data.domain.Sort.by("esalary").ascending();
		List<Employee> emp=empRepo.findAll(sort);
		emp.forEach(System.out::println);
	}
	
	//  Pagination
	
	public void empsPagination() {
		Integer pageSize=3;
		Integer pageNumber=1;
		PageRequest pg = PageRequest.of(pageNumber-1, pageSize);
		
		Page<Employee> page = empRepo.findAll(pg);
		
		 List<Employee> content = page.getContent();
		 
		 content.forEach(System.out::println);
	}
	
	//	Query By Example
	
	public void empsDynamicSearch() {
	Employee emp=new Employee();
		Example<Employee> example = Example.of(emp);
		List<Employee> list = empRepo.findAll(example);
		list.forEach(System.out::println);
	}
}

