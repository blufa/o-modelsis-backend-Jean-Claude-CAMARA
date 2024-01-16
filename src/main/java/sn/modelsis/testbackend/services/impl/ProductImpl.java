package sn.modelsis.testbackend.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sn.modelsis.testbackend.dto.ProductDto;
import sn.modelsis.testbackend.repository.ProductRepository;
import sn.modelsis.testbackend.services.ProductService;
import sn.modelsis.testbackend.validators.ProductValidator;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto save(ProductDto dto) {
        List<String> errors = ProductValidator.validate(dto);
        if (!errors.isEmpty()){
            log.error("Produit non valide", dto);
        }
        return ProductDto.fromEntity(
                productRepository.save(ProductDto.toEntity(dto))
        );
    }

    @Override
    public List<ProductDto> findAll() {
        return productRepository.findAll()
                .stream().map(ProductDto::fromEntity)
                .collect(Collectors.toList());
    }
}
