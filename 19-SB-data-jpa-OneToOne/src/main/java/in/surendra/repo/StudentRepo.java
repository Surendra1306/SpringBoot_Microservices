package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
}
