package sn.modelsis.testbackend.dto;

import lombok.Builder;
import lombok.Data;
import sn.modelsis.testbackend.entities.Product;

import java.util.Date;


@Data
@Builder
public class ProductDto {
    private Long id;
    private String name;
    private Date dateCreated;
    private ProductTypeDto productType;

    public static ProductDto fromEntity(Product product){
        if (product == null){
            return null;
        }
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .dateCreated(product.getDateCreated())
                .productType(ProductTypeDto.fromEntity(product.getProductType()))
                .build();

    }

    public  static  Product toEntity(ProductDto dto){
        if (dto == null){
            return  null;
        }
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setProductType(ProductTypeDto.toEntity(dto.getProductType()));
        return  product;
    }
}
