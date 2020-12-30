package erod.services;

//@Service
//@Primary
//@Profile({"en","default"})
public class PrimaryGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello - I was in Primary greeting service impl";
	}
	
}
 