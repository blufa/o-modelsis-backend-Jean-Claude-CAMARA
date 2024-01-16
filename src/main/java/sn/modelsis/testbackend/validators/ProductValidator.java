package sn.modelsis.testbackend.validators;

import org.springframework.util.StringUtils;
import sn.modelsis.testbackend.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;

public class ProductValidator {

    public static List<String> validate(ProductDto dto){
        List<String> errors = new ArrayList<>();

        if (dto == null){
            errors.add("Veuillez renseigner le nom du produit");
            errors.add("Veuillez renseigner le type de produit");

            return errors;
        }

        if (!StringUtils.hasLength(dto.getName())) {
            errors.add("Veuillez renseigner le nom du produit");
        }
        if (dto.getProductType() == null || dto.getProductType().getId() == null) {
            errors.add("Veuillez choisir un type de produit");
        }

        return errors;
    }
}
