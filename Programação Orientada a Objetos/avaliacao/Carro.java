package avaliacao;

public class Carro extends Veiculo {
	private double cilindradaMotor;
	
	public Carro(String cor, String marca, int ano, boolean movimentando, double cilindradaMotor) {
		super(cor, marca, ano, movimentando);
		this.cilindradaMotor = cilindradaMotor;
	}
	
	public double getCilindrada() {
		return cilindradaMotor;
	}
	
	public void setCilindrada(double newCilindrada) {
		this.cilindradaMotor = newCilindrada;
	}
	
	@Override
	public void mover() {
		System.out.println("O carro está se movimentando.");
	}
}
