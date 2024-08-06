package in.surendra.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.surendra.entity.Employee;
import in.surendra.repo.EmployeeRepo;

@Service
public class EmpService {
	
	private EmployeeRepo emprepo;
	
	public EmpService(EmployeeRepo emprepo) {
		 this.emprepo =emprepo;
	}
	
	public void saveAllTheEmps() {
		Employee emp1 = new Employee(201,"Ram",20000);
		Employee emp2 = new Employee(202,"Lakshman",30000);
		Employee emp3 = new Employee(203,"Sita",40000);
		Employee emp4 = new Employee(204,"Hanuman",50000);
		 
		List<Employee> emps = Arrays.asList(emp1,emp2,emp3,emp4);
		
		Iterable<Employee> saveAll = emprepo.saveAll(emps);
		saveAll.forEach(System.out::println);
	}	
	
	public void callCustomQuery() {
		List<Employee> allEmpsHql = emprepo.getAllEmpsHql();
		allEmpsHql.forEach(System.out::println);
	}
	
	public void callCustomQueryforId() {
		Employee empIdHql = emprepo.getEmployeeByidHql(202);
		System.out.println(empIdHql);
	}

	public void callCustomBySql() {
		List<Employee> empsBySql = emprepo.getEmpsBySql();
		empsBySql.forEach(System.out::println);
	}
}
