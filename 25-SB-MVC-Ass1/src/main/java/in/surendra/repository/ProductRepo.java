package in.surendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.surendra.bindings.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
