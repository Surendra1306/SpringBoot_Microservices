package in.surendra.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.Person;
import in.surendra.entity.PersonPk;
import in.surendra.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	PersonRepo repo;
	
	public void savePerson(){
		
		PersonPk pk=new PersonPk();
		
		pk.setId(101);
		pk.setPassportId(8765434);
		
		Person person=new Person();
		
		person.setName("Ajay");
		person.setCity("Banglore");
		
		person.setPk(pk);
		
		repo.save(person);
		
		System.out.println("records saved....");
	}
	
	public void getPerson() {
		PersonPk pk = new PersonPk();
		pk.setId(101);
		pk.setPassportId(8765434);
		
		Optional<Person> optional = repo.findById(pk);
		 if(optional.isPresent()) {
			 Person person = optional.get();
			 System.out.println(person);
		 }	
	}
}
