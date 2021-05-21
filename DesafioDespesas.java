import java.util.Scanner;

public class DesafioDespesas {
	public static void main(String[] args) {
		double agua, luz, mercado, gas, transporte, total;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da conta de �gua: ");
		agua = sc.nextDouble();

		System.out.print("Digite o valor da conta de Luz: ");
		luz = sc.nextDouble();
		
		System.out.print("Digite o valor da conta do SuperMercado: ");
		mercado = sc.nextDouble();
		
		System.out.print("Digite o valor gasto com g�s (neste m�s): ");
		gas = sc.nextDouble();
		
		System.out.print("Digite o valor gasto com transporte: ");
		transporte = sc.nextDouble();
		
		total = agua + luz + mercado + gas + transporte;
		
		System.out.printf("A sua despesa deste m�s foi de: %.2f" + total);
		System.out.printf("E o valor em m�dia das suas contas � de : %.2f" + total/5);
		sc.close();
	}

}
