//3 - Criar um programa que leia um número real imprima o seu dobro.

package atividades;

import java.util.Scanner;

public class Atividade003 {
	
	public static void main(String args[]) {
		double num;	
		
		Scanner lernum = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		num = lernum.nextDouble();
		
		System.out.println("O dodro do número digitado é: " + num*2);
	}
	
}