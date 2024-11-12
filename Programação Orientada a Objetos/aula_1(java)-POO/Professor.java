package aula1_java;

import java.util.Scanner;

public class Professor {
	public String nome;
	public int prontuario;
	public int idade;
	public String endereco;
	public String materia_lecionada;
	
	private Scanner scanner = new Scanner(System.in);
	
	public void ensinar() {
		System.out.println("Apenas quatro planetas do Sistema Solar são telúricos, isto é, têm solo rochoso. Os planetas rochosos do Sistema Solar são Mercúrio, Vênus, Terra e Marte. Os demais planetas do sistema são formados exclusivamente por um grande amontoado de gases presos por uma grande interação gravitacional.");
		}
	
	public void dar_nota() {
		System.out.println("quanto eh 2 + 3? R: ");
		int R = scanner.nextInt();
		
		if (R == 5) {
		System.out.println("parabens, tirou 10");}
		else {
		System.out.println("que pena, tirou 0");}
	}

}
