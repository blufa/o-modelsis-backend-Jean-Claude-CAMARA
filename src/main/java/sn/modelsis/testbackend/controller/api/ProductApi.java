package sn.modelsis.testbackend.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.modelsis.testbackend.dto.ProductDto;

import java.util.List;

@RequestMapping("/product")
public interface ProductApi {

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Cette methode permet d'enregistrer ou modifier un produit",
            responses = {@ApiResponse(responseCode = "200", description = "L'objet produit est cree / modifie",
                    content = @Content(schema = @Schema(implementation = ProductDto.class))),
                    @ApiResponse(responseCode = "404", description = "L'objet produit n'est pas valide")})
    ProductDto save(@RequestBody ProductDto dto);


    @GetMapping(value = "/articles/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Cette methode permet de chercher et renvoyer la liste des articles qui existent "
            + "dans la BDD")
    @ApiResponse(responseCode = "200", description = "La liste des produits / Une liste vide")
    List<ProductDto> findAll();
}
