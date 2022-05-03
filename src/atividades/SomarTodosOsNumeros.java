package atividades;

public class SomarTodosOsNumeros {
	
	public static void main(String args[]) {
		
		int num = 0; 
		int	soma = 0;
		
		for(int i = 0; i <=100; i++) {
			soma = soma + num;
			num++;
		}
		System.out.println("O resultado da soma de 1\n até 100 é "+ soma);
	}
}