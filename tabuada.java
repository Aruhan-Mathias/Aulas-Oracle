import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, quant, i;
		
		System.out.print("Digite Qual Tabuada Gostaria Que Eu Resolvesse: ");
		num = sc.nextInt();	
		
		System.out.print("Beleza, At� Qual N�mero Gostaria Que eu Fizesse?: ");
		quant = sc.nextInt();
		sc.close();
		
		for(i = 0; i <= quant; i++) {
			System.out.println(num + " x " + i + " = " + (i * num));
		}
	}
}
