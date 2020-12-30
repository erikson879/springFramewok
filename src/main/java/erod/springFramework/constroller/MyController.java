package erod.springFramework.constroller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import erod.services.GreetingService;

@Controller
public class MyController {
	private GreetingService greetingService;
	
	public MyController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello from controller!!!");
		return greetingService.sayGreeting(); 
	}

}
