/*
)Criar um programa que leia pelo teclado um valor inteiro e diga se é par ou ímpar.
Obs: Utilizar o comando SE
 */

package atividades;

import java.util.Scanner;

public class Atividade015 {
	
	public static void main(String args[]) {
		
		double num;
				
		System.out.println("Digite o número.");
		Scanner ler_num = new Scanner(System.in);
		num = ler_num.nextDouble();
		
		if(num %2 == 0) {
		System.out.println("O número "+num+" é par");
	}else {
		System.out.println("O número "+num+" é impar");
	}
	
}
}