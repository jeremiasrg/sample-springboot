package br.com.jr.configuration;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@OpenAPIDefinition(info = 
@Info(title = "Book service API", version = "v1", description = "Documentation of Book service API" ))
public class OpenApiConfiguration {

//	URL Swagger: http://localhost:8100/swagger-ui.html
//	URL OpenAPI: http://localhost:8100/v3/api-docs
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().components(new Components()).info(
				new io.swagger.v3.oas.models.info.Info()
				.title("Book service API")
				.version("v1")
				.license(new License().name("Jr Corp").url("http://www.jrsimulator.com")));
	}
}