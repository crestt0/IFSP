package avaliacao;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro("Cinza", "Chevrolet", 2014, false, 2.0);
		Bicicleta bicicleta1 = new Bicicleta("Preto", "Caloi", 2020, false, 26);
		
		System.out.println("Informações sobre o objeto carro:\nCor: " + carro1.getCor() + "\nAno: " + carro1.getAno() + "\nMarca: " + carro1.getMarca() + "\nEstá se movimentando?: " + carro1.getEstado() + "\nCilindradas: " + carro1.getCilindrada());
		System.out.println("Informações sobre o objeto bicicleta:\nCor: " + bicicleta1.getCor() + "\nAno: " + bicicleta1.getAno() + "\nMarca: " + bicicleta1.getMarca() + "\nEstá se movimentando?: " + bicicleta1.getEstado() + "\nAro do pneu: " + bicicleta1.getAro());
		
		System.out.println("------------Inicialização dos métodos------------");
		
		carro1.iniciarTransporte();
		bicicleta1.iniciarTransporte();
		
		System.out.println("Estado de movimentação da bicicleta: " + bicicleta1.getEstado());
		System.out.println("Estado de movimentação do carro: " + carro1.getEstado());
	}

}
