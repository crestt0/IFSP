package Exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String SenhaCorreta = scan.nextLine();
		String SenhaAtual = scan.nextLine();
		
		System.out.println((SenhaCorreta.equals(SenhaAtual)) ? "Acesso Concedido" : "Senha Incorreta");

	}

}
