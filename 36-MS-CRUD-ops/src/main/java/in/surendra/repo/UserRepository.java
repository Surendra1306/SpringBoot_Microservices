package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
