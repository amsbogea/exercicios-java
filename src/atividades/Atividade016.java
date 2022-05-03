/*
))Faça um programa que receba um número inteiro entre 1 e 12 e informe o mês correspondente,
por exemplo, se a entrada for: 1, exiba Janeiro; 2, exiba Fevereiro;
Obs: Utilizar o comando switch case
 */

package atividades;

import java.util.Scanner;

public class Atividade016 {
	
	public static void main(String args[]) {
		
		byte mes;
		
		System.out.println("Digite o número entre 1 e 12.");
		Scanner ler_mes= new Scanner(System.in);
		mes = ler_mes.nextByte();
		
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
			
		case 2:
			System.out.println("Fevereiro");
			break;
		
		case 3:
			System.out.println("Março");
			break;
			
		case 4:
			System.out.println("Abril");
			break;
			
		case 5:
			System.out.println("Maio");
			break;
			
		case 6:
			System.out.println("Junho");
			break;
			
		case 7:
			System.out.println("Julho");
			break;
			
		case 8:
			System.out.println("Agosto");
			break;
			
		case 9:
			System.out.println("Setembro");
			break;
			
		case 10:
			System.out.println("Outubro");
			break;
			
		case 11:
			System.out.println("Novembro");
			break;
			
		case 12:
			System.out.println("Dezembro");
			break;	
			
		default:
			System.out.println("Não existe mês refente ao número " + mes);
			break;
		}
	
}
}