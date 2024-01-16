package sn.modelsis.testbackend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import sn.modelsis.testbackend.entities.ProductType;

import java.util.List;

@Data
@Builder
public class ProductTypeDto {
    private Long id;
    private String name;
    @JsonIgnore
    private List<ProductDto> productDtos;


    public static ProductTypeDto fromEntity(ProductType productType){
        if (productType == null){
            return null;
        }
        return ProductTypeDto.builder()
                .id(productType.getId())
                .name(productType.getName())
                .build();
    }

    public static ProductType toEntity(ProductTypeDto dto){
        if (dto == null){
            return null;
        }
        ProductType productType = new ProductType();
        productType.setId(dto.getId());
        productType.setName(dto.getName());

        return productType;
    }
}
