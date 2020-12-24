package erod.springFramework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import erod.services.GreetingServiceImpl;
import erod.springFramework.constroller.SetterInjectedController;

public class SetterInjectedControllerTest {

private SetterInjectedController setterInjectedController;
	
	@BeforeEach
	public void setup() throws Exception{ 
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
	}
}
