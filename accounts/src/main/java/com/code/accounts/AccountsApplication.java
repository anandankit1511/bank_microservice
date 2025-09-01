package com.code.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice Rest API Documentation",
				description = "Project for Accounts Microservice Rest API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ankit Anand",
						email = "ankitanand1511@gmail.com",
						url = "https://www.linkedin.com/in/ankit-anand-779397169/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/ankit-anand-779397169/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Accounts Microservice Rest API Documentation",
				url = "/swagger-ui/index.html#/"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
