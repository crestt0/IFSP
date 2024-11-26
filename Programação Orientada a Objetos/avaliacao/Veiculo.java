package avaliacao;

public class Veiculo {
	private String cor;
	private String marca;
	private int ano;
	private boolean movimentando;
	
	public Veiculo(String cor, String marca, int ano, boolean movimentando) {
		this.cor = cor;
		this.marca = marca;
		this.ano = ano;
		this.movimentando = movimentando;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getAno() {
		return ano;
	}
	
	public boolean getEstado() {
		return movimentando;
	}
	
	public void setCor(String newCor) {
		this.cor = newCor;
	}
	
	public void setMarca(String newMarca) {
		this.marca = newMarca;
	}
	
	public void setAno(int newAno) {
		this.ano = newAno;
	}
	
	public void setEstado(boolean newEstado) {
		this.movimentando = newEstado;
	}
	
	public void iniciarTransporte() {
		if (!this.getEstado()) {
			this.setEstado(true);}
		
			this.mover();
	}
	
	public void mover() {
		System.out.println("O veículo está se movimentando.");
	}
}
