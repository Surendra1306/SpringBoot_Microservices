package in.surendra.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.surendra.entity.EmployeeTable;
import in.surendra.repo.EmployeeRepo;

@Service
public class EmpService {
	
	private EmployeeRepo emprepo;
	
	public EmpService(EmployeeRepo emprepo) {
		 this.emprepo=emprepo;
	}
	
	
	public void saveTheEmp() {
		
		System.out.println("proxy class" + emprepo.getClass().getName() );
		
		 EmployeeTable emp = new EmployeeTable(); //create one object to insert one row data
		 
		 emp.setEid(101);
		 emp.setEname("Tom");
		 emp.setSalary(20000);
		 
		 emprepo.save(emp);		//to save single record in table
	}
	
	
	public void saveEmps() {

		EmployeeTable e1 = new EmployeeTable(201, "Ram", 1000.00);
		EmployeeTable e2 = new EmployeeTable(202, "Anil", 2000.00);
		EmployeeTable e3 = new EmployeeTable(203, "Sunil", 3000.00);

		List<EmployeeTable> emps = Arrays.asList(e1, e2, e3);

		emprepo.saveAll(emps);	//to save multiple records in the table,use collections

		System.out.println("Records saved.....");

	}
	
	public void findEmpl(Integer eid) {
		Optional<EmployeeTable> opt=emprepo.findById(eid);  //to find the single record by pk
		
		if(opt.isPresent()) {
			EmployeeTable et=opt.get();
			System.out.println(et);
		}
		else {
			System.out.println("record not found....");
		}
	}
		
	public void findEmpls(List<Integer> eids) {

			 Iterable<EmployeeTable> emps = emprepo.findAllById(eids); //to find the multiple records by using multiple pk
			
			 emps.forEach(e -> System.out.println(e));//lamda exp
			 //or
			// emps.forEach(System.out::println);//method reference 
			}
		
	public void findemps() {
		Iterable<EmployeeTable> all = emprepo.findAll();//to find all the emps based on pk
		all.forEach(System.out::println);
	}
	
	
	public void callEmpsOnId() {
		List<EmployeeTable> emp1 =	emprepo.findByEid(202);
		emp1.forEach(System.out::println);
		
	 	List<EmployeeTable> emp2 =	emprepo.findByName("ram");
	 	emp2.forEach(System.out::println);
		
		List<EmployeeTable> emp3 = emprepo.findBySalaryGreaterThanEqual(20000.0);
		emp3.forEach(System.out::println);
	}	
}