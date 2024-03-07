package Atividades;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
	double imc;
		
	System.out.print("Digite seu peso: ");
	double peso = sc.nextDouble();
	
	System.out.print("Agora, em metros, digite sua altura: ");
	double altura = sc.nextDouble();
	
	imc = peso / (altura * altura);
	
	System.out.print("De acordo com os dadod inseridos, seu IMC: " + imc);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
