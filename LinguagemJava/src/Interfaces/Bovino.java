package Interfaces;

public class Bovino implements Animal {
	public void animalSom() {
		System.out.println("Muuu");
	}
	
	public void animalComer() {
		System.out.println("Comendo capim");
	}

	@Override
	public void animalAbrigo() {
		System.out.println("No abrigo ");
	}

}
