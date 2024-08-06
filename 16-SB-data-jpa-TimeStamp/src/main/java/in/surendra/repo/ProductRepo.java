package in.surendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surendra.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
