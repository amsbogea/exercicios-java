/*
 Escreva um programa que peça para o usuário informar qual tabuada o mesmo deseja ver e
armazene o número em uma variável. Em seguida, imprima a tabuada na tela se utilizando da
instrução FOR.
*/

package atividades;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String args[]) {
		
		int tabuada = 0;
		int num;
		
		System.out.print("Digite um número: ");
		Scanner ler_num = new Scanner(System.in);
		num = ler_num.nextInt();
		
		System.out.println();
		System.out.println("Adição");
		for(int soma = 0; soma <=10; soma++) {
			tabuada = num + soma;
			System.out.println(num +" + "+ soma +" = " + tabuada);
		}
		
		System.out.println("");
		System.out.println("Subtração");
		for(int subt = 0; subt <=10; subt++) {
			tabuada = num - subt;
			System.out.println(num +" - "+ subt +" = " + tabuada);	
		}
		
		System.out.println("");
		System.out.println("Multiplicação");
		for(int mult = 0; mult <=10; mult++) {
			tabuada = num * mult;
			System.out.println(num +" X "+ mult +" = " + tabuada);
		}
		
		System.out.println("");
		System.out.println("Divisão");
		for(int Divi = 1; Divi <=10; Divi++) {
			tabuada = num / Divi;
			System.out.println(num +" / "+ Divi +" = " + tabuada);
			
		}
	}
}