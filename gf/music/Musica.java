package gf.music;

public class Musica {
	String nome;
	String genero;
	double duracao;
	String artista;
	byte pontuacao;
	
	void tocar() {
		System.out.println("Deverá Tocar Música...");
	}
	
	void parar() {
		System.out.println("Deverá parar a Música caso esteja tocando...");
	}
	
	void darNota(byte nota) {
		pontuacao = nota;
	}
}
