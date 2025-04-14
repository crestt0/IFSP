package exercicio;

import java.util.Scanner;

public class exercicio {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int Idade = scan.nextInt();
boolean AcompanhadaPorAdulto = scan.nextBoolean();

System.out.println(((Idade >= 18) || AcompanhadaPorAdulto) ? "Permissão concedida" : "Permissão negada");


}

}
