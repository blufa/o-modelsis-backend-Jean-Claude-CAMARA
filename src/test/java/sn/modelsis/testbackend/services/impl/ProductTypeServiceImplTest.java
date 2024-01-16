package sn.modelsis.testbackend.services.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sn.modelsis.testbackend.dto.ProductTypeDto;
import sn.modelsis.testbackend.services.ProductTypeService;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTypeServiceImplTest {

    @Autowired
    private ProductTypeService productTypeService;

    @Test
    public void shouldSaveProductTypeWithSuccess(){
        ProductTypeDto expectedProductType = ProductTypeDto.builder()
                .name("Fruit")
                .build();
        ProductTypeDto productTypeSaved = productTypeService.save(expectedProductType);

        assertNotNull(productTypeSaved);
        assertNotNull(productTypeSaved.getId());
        assertEquals(expectedProductType.getName(), productTypeSaved.getName());
    }
}
