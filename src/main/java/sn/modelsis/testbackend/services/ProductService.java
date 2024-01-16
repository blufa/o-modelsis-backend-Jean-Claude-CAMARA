package sn.modelsis.testbackend.services;

import sn.modelsis.testbackend.dto.ProductDto;
import sn.modelsis.testbackend.entities.Product;

import java.util.List;

public interface ProductService {
    ProductDto save(ProductDto dto);
    List<ProductDto> findAll();
}
