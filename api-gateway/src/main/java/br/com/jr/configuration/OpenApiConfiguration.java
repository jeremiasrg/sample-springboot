package br.com.jr.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class OpenApiConfiguration {

//	URL Swagger: http://localhost:8765/swagger-ui.html
//	URL OpenAPI: http://localhost:8765/book-service/v3/api-docs
//	URL OpenAPI: http://localhost:8765/cambio-service/v3/api-docs
	
	@Bean
	@Lazy(false)
	public List<GroupedOpenApi> apis(SwaggerUiConfigParameters config, RouteDefinitionLocator locator) {

		var definitions = locator.getRouteDefinitions().collectList().block();

		definitions.stream().filter(routeDefinition -> routeDefinition.getId().matches(".*-service"))
				.forEach(routeDefinition -> {
					String name = routeDefinition.getId();
					config.addGroup(name);
					GroupedOpenApi.builder().pathsToMatch("/" + name + "/**").group(name).build();

				});

		return new ArrayList<>();
	}

}
