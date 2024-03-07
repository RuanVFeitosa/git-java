package Atividades;

import java.util.Scanner;

public class Algoritimo {

	public static void main (String[] args)  {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner (System.in);
	
	
	double f;
	double k;
	
	System.out.print("Defina a temperatura em Celsius(C°): ");
	double c = sc.nextInt();
	
	f = c * 1.8 + 32;
	k = c + 273;
	
	System.out.println("Sua temperatura em Fahrenheit (F°) " + f);
	System.out.println("Sua temperatura em Kelvin (K°): " + k);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
		
	}

}
