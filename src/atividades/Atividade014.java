/*
1-Programa em Java que mostra os números ímpares de 1 a 100.
*/

package atividades;

public class Atividade014 {
	
	public static void main(String args[]) {
		
		int num;
		
		num = 1;
			
		
		for (int contador = 0; contador <100; contador++){
			if(num %2 != 0) 
				System.out.println(num);	
				num++;
		}
	}
}