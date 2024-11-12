package aula1_java;

import java.util.Scanner;

public class Funcionario {
	public String nome;
	public int prontuario;
	public int idade;
	public String endereco;
	public String cargo;
	
	private Scanner scanner = new Scanner(System.in);
	
	public void guardar_livro() {
		System.out.println("o livro esta fora do lugar(s ou n)? R: ");
		String R = scanner.nextLine();
		
		if (R.equals("s")) {
		System.out.println("vou devolve-lo ao lugar certo");}
		else {
		System.out.println("deixe ele onde esta");}
		}
	
	
	public void supervisionar() {
		System.out.println("esta tendo baderna na biblioteca?(s ou n)? R: ");
		String R = scanner.nextLine();
		
		if (R.equals("s")) {
		System.out.println("irei tomar uma atitude");}
		else {
		System.out.println("continuarei supervisionando");}
	}

}
