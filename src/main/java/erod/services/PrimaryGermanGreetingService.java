package erod.services;

//@Service
//@Primary
//@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Grüße vom primären Service";
	}

}
