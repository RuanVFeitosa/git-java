package Atividades;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro positivo: ");
		int numero = sc.nextInt();
		        
		if (ehPrimo(numero)) {
		System.out.println(numero + " é um número primo.");
		} else {
		System.out.println(numero + " não é um número primo.");
		        }
		        
	sc.close();
		    }
		    
	public static boolean ehPrimo(int numero) {
	if (numero <= 1) {
		return false;
	}
		      
	for (int i = 2; i <= Math.sqrt(numero); i++) {
	if (numero % i == 0) {
		   return false;
		}
	}
		return true;

	}
}   
              
