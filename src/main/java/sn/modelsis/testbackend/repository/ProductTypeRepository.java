package sn.modelsis.testbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.modelsis.testbackend.entities.ProductType;

public interface ProductTypeRepository extends JpaRepository<ProductType,  Integer> {
}
