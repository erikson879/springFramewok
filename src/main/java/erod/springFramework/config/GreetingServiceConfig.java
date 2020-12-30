package erod.springFramework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import erod.services.GreetingRepository;
import erod.services.GreetingService;
import erod.services.GreetingServiceFactory;
import erod.services.PrimaryGermanGreetingService;
import erod.services.PrimaryGreetingServiceImpl;
import erod.services.PrimarySpanishGreetingsService;

@Configuration
public class GreetingServiceConfig {
	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
		System.out.println("Constructor GreetingServiceConfig");
		return new GreetingServiceFactory(repository);
	}
	@Bean
	@Primary
	@Profile("de")
	GreetingService primaryGermanGreetingService() {
		return new PrimaryGermanGreetingService();
	}
	
	@Bean
	@Primary
	@Profile("es")
	GreetingService primarySpanishGreetingsService() {
		return new PrimarySpanishGreetingsService();
	}
	
	@Bean
	@Primary
	@Profile({"default","en"})
	GreetingService primaryGreetingServiceImpl() {
		return new PrimaryGreetingServiceImpl();
	}
}
