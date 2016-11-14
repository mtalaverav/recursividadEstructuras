package Recursividad;

//Escriban una función recursiva llamada Suma que retorne la suma de los  elementos de un vector de enteros L. 
public class Ejercicio4 {

	public static int arraySumAux(int[] a, int low, int high) {

		if (low == high) {
			return 0;
		} else { // low < high
			return arraySumAux(a, low, high - 1) + a[high - 1];
		}
	}

	public static int arraySum(int[] a) {
		return arraySumAux(a, 0, a.length);
	}

	public static void main(String[] args) {
		int[] vector1 = { 1, 2, 3, 4, 5 };

		System.out.println(arraySum(vector1));

	}
}
