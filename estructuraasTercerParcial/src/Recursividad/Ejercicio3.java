package Recursividad;

// Escriban una función recursiva llamada Ocurrencia 
//que cuente la cantidad de ocurrencias de un elemento x en un Vector V. 

public class Ejercicio3 {

	public static int Ocurrencias(int n, int[] vector, int x) {
		if (n > vector.length - 1)
			return 0;
		else {
			if (vector[n] == x )
				return (1 + Ocurrencias(n+1, vector, x));
			else
				return (Ocurrencias(n+ 1, vector, x ));
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 2, 6, 3, 3, 3, 5 };
		int x = 2;
	
		System.out.println(Ocurrencias(0, array, x));
		
	}
}
