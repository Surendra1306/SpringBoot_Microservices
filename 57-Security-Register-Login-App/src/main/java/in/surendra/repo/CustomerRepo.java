package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	public Customer findByEmail(String email);
}
