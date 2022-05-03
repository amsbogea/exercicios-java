//1 - Criar um programa que receba três nomes de pessoas e mostre-os na tela.
package atividades;

import java.util.Scanner;

public class Atividade001 {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome1, nome2, nome3;
		
		System.out.println("Digite o primeiro nome:\n");
		nome1 = ler.next();				
		
		System.out.println("Digite o segundo nome:\n");
		nome2 = ler.next();			
		
		System.out.println("Digite o terceiro nome:\n");
		nome3 = ler.next();	
		
		System.out.println("Os nomes digitados foram:");
		System.out.println(nome1);
		System.out.println(nome2);
		System.out.println(nome3);
	}	
}