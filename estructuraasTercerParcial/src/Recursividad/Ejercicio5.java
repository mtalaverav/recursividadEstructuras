package Recursividad;

// Imprimir los números pares del 2 al 10. 

public class Ejercicio5 {

	public static void impresionPares(int n) {
		if (n >= 2) {
			impresionPares(n - 2);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		impresionPares(10);
	}
}