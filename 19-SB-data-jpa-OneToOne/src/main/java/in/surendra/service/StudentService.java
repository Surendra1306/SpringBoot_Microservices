package in.surendra.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.Student;
import in.surendra.entity.Teacher;
import in.surendra.repo.StudentRepo;
import in.surendra.repo.TeacherRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo srepo;
	@Autowired
	private TeacherRepo trepo;
	
	public void saveStudent(){
		Student student=new Student();
		
		student.setSname("Ram");
		student.setSgender("Male");
		
		Teacher teacher=new Teacher();
		 teacher.setTname("Krishna");
		 teacher.setTsubject("English");
		 
		 teacher.setStudent(student);
		 student.setTeacher(teacher);
		 
		 srepo.save(student);
		 
		 System.out.println("student records saved successfully.......");
		
	}
	
	public void getPerson() {
		 srepo.findById(1);//for oto ,by default fecth type is eager loding.along with parent child records also retrived
	}
	
	public void getTeacher() {
		trepo.findById(1);
	}
	
	

}






