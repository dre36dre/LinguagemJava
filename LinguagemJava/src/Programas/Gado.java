package Programas;

import Interfaces.Animal;

public class Gado implements Animal{

	@Override
	public void animalSom() {
		System.out.println("muuu");
	}

	@Override
	public void animalComer() {
		System.out.println("Comendo capim");
	}

	@Override
	public void animalAbrigo() {
		System.out.println("no campo");
	}
	

}
