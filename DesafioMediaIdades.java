import java.util.Scanner;

public class DesafioMediaIdades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int idade[]  = new int[4];
		 
		for(i = 1;i <= 4; i++) {
			 System.out.print("Digite a idade " + i + " :");
			 idade[i] = sc.nextInt();
				// for(;idade[i] < 0 || idade[i] > 130 ;) {
				//	 System.out.println("Digite um número maior que 0 e menor que 130. Digite novamente: ");
				//	 idade[i] = sc.nextInt();
				// }
			 if(i == 4) {
				 sc.close();
			 }
		 }
		 System.out.println("A média das 3 idades é = " + ((idade[1] + idade[2] + idade[3])));
	}
}