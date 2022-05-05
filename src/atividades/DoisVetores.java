/*
Faça um programa em Java que recebe 2 vetores A e B de tamanho 8. Em seguida, troque os
valores entre A e B, ou seja, passe os valores de A para B e os valores de B para A. Imprima os
vetores resultantes. */

package atividades;

public class DoisVetores {
	
	public static void main(String args[]) {
		
		int a[] = {1,2,3,4,5,6,7,8};
		int b[] = {9,10,11,12,13,14,15,16};
		int aux[] = new int[8];
		
		System.arraycopy(a, 0, aux, 0, 8);
		for(int i = 0; i < a.length; i++) {
			//System.out.print("aux = "+aux[i]+",");
		}
		
		System.out.println();
		System.arraycopy(b, 0, a, 0, 8);
		for(int j = 0; j < b.length; j++) {
			System.out.print(a[j]+",");
		}
		
		System.out.println();
		System.arraycopy(aux, 0, b, 0, 8);
		for(int k = 0; k < aux.length; k++) {
			System.out.print(b[k]+",");
		}
	
}
}