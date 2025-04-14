package exercicio;

import java.util.Scanner;

public class exercicio {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

boolean EmAvaliacaoGratuita = scan.nextBoolean();

System.out.println((!EmAvaliacaoGratuita) ? "Acesso permitido ao conteúdo exclusivo" : "Acesso restrito durante o período de avaliação gratuita");


}

}
