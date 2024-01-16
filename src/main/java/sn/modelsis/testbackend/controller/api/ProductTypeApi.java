package sn.modelsis.testbackend.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.modelsis.testbackend.dto.ProductTypeDto;

@RequestMapping("/productType")
public interface ProductTypeApi {

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Cette methode permet d'enregistrer ou modifier un type de produit",
            responses = {@ApiResponse(responseCode = "200", description = "L'objet type de produit est cree / modifie",
                    content = @Content(schema = @Schema(implementation = ProductTypeDto.class))),
                    @ApiResponse(responseCode = "404", description = "L'objet type de produit n'est pas valide")})
    ProductTypeDto save(@RequestBody ProductTypeDto dto);
}
