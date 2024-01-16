package sn.modelsis.testbackend.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sn.modelsis.testbackend.dto.ProductTypeDto;
import sn.modelsis.testbackend.repository.ProductTypeRepository;
import sn.modelsis.testbackend.services.ProductTypeService;
import sn.modelsis.testbackend.validators.ProductTypeValidator;

import java.util.List;

@Slf4j
@Service
public class ProductTypeImpl  implements ProductTypeService {
    private final ProductTypeRepository productTypeRepository;

    public ProductTypeImpl(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    @Override
    public ProductTypeDto save(ProductTypeDto dto) {
        List<String> errors = ProductTypeValidator.validate(dto);
        if (!errors.isEmpty()){
            log.error("type de produit non valid", dto);
        }
        return ProductTypeDto.fromEntity(
                productTypeRepository.save(ProductTypeDto.toEntity(dto))
        );
    }
}
