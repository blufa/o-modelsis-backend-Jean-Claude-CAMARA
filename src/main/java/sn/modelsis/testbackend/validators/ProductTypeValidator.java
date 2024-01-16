package sn.modelsis.testbackend.validators;

import org.springframework.util.StringUtils;
import sn.modelsis.testbackend.dto.ProductTypeDto;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeValidator {

    public static List<String> validate(ProductTypeDto dto){
        List<String> errors = new ArrayList<>();

        if (dto == null){
            errors.add("Veuillez renseigner le nom du produit");

            return errors;
        }

        if (!StringUtils.hasLength(dto.getName())) {
            errors.add("Veuillez renseigner le nom du produit");
        }

        return errors;
    }
}
