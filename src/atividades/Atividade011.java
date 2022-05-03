/*
 * Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
 * Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */

package atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade011 {
	
	public static void main(String args[]) {
		
		double altura, maiorAltura = 0;
		
		double  mediaAltura, totalAltura;
		
		double menorAltura = 1000;
		
		String sexo;
		
		byte i;
		
		for (i = 1; i <= 4; i++) {
			System.out.println("Digite a altura");
			Scanner ler_altura = new Scanner(System.in);
			altura = ler_altura.nextDouble();
			
			System.out.println("Digite o sexo 'F' ou 'M'");
			Scanner ler_sexo = new Scanner(System.in);
			sexo = ler_sexo.next();
			
				if(altura > maiorAltura) {
					maiorAltura = altura;
				}
				
				if(altura < menorAltura) {
					menorAltura = altura;
				}
				
				if(sexo.equals(ler_sexo))  {
					maiorAltura = altura;
				}
				
							
			
		}
						
		System.out.println("a maior e a menor altura do grupo");
		System.out.println("média de altura dos homens");
		System.out.println("o número de mulheres");
		
	}
	
}