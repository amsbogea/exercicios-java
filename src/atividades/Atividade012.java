/*
 * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Crie um programa que receba a quantidade de maçãs compradas, calcule
e escreva o custo total da compra.
Obs: Utilizar o comando SE
 */

package atividades;

import java.util.Scanner;

public class Atividade012 {
	
	public static void main(String args[]) {
		
		double valMaca;
		byte qtdMaca;
				
		System.out.println("Digite a quantidade de maçãs compradas.");
		Scanner ler_qtdMaca = new Scanner(System.in);
		qtdMaca = ler_qtdMaca.nextByte();
		
		if (qtdMaca >= 12 ) {
			valMaca = 1.00 * qtdMaca;}
			else { 
				valMaca = 1.30 * qtdMaca;
		}
		
		System.out.println("O custo total da compra é " + (valMaca));
		
	}
	
}