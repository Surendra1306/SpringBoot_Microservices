package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
