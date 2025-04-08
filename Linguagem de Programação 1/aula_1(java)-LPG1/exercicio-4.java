import java.util.Scanner;
import java.io.IOException;

public class ExcecaoAcessoNegado extends Exception{
    ExcecaoAcessoNegado (String login){
        super(login);
    }
}

public class Main
{
	public static void 
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
        try {
            System.out.println("Insira o nome de usuario: ");
            String login = scn.nextLine();
            ExcecaoAcessoNegado(login);
        }
        catch(AcessoNegadoException e){
            System.out.println(e.getMessage());
        }
		
		scn.close();
	}
}
