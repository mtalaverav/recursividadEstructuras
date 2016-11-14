package RecursividadGrafos;
//Programar un algoritmo recursivo que calcule el factorial de un número.
public class Ejercicio6 {

	static int factorial(int n) {
		if (n == 0) {
			return 1; // Caso Base
		} else {
			return n * factorial(n - 1); // Fórmula Recursiva
		}
	}

	public static void main(String[] args) {
		System.out.println(factorial(8));
	}
}
