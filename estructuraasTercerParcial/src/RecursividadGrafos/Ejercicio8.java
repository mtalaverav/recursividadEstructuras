package RecursividadGrafos;

//Programar un algoritmo recursivo que permita hacer la división por restas
//sucesivas.

public class Ejercicio8 {

	static int division(int a, int b) {
		if (b > a) {
			return 0;
		} else {
			return division(a - b, b) + 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(division(10, 2));
	}
}
