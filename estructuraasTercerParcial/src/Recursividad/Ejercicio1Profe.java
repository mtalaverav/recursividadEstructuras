package Recursividad;

public class Ejercicio1Profe {

	private static void sonIguales(int[] v1,int[] v2, int indice){
		if(v1.length != v2.length){
			System.out.println("ES FALSO");
		}else{
			if(v1.length <= indice){
				System.out.println("ES VERDADERO");
			}else{
				if(v1[indice] != v2[indice]){
					System.out.println("ES FALSO");
				}else{
					sonIguales(v1,v2,indice+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] vector1 = {1,2,3,4,5};
		int[] vector2 = {1,2,3,4,5};
		
		sonIguales(vector1,vector2,0);
		
	}
}
