
package in.surendra.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
public class Employee {
	
	@Id
	private Integer eid;
	private String ename;
	private Integer esalary;
	 
	public Employee() {
		 System.out.println("entity :: 0 param constructor");
	}
	 
	//constructor is compulsory for entity class
	public Employee(Integer eid, String ename, Integer esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}


	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getEsalary() {
		return esalary;
	}
	public void setEsalary(Integer esalary) {
		this.esalary = esalary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}
