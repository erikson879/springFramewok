package erod.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello - I was in Primary greeting service impl";
	}
	
}
 