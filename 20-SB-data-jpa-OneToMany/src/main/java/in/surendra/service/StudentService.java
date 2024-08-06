package in.surendra.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.Address;
import in.surendra.entity.Person;
import in.surendra.repo.AddressRepo;
import in.surendra.repo.PersonRepo;

@Service
public class StudentService {
	
	@Autowired
	private PersonRepo prepo;
	@Autowired
	private AddressRepo arepo;
	
	
	public void savePerson() {
		
		Person person = new Person();
		
		person.setPname("Smith");
		person.setGender("male");
		
		Address a1 = new Address();
		a1.setState("Karnataka");
		a1.setCity("Bangaluru");
		a1.setPerson(person);
		
		Address a2=new Address();
		a2.setState("Andra_Pradesh");
		a2.setCity("Guntur");
		a2.setPerson(person);
		
		List<Address> address = Arrays.asList(a1,a2);
		person.setAddress(address);
		
		
		prepo.save(person);
		
		System.out.println("person records successfully saved......");
	}
	
	
	public void getPerson() {
		Optional<Person> byId = prepo.findById(1);
		//it will give error if the fetch type is lazy loading,it will retrive only parent records by defult
		if(byId.isPresent()) {
			Person person = byId.get();
			List<Address> address = person.getAddress();
		}	
	}
	
	
	public void getAddress() {
		arepo.findById(1);  //it will retrive both child + Parent records
	}
	
	public void removePerson() {
		prepo.deleteById(1);      // child+parent records will be deleted
	}

}
