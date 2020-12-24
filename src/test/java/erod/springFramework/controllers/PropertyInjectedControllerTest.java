package erod.springFramework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import erod.services.GreetingServiceImpl;
import erod.springFramework.constroller.PropertyInjectedController;

public class PropertyInjectedControllerTest {
	private PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	public void setup() throws Exception{ 
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
	}
}
