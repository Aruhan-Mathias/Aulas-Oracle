package gf.music;

public class MusicStarter {
	public static void main(String[] args) {
		
		Musica minhaMusica = new Musica();

		minhaMusica.nome = "c�u azul";
		minhaMusica.artista = "CBJ";
		minhaMusica.duracao = 3.20;

		minhaMusica.tocar();
		minhaMusica.parar();
		minhaMusica.darNota((byte)4);
		
		System.out.println("O Nome da M�sica �: " + minhaMusica.nome);
	}
}
