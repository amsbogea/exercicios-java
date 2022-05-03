/*
 * 2 - Criar um programa que leia o nome de uma pessoa, 
 * a sua idade e o seu salário, e mostrar essas informações.
 */

package atividades;

import java.util.Scanner;

public class Atividade002 {
	
	public static void main(String args[]) {
		String nome;
		byte idade;
		double salario;
		
		Scanner ler = new Scanner(System.in);		
		
		System.out.println("Digite seu nome:");
		nome = ler.next();
		
		System.out.println("Digite sua idade:");
		idade = ler.nextByte();
		
		System.out.println("Digite seu salário:");
		salario = ler.nextDouble();
		
		
		System.out.println(nome + " ,hoje com " + idade + " anos, possui um salário de " + salario);
		
	}	
}