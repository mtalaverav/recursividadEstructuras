package RecursividadGrafos;
//Programar un algoritmo recursivo que calcule el Maximo comun divisor de

//dos números.

public class Ejercicio11 {

	static int mcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return mcd(b, a % b);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(mcd(15, 30));
	}

}
