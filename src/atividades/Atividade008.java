/*
 * 8)Criar um programa que leia um número real imprima o seu dobro.
 */

package atividades;

import java.util.Scanner;

public class Atividade008 {
	
	public static void main(String args[]) {
		double numreal;			
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor em real");
		numreal = entrada.nextDouble();
		
		numreal = numreal * 2;
		
		System.out.println("O dobro é: " + numreal);
		
	}
	
}