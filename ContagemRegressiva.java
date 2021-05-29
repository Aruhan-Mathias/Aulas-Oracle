
public class ContagemRegressiva {
	public static void main(String[] args) {
		//Contagem regressiva do 9 ao 1, quando i for igual a 1 printar "FOI!"
		int i;
		for(i = 9; i > 0; i--) {
			System.out.println(i);
			if(i==1) {
				System.out.println("FOI!");
			}
		}
	}
}
