package RecursividadGrafos;

//Programar un algoritmo recursivo que permita sumar los elementos de un vector.

public class Ejercicio9 {
	static int suma_vec(int v[], int n) {
		if (n == 0) {
			return v[n];
		} else {
			return suma_vec(v, n - 1) + v[n];
		}
	}
	
	public static void main(String[] args) {
		int [] vec = {1, 2, 10 };
		System.out.println(suma_vec(vec, 2 ));
	}

}
