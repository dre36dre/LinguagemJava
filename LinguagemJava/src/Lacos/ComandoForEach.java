package Lacos;

public class ComandoForEach {
	public static void main(String[] args) {
		int[] vetorNumeros= new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//Sem For Each
		System.out.println("Varrendo o vetor sem for Each");
		for(int i=0;i< vetorNumeros.length;i++) {
			System.out.println("Numero: " +vetorNumeros[i]);
		}
		
		//com For Each
		for(int lista: vetorNumeros) {
			System.out.println("NR: "+lista);
		}
	}
}
