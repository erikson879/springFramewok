package erod.springFramework.constroller;

import org.springframework.stereotype.Controller;

import erod.services.GreetingService;

@Controller
public class MyController {
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello from controller!!!");
		return greetingService.sayGreeting(); 
	}

}
