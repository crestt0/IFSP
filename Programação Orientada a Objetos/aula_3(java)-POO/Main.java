package aula2_java;

public class Main {

	public static void main(String[] args) {
		AlunoGraduacao alunogradua = new AlunoGraduacao("Vinicius", "SP111222333", "Sistemas de Informação");
		AlunoPosGraduacao alunopos = new AlunoPosGraduacao("João", "SP333222111", "Tecnologia da Informação");
		AlunoTecnico alunotec = new AlunoTecnico("Pedro", "SP000000000", 360);
		
		alunogradua.mostrarInfo();
		alunogradua.estudar();
		alunogradua.fazerEstagio();
		
		System.out.println("-------------------------------------------");
		
		alunopos.mostrarInfo();
		alunopos.estudar();
		alunopos.defenderTese();
		
		System.out.println("-------------------------------------------");
		
		alunotec.mostrarInfo();
		alunotec.estudar();
		alunotec.realizarProjeto();
		
		System.out.println("-------------------------------------------");
	}

}
