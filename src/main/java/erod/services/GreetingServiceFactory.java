package erod.services;

import org.springframework.stereotype.Service;

public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		System.out.println("Constructor of GreetingServiceFactory");
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String lang) {
		switch (lang) {
		case "en":
			return new PrimaryGreetingServiceImpl();
		case "es":
			return new PrimarySpanishGreetingsService();
		case "ge":
			return new PrimaryGermanGreetingService();			
		default:
			return new PrimaryGreetingServiceImpl();
		} 
	}
	
	
}
