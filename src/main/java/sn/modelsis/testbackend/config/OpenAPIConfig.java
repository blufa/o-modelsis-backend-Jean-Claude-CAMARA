package sn.modelsis.testbackend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Jean Claude",
                        email = "jeccam38@gmail.com"
                ),
                description = "Docummentation des API",
                title = "Gestion de Stockt Jean Clalude",
                version = "1.0",
                license = @License(
                        name = "",
                        url = ""
                ),
                termsOfService = ""
        ),
        servers = {
                @Server(
                        description = "Environnement de DEV",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "Environnement de PROD",
                        url = ""
                )
        }
)

public class OpenAPIConfig {
}
