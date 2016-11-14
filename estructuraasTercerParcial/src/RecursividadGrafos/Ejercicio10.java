package RecursividadGrafos;
//Programar un algoritmo recursivo que permita multiplicar los elementos de un vector.

public class Ejercicio10 {

	static int multiplicacion(int v[], int n) {
		if (n == 0) {
			return v[n];
		} else {
			return multiplicacion(v, n - 1) * v[n];
		}
	}

	public static void main(String[] args) {
		int[] vec = { 2, 2, 2 };
		System.out.println(multiplicacion(vec, 2));
	}

}
