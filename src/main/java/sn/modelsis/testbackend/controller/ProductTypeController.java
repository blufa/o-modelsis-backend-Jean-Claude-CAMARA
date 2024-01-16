package sn.modelsis.testbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import sn.modelsis.testbackend.controller.api.ProductTypeApi;
import sn.modelsis.testbackend.dto.ProductTypeDto;
import sn.modelsis.testbackend.services.ProductTypeService;

@RestController
public class ProductTypeController implements ProductTypeApi {

    private ProductTypeService productTypeService;

    @Autowired
    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    @Override
    public ProductTypeDto save(ProductTypeDto dto) {
        return productTypeService.save(dto);
    }
}
