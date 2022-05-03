/*
 * Escreva um programa que, com base em uma temperatura em graus celsius, 
 * a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
 * seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; 
 * Ra = C * 1.8 + 32 + 459.67
 */

package atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade010 {
	
	public static void main(String args[]) {
		
		double C,K,F,Ra,Re;
				
		System.out.println("Digite a temperatura que deseja converter em celcius");
		Scanner ler_C = new Scanner(System.in);
		C = ler_C.nextDouble();
		
		K = C + 273.15;
		F = C * 1.8 + 32;
		Re = C * 0.8;
		Ra = C * 1.8 + 32 + 459.67;
		
		System.out.println("A temperatura digitada foi "+C+"º celcius\n");
		System.out.println(C+"º celcius é equivalente a "+ new DecimalFormat("#,##0.00").format(K)  + "º Kelvin");
		System.out.println(C+"º celcius é equivalente a "+ new DecimalFormat("#,##0.00").format(F) + "º Fahrenheit");
		System.out.println(C+"º celcius é equivalente a "+ new DecimalFormat("#,##0.00").format(Re) + "º Réaumur");
		System.out.println(C+"º celcius é equivalente a "+ new DecimalFormat("#,##0.00").format(Ra) + "º Rankine");
	}
	
}