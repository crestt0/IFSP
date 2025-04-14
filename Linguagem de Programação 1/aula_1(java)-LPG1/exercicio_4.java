package exercicio;

import java.util.Scanner;

public class exercicio {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int Idade = scan.nextInt();
boolean AutorizacaoDosPais = scan.nextBoolean();
int Altura = scan.nextInt();

System.out.println(((Idade >= 12 && Altura >= 150) || (AutorizacaoDosPais && Altura >=140)) ? "A pessoa pode entrar no brinquedo" : "A pessoa não pode entrar no brinquedo");


}

}
