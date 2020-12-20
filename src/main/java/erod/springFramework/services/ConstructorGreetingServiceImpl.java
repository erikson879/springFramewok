package erod.springFramework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello - I was injected from constructor";
	}

}
