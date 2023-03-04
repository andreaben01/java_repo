package projectJava;

public class Arrays_ejemplo {
	
	public static void main(String[] args) {
		
		int numeros[] = new int[3];
		
		numeros[0] = 1;
		numeros[1] = 37;
		numeros[2] = 16;
		
		System.out.println(numeros.length);
		
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println(numeros[indice]);
		}
		
		
		int numeros2[] = new int[10];
		char letras[] = {'a','b','c'};
		
		numeros2[0] = 10;
		numeros2[5] = 14;
		
		System.out.println(numeros2[5]/7);
		
		for(char letra : letras) {
			System.out.println(letra);

		}
		
		
		
		
		
		
	}
}
