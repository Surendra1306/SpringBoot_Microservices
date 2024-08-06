package in.surendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surendra.entity.Address;
import in.surendra.entity.Person;
import in.surendra.repo.AddressRepo;
import in.surendra.repo.PersonRepo;
import jakarta.transaction.Transactional;

@Service
public class RollbackService {
	
	@Autowired
	private PersonRepo prepo;
	@Autowired
	private AddressRepo arepo;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveBoth() {
		
		Person person = new Person();
		person.setName("Arjun");
		person.setSalary(20000);
		
		Person savePer = prepo.save(person);
		System.out.println(savePer);
		
		//int 10/0;
		
		Address address = new Address();
		address.setState("Karnataka");
		address.setCity("Bengaluru");
		address.setStreet("Hebbal");
		address.setPersonid(savePer.getPersonid());
		
		Address saveAdd = arepo.save(address);
		System.out.println(saveAdd);
	}	
}
