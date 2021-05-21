import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		int nota1, nota2, nota3;
		
		System.out.println("Digite a Primeira Nota: ");
		Scanner sc = new Scanner(System.in);
		nota1 = sc.nextInt();
		
		for(;nota1 > 10 || nota1 <= 0;) {
			System.out.println("Digite uma nota de 0 a 10: ");
			nota1 = sc.nextInt();
		}
		System.out.println();
		for(;nota2 > 10 || nota2 <= 0;) {
			System.out.println("Digite uma nota de 0 a 10: ");
			nota2 = sc.nextInt();
		}
		nota3 = 4;
		
		System.out.println("Sua média foi: " + ( ((nota1 * 2) + (nota2 * 4) + (nota3 * 8)) / 14));
	}
}
