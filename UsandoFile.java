import java.io.File;
import java.io.IOException;

public class UsandoFile {
	public static void main(String[] args) throws IOException {
		File f = new File("teste");
		
		boolean existeArquivo = f.exists(); //boolean se existe o arquivo passado na linha 06
		System.out.println(existeArquivo);
		
		if(existeArquivo == false) {
			f.mkdir(); //cria uma pasta caso não exista
		}
		
		String caminhoArquivo = f.getCanonicalPath();//retorna o caminho até chegar no arquivo
		System.out.println(caminhoArquivo);
		
		long tamanhoArquivo = f.length(); //lê o tamanho do arquivo
		System.out.println(tamanhoArquivo);
		
		boolean conseguiuDeletar = f.delete(); //deleta o arquivo)
		System.out.println(conseguiuDeletar);
		
		boolean ehPasta = f.isFile(); //lê se é uma pasta
		System.out.println(ehPasta);
	}
}