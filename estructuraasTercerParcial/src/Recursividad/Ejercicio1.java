package Recursividad;

//Escriban una función booleana recursiva llamada SonIguales
//que reciba dos vectores de igual tamaño como parámetros y
//devuelva TRUE si son iguales (mismos elementos en el mismo orden), o FALSE en caso contrario. 

public class Ejercicio1 {

	public static void sonIguales(int[] vec1, int[] vec2, int i) {

	
		if (vec1.length != vec2.length) {
			System.out.println("FALSE");
		} else {
			if (vec1.length <= i) {
				System.out.println("TRUE");
			} else {
				if (vec1[i] != vec2[i]) {
					System.out.println("FALSE");
				} else {
					sonIguales(vec1, vec2, i + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] v1 = { 1, 2, 3, 6, 7 };
		int[] v2 = { 1, 2, 3, 4, 5 };
		Ejercicio1.sonIguales(v1, v2, 0);
	}
}
