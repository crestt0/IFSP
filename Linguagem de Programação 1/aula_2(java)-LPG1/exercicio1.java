import java.util.Scanner;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String array[] = {"segunda feira", "terça feira", "quarta feira", "quinta feira", "sexta feira", "sabado", "domingo"};
		
		try {
		    System.out.println("Insira o numero: ");
		    int numero = scn.nextInt();
		    System.out.println("O dia da semana é: " + array[numero-1]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Digite um numero de 1 a 7");
		}
		catch (Exception e) {
		    System.out.println("Numero invalido");
		}
		
		scn.close();
	}
}
