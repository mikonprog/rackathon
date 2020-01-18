package com.example.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.*;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .components(new Components())
            .info(
                new Info()
                .title("Rakathon Application API")
                .description("This is a Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.")
                .version("3.0"));
    }

}
