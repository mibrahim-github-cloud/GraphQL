package com.graphql.resolver;

import org.springframework.stereotype.Component;








@Component
public class HelloWorldQueryResolver implements GraphQLQueryResolver {
	
	public String getHelloWorld() {
		return "HelloWorld GraphQL is working";
	}

}
