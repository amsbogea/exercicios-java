/*Criar um programa que receba pelo teclado um número positivo inteiro N. 
 * Apresentar na tela asoma dos N primeiros números, por exemplo: 
 * se N = 5, então SOMA = 1 + 2 + 3 + 4 + 5.*/

package atividades;

import java.util.Scanner;

public class SomarN {
	
	public static void main(String args[]) {
		
	
		int somar = 0;
		int tamanho;
		
		System.out.println("Digite um número.");
		Scanner ler = new Scanner(System.in);
		tamanho = ler.nextInt();
		
				
		for(int i = 1; i <= tamanho; i++) {
			somar = somar + i;
		}
		System.out.println(somar);
	}
}