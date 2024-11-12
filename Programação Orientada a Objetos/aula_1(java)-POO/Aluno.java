package aula1_java;

import java.util.Scanner;

public class Aluno {
	
	public String nome;
	public int prontuario;
	public int idade;
	public String endereco;
	public String curso;
	
	private Scanner scanner = new Scanner(System.in);
	
	public void aprender() {
		System.out.println("digite uma informacao: ");
		String info = scanner.nextLine();
		System.out.println("eu aprendi que " + info);
	}
	
	public void responder_exercicio() {
		int resultado;
		
		System.out.println("entre com um numero A: ");
		int A = scanner.nextInt();
		System.out.println("entre com um numero B: ");
		int B = scanner.nextInt();
		resultado = A + B;
		System.out.println("a soma deles e: " + resultado);
	}

}
