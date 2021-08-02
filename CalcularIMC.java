import java.util.Scanner;

public class CalcularIMC {
	public static void main(String[] args) {
		calcularIMC();
	}
	static void calcularIMC() {
		Scanner sc = new Scanner(System.in);
		double altura = sc.nextDouble();
		double peso = sc.nextDouble();
		sc.close();
		
		double imc = peso/(altura*altura);
		System.out.println("Seu IMC é: " + imc);
	}
	
}
