import java.util.Scanner;
import java.io.IOException;

class ExcecaoAcessoNegado extends Exception{
    ExcecaoAcessoNegado (String login){
        super(login);
    }
}

public class Main
{
	public static void Verificacao (String login) throws ExcecaoAcessoNegado{
	    if (!login.equals("admin")){
	        throw new ExcecaoAcessoNegado("Acesso negado");
	    }
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
        try {
            System.out.println("Insira o nome de usuario: ");
            String login = scn.nextLine();
            Verificacao(login);
        }
        catch(ExcecaoAcessoNegado e){
            System.out.println(e.getMessage());
        }
		
		scn.close();
	}
}
