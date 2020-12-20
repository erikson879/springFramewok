package erod.springFramework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import erod.springFramework.constroller.ConstructorInjectedController;
import erod.springFramework.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

private ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	public void setup() throws Exception{ 
		this.constructorInjectedController = 
				new ConstructorInjectedController(new GreetingServiceImpl());
	}
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
	}
}
