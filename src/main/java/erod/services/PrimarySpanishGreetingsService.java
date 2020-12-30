package erod.services;

//@Service
//@Profile("es")
//@Primary
public class PrimarySpanishGreetingsService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Servicio de servicio primario";
	}

}
