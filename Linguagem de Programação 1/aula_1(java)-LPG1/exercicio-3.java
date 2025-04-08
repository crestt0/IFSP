import java.util.Scanner;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		try{
		    System.out.println("Digite sua idade: ");
		    int idade = scn.nextInt();
		    if (idade < 18){
		        throw new IllegalArgumentException("Acesso negado");
		    }
		    else {
		        System.out.println("Acesso permitido, bem vindo ao evento");
		    }
		}
		catch (IllegalArgumentException e){
		    System.out.println(e.getMessage());
		}
		catch (Exception e){
		    System.out.println("Entrada inválida");
		}
		
		scn.close();
	}
}
