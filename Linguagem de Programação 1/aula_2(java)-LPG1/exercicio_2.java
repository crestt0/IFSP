import java.util.Scanner;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nome = "admin";
		
		try { // 'try' é o bloco onde o codigo principal irá ser executado
		    System.out.println("Insira o login: ");
		    String login = scn.nextLine();
		    if (!login.equals(nome)){
		        throw new IllegalArgumentException("Login invalido"); // 'throw' é a criação manual de uma exceção, é preciso usar 'new' junto do tipo de exceção e uma mensagem de erro
		    }
		    else{
		        System.out.println("Login valido");
		    }
		}
		catch (IllegalArgumentException e){ // 'catch' é o bloco que irá ser executado caso alguma exceção aconteca, e ele recebe como parametros o tipo de exceção
		    System.out.println(e.getMessage());
		}
		finally{ // 'finally' é o bloco que sempre será executado idependente da ocorrencia de uuma exceção
		    System.out.println("O acesso ao login foi executado");
		}
		
		scn.close();
	}
}
