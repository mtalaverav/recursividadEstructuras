package RecursividadGrafos;

// Programar un algoritmo recursivo que calcule un n�mero de la serie
//fibonacci.

public class Ejercicio7 {
	static int fibonaci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonaci(n - 1) + fibonaci(n - 2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fibonaci(8));
	}
}
