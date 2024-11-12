package aula2_java;

public class Retangulo {
	private double comprimento;
	private double largura;
	
	public double calcArea(int a, int b) {
		this.comprimento = a;
		this.largura = b;
		
		double c = comprimento*largura;
		
		return c;
	}
	
	public double calcArea(double a, double b) {
		this.comprimento = a;
		this.largura = b;
		
		double c = comprimento*largura;
		
		return c;
	}
	
	public double calcPerimetro(int a, int b) {
		this.comprimento = a;
		this.largura = b;
		
		double c = comprimento+largura;
		
		return c;
	}
	
	public double calcPerimetro(double a, double b) {
		this.comprimento = a;
		this.largura = b;
		
		double c = comprimento + largura;
		
		return c;
	}
}
