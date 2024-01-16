package sn.modelsis.testbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import sn.modelsis.testbackend.controller.api.ProductApi;
import sn.modelsis.testbackend.dto.ProductDto;
import sn.modelsis.testbackend.services.ProductService;

import java.util.List;

@RestController
public class ProductController implements ProductApi {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ProductDto save(ProductDto dto) {
        return productService.save(dto);
    }

    @Override
    public List<ProductDto> findAll() {
        return productService.findAll();
    }
}
