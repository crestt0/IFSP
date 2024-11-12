package aula2_java;

public class Main {

	public static void main(String[] args) {
		Retangulo retang1 = new Retangulo();
		
		System.out.println("A área do retangulo 1 de medidas 3 por 4 é: " + retang1.calcArea(3, 4));
		System.out.println("A área do retangulo 2 de medidas 5.5 por 7.1 é: " + retang1.calcArea(5.5, 7.1));
		System.out.println("O perímetro do retangulo 1 de medidas 3 por 4 é: " + retang1.calcPerimetro(3, 4));
		System.out.println("O perímetro do retangulo 2 de medidas 5.5 por 7.1 é: " + retang1.calcPerimetro(5.5, 7.1));
	}

}
