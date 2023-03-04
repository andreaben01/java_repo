package projectJava;

public class Ejercicios_Clase1 {

	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		//A
		/*utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.*/
		
		while(numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++;
		}
		
		//B
		/*A lo anterior, solo muestre los números pares*/
		
		while(numeroInicio <= numeroFin) {
			numeroInicio++;
			if(numeroInicio % 2 == 0) {
				System.out.println(numeroInicio);
				
			}
		}
		
		
		//C
		/*A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares */
		
		//D
		/*Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden*/
		
		for(int numeroInicio2 = 5; numeroInicio2 <= numeroFin;) {
			numeroFin--;
			if(numeroFin % 2 == 0) {
				System.out.println(numeroFin);
			}	
		}
		
		
		
		
	}

}
