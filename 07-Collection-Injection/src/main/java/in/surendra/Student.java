package in.surendra;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	private List<String> courses;
	private Set<String> hobbies;
	private Map<String, String> Phn_no;
	
	public Student() {
		System.out.println("constructor created...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Map<String, String> getPhn_no() {
		return Phn_no;
	}

	public void setPhn_no(Map<String, String> phn_no) {
		Phn_no = phn_no;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + ", hobbies=" + hobbies + ", Phn_no="
				+ Phn_no + "]";
	}


	 

	
}
