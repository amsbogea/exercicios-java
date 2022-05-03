/*
 * 6) Criar um programa que leia o nome e repita 10 vezes e mostre-os na tela.
 */

package atividades;

import java.util.Scanner;

public class Atividade006 {
	
	public static void main(String args[]) {
		String nome;
		byte i;
				
		Scanner ler_nome = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		nome = ler_nome.nextLine();
		
		for (i = 1; i <= 10; i++) {
			System.out.println(nome +" "+ i);
		}
		
	}
	
}