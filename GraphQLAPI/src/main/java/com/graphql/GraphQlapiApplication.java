package com.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.graphql.resolver"})
public class GraphQlapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlapiApplication.class, args);
	}

}
