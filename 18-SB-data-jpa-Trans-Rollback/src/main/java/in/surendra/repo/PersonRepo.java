package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
