/*
 * 5 - Criar um programa que leia um valor em Real e a cotação do dólar, 
 * e converta esse valor em dólares.
 */

package atividades;

import java.util.Scanner;

public class Atividade005 {
	
	public static void main(String args[]) {
		double real;
		
			
		
		Scanner convert = new Scanner(System.in);
		System.out.println("Digite o valor em real");
		real = convert.nextDouble();
		
		double dollar = real / 4.97;
		
		System.out.println("A conversão de " + real + " reais para dollar é: " + dollar + " dollares");
		
	}
	
}