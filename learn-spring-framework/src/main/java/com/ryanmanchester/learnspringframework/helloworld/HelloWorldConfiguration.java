package com.ryanmanchester.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) { };
record Address(String street, String city) { };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ryan";
	}
	
	@Bean 
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		return new Person("Jude", 31, new Address("Smith St", "Brooklyn"));
		
	}
	
	@Bean(name = "address2")
	
	public Address address() {
		return new Address("401", "Brooklyn");
		
	}
	
	@Bean(name = "address3")
	@Primary
	public Address address3() {
		return new Address("Hoyt St", "Brooklyn");
	}
	
	@Bean
	public Person personMethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean Person personParameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

}
