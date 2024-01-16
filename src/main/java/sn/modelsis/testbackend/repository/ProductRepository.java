package sn.modelsis.testbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.modelsis.testbackend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
