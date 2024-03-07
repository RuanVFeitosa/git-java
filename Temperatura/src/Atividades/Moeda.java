package Atividades;

import java.util.Scanner;

public class Moeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	
		double dolar;
		double euro;
		
		System.out.print("Insira a quantidade em Reais(R$): ");	
		
		double real = sc.nextInt();
		dolar = real / 4.93;
		euro = real / 0.19;
		
		System.out.print("Convertendo para dolar, você tem: " + dolar); System.out.println(" dolares");
		System.out.print("E convertendo para euro, você tem: "  + euro); System.out.println(" euros");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
