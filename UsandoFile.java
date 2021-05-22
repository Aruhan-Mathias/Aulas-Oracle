import java.io.File;
import java.io.IOException;

public class UsandoFile {
	public static void main(String[] args) throws IOException {
		File f = new File("teste");
		
		boolean existeArquivo = f.exists(); //boolean se existe o arquivo passado na linha 06
		System.out.println(existeArquivo);
		
		if(existeArquivo == false) {
			f.mkdir(); //cria uma pasta caso n�o exista
		}
		
		String caminhoArquivo = f.getCanonicalPath();//retorna o caminho at� chegar no arquivo
		System.out.println(caminhoArquivo);
		
		long tamanhoArquivo = f.length(); //l� o tamanho do arquivo
		System.out.println(tamanhoArquivo);
		
		boolean conseguiuDeletar = f.delete(); //deleta o arquivo)
		System.out.println(conseguiuDeletar);
		
		boolean ehPasta = f.isFile(); //l� se � uma pasta
		System.out.println(ehPasta);
	}
}