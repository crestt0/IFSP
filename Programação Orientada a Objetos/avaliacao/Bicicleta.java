package avaliacao;

public class Bicicleta extends Veiculo {
	private double aroPneu;
	
	public Bicicleta(String cor, String marca, int ano, boolean movimentando, double aroPneu) {
		super(cor, marca, ano, movimentando);
		this.aroPneu = aroPneu;
	}
	
	public double getAro() {
		return aroPneu;
	}
	
	public void setAro(double newAro) {
		this.aroPneu = newAro;
	}
	
	@Override
	public void mover() {
		System.out.println("A bicicleta está se movimentando.");
	}
}
