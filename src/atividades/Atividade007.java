/*
 * 7 - Criar um programa que calcule a média de 2 notas e mostrar essa média na tela.
 */

package atividades;

import java.util.Scanner;

public class Atividade007 {
	
	public static void main(String args[]) {
		double nota1;
		double nota2;
		double media;	
		
		Scanner lern1 = new Scanner(System.in);
		System.out.println("Digite o valor em real");
		nota1 = lern1.nextDouble();
		
		Scanner lern2 = new Scanner(System.in);
		System.out.println("Digite o valor em real");
		nota2 = lern2.nextDouble();
		
		media = ((nota1 + nota2) / 2);
		
		System.out.println("A média é " + media );
		
	}
	
}