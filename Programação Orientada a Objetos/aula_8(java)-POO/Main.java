package aula2_java;

public class Main {

	public static void main(String[] args) {
		InstrumentoMusical instrumento1 = new InstrumentoMusical();
		Guitarra guitarra1 = new Guitarra();
		Piano piano1 = new Piano();
		
		instrumento1.TocarInstrumento();
		guitarra1.TocarInstrumento();
		piano1.TocarInstrumento();
	}

}
