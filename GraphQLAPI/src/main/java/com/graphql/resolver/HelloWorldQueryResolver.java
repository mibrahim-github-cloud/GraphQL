package com.graphql.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class HelloWorldQueryResolver implements GraphQLQueryResolver{

	public String getHelloWorld() {
		return "GraphQL Is working";
	}
}
