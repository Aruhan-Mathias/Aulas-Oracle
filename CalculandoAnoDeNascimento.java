import java.util.Scanner;

public class CalculandoAnoDeNascimento {
	public static void main(String[] args) {
		int ano, idade, calc;
		 ano = 2021;
		 
		 System.out.print("Digite sua idade: ");
		 Scanner sc = new Scanner(System.in);
		 
		 idade = sc.nextInt();
		 
		 for(;idade <= 0;) {
			 System.out.println("Digite Uma Idade Maior Que 0.");
			 System.out.print("Digite sua idade: ");
			 idade = sc.nextInt();
		 }
		 
		 for(;idade >= 130;) {
			 System.out.println("Infelizmente n�o tem ningu�m vivo com essa idade :( ");
			 System.out.print("Digite sua idade: ");
			 idade = sc.nextInt();
		 } calc = (ano - idade);
		System.out.println( "Voc� nasceu em " + calc);
	}
}
