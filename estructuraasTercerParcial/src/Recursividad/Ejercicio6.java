package Recursividad;

//Realizar función recursiva que verifique si un vector de enteros es capicua.
//Utilice un vector impar para facilitar el ejercicio.

public class Ejercicio6 {

	public static boolean capicua(int[] v, int i, int j) {

		boolean respuesta = true;

		if (i <= j) {
			if (v[i] == v[j])
				return (capicua(v, i + 1, j - 1));
			else
				return false;

		} else
			return respuesta;

	}

	public static void main(String[] args) {

		int[] vector = { 1, 2, 6, 2, 1 };

		if (capicua(vector, 0, vector.length - 1)) {
			System.out.println("El vector es capicua,");

		} else {
			System.out.println("El vector no es capicua.");

		}
	}

}
