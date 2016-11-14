package RecursividadGrafos;
//
//Programar un algoritmo recursivo que permita invertir un número. Ejemplo:
//Entrada: 123 Salida: 321

public class Ejercicio5 {

	public static int Invertir(int n) {
		String invers;
		int inv, i = 0;
		boolean negativo = false;
		if (n < 0) {
			n = n * (-1);
			negativo = true;
		}
		if ((n / 10) == 0) {
			return n;
		} else {
			i = (n % 10);
			String y = String.valueOf(i);
			invers = y + Invertir(n / 10);
			inv = Integer.parseInt(invers);
			if (negativo == true)
				inv = inv * (-1);
		}
		return (inv);
	}

	public static void main(String[] args) {
		System.out.println(Invertir(123));

	}
}
