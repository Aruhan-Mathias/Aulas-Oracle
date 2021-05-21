
public class CalculandoAno {
	public static void main(String[] args) {
		int ano, calc;
		ano = 1500;
		
		if (ano >= 1900 && ano <= 2021) {
			calc = 2021 - ano ;
			System.out.println(calc);
		}else { 
			System.out.println("Digite um número menor que 2021");
		}
	}
}
