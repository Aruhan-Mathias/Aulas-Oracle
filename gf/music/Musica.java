package gf.music;

public class Musica {
	String nome;
	String genero;
	double duracao;
	String artista;
	byte pontuacao;
	
	void tocar() {
		System.out.println("Dever� Tocar M�sica...");
	}
	
	void parar() {
		System.out.println("Dever� parar a M�sica caso esteja tocando...");
	}
	
	void darNota(byte nota) {
		pontuacao = nota;
	}
}
