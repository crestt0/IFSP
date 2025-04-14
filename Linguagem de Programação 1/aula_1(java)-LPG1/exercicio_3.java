package Exercicio3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Float Numero = scan.nextFloat();
		
		if (Numero == 0) {
			System.out.println("Zero");
		}
		else {
			System.out.println((Numero < 0) ? "Negativo" : "Positivo");
		}

	}

}
