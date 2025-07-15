package com.EmployeeApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.EmployeeApp.entity.Employee;
import com.EmployeeApp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees")
	public String getAllEmployees(Model model) {
		List<Employee> allEmployees = service.getAllEmployees();
		model.addAttribute("employees", allEmployees);
		return "employees";
	}
	
	@GetMapping("/newEmp")
	public String showEmpForm(Model model) {
		Employee emp = new Employee();
		model.addAttribute("employee", emp);
		return "saveEmp";
	}
	
	@PostMapping("/newEmp")
	public String createEmployee(Model model
								,@Valid @ModelAttribute("employee") Employee emp
								,BindingResult result) {
		
		try {
			if(result.hasErrors()) {
				model.addAttribute("errMsg","failed to save details....");
				return "saveEmp";
			}
			else {
				Employee savedEmployee = service.saveEmployee(emp);
				model.addAttribute("succMsg","Employee details saved successfully....");
				return "saveEmp";
			}
		}
		catch(Exception e){
			 model.addAttribute("errMsg", "An unexpected error occurred. Please try again.");
		        return "saveEmp";
		}
		
		
	}
	
	@GetMapping("/update")
	public String updateEmpById(@RequestParam("empId") Integer empId, Model model) {
		Employee empById = service.getEmpById(empId);
		model.addAttribute("editEmployee", empById);
		return "updateEmp";
	}
	
	@PostMapping("/employees/{empId}")
	public String updateEmployee(@PathVariable("empId") Integer empId
								,@ModelAttribute("editEmployee") Employee emp, Model model) {
		Employee existEmployee = service.getEmpById(empId);
		if(existEmployee!=null) {
			existEmployee.setId(empId);
			existEmployee.setName(emp.getName());
			existEmployee.setEmail(emp.getEmail());
			existEmployee.setPwd(emp.getPwd());
			existEmployee.setDob(emp.getDob());
			existEmployee.setAge(emp.getAge());
			existEmployee.setSalary(emp.getSalary());
			existEmployee.setStatus(emp.isStatus());
			service.saveEmployee(existEmployee);
			return "redirect:/employees";
		}
		return "updateEmp";
		
	}
	
	@GetMapping("/delete/{eid}")
	public String deleteEmp(@PathVariable("eid") Integer eid) {
		service.removeEmployee(eid);
		return "redirect:/employees";
	}
	
}
