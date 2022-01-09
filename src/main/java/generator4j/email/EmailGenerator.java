package generator4j.email;

import java.util.Random;

import generator4j.Generator;
import generator4j.name.NameGenerator;

public class EmailGenerator implements Generator<String> {
	
	private String[] validDomains = 
		{"gmail.com","hotmail.com","yahoo.com"};
	
	@Override
	public String valid() {
		return new NameGenerator().valid().concat("@").concat(validDomains[new Random().nextInt(validDomains.length)]).toLowerCase();
	}

	@Override
	public String invalid() {
		return null;
	}

}
