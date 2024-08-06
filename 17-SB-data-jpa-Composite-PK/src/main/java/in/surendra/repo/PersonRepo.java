package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Person;
import in.surendra.entity.PersonPk;

public interface PersonRepo extends JpaRepository<Person, PersonPk> {

}
