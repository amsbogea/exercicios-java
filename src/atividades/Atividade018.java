/*
1-Programa em Java que mostra os números ímpares de 1 a 100.
*/

package atividades;

import java.text.DecimalFormat;
import java.util.Random;

public class Atividade018 {
	
	public static void main(String args[]) {
		
		double media = 0;
		
		double[] notas = new double[100];
		
		for(int j = 0; j < 100; j++) {
			Random aleatorio = new Random();
			notas[j] = aleatorio.nextDouble()*10;
		}
		
		for(int i = 0; i < notas.length; i++) {
			media = media + notas[i];
			
		}
		System.out.printf("A média da turma é %.2f", media/ notas.length);
	}
}