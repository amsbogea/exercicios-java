/*
 * 4 - Criar um programa que leia 2 números inteiros, 
 * efetuar as 4 operações matemáticas e mostrar os resultados.
 */

package atividades;

import java.util.Scanner;

public class Atividade004 {
	
	public static void main(String args[]) {
		double a;
		double b;
		
		Scanner lerCal = new Scanner(System.in);
		
		System.out.println("Digite primeiro valor.");
		a = lerCal.nextDouble();
		
		System.out.println("Digite segundo valor.");
		b = lerCal.nextDouble();

		double soma = a+b;
		double sub = a-b;
		double mult = a*b;
		double div = a/b;
				
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + sub);
		System.out.println("A multiplicação é: " + mult);
		System.out.println("A divisão é: " + div);
	}	
}