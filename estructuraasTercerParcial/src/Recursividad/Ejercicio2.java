package Recursividad;

//Escriban una función recursiva llamada ExisteElemento
//que verifique si un elemento x se encuentra en un vector V. 

public class Ejercicio2 {

	public static void ExisteElemento(int[] v, int x, int i) {
		if (i > v.length - 1) {
			System.out.println("error, no se encuentra");
		} else {
			if (x == v[i]) {
				System.out.println("El elemento " + x + " se encuentra" + " en la posicion " + (i + 1));

			} else {
				ExisteElemento(v, x, i + 1);
			}

		}
	}

	public static void main(String[] args) {

		int[] vector = { 1, 2, 3, 6, 7 };
		int x = 1;
		ExisteElemento(vector, x, 0);

	}
}
