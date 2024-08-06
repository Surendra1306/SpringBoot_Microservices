package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
