package aula2_java;

public class Main {

	public static void main(String[] args) {
		Música musica1 = new Música("White Ferrari", "Frank Ocean", 249, "Neo Soul");
		Podcast podcast1 = new Podcast("PodPah", "Igão e Mítico", 11273, 248);
		
		musica1.exibirInfo();
		podcast1.exibirInfo();
		
		System.out.println("O gênero da música é: " + musica1.getGenero());
		System.out.println("O episódio do podcast é:" + podcast1.getEpisodio());
		
		System.out.println("-----------------------------------------------------------------");
		
		musica1.setAutor("Tyler, the creator");
		musica1.setTitulo("She (Ft. Frank Ocean)");
		musica1.setDuraçao(294);
		musica1.seteGenero("Rap");
		
		podcast1.setTitulo("Bocadinhas");
		podcast1.setAutor("Lucas e Marcelo");
		podcast1.setDuraçao(13872);
		podcast1.setEpisodio(112);
		
		musica1.exibirInfo();
		podcast1.exibirInfo();
		
		System.out.println("O gênero da música é: " + musica1.getGenero());
		System.out.println("O episódio do podcast é:" + podcast1.getEpisodio());
	}

}
