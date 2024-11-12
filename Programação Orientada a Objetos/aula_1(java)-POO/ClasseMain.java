package aula1_java;

public class Classe_main {

	public static void main(String[] args) {
		Professor professor1 = new Professor();
		Aluno aluno1 = new Aluno();
		Funcionario funcionario1 = new Funcionario();
		
		professor1.nome = "joao";
		professor1.prontuario = 111222333;
		professor1.idade = 40;
		professor1.endereco = "rua do sol 123";
		professor1.materia_lecionada = "matematica";
		
		aluno1.nome = "vinicius";
		aluno1.prontuario = 333222111;
		aluno1.idade = 20;
		aluno1.endereco = "rua da lua 321";
		aluno1.curso = "sistemas de informação";
		
		funcionario1.nome = "pedro";
		funcionario1.prontuario = 000000000;
		funcionario1.idade = 35;
		funcionario1.endereco = "avenida grande 1000";
		funcionario1.cargo = "supervisor";
		
		professor1.ensinar();
		professor1.dar_nota();
		
		aluno1.aprender();
		aluno1.responder_exercicio();
		
		funcionario1.guardar_livro();
		funcionario1.supervisionar();

	}

}
