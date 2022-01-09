package generator4j.name;

import java.util.Random;

import generator4j.Generator;

public class NameGenerator implements Generator<String> {

	private String[] validNames = 
		{"Gabriel","João","Ricardo"};
	
	@Override
	public String valid() {
		return validNames[new Random().nextInt(validNames.length)];
	}

	@Override
	public String invalid() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
