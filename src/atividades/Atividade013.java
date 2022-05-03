/*
Criar um algoritmo que receba a idade de um nadador e informe a sua categoria: infantil (até 10
anos), juvenil (até 17 anos) ou sênior (acima de 17 anos).
Obs: Utilizar o comando SE
 */

package atividades;

import java.util.Scanner;

public class Atividade013 {
	
	public static void main(String args[]) {
		
		double idade;
				
		System.out.println("Digite a idade do nadador.");
		Scanner ler_idade = new Scanner(System.in);
		idade = ler_idade.nextByte();
		
		if (idade <= 10) {
			System.out.println("Categoria infantil");
			}else if (idade <= 17) {
						System.out.println("Categoria juvenil");
		}else
			System.out.println("Categoria sênior");
		
	}
	
}