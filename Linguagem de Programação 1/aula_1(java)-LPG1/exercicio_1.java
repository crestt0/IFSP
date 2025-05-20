package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		float a = scanner.nextFloat();

		float b = scanner.nextFloat();
		
		if (a == b) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}

	}

}
