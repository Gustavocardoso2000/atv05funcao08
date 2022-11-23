//Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado..
import java.util.Scanner;

class App {
	
	public void integer(String number) {
		System.out.println("Este numero tem " + number.length() + " Número.");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		App e = new App();
		
		System.out.println("Digite o numero inteiro: ");
		e.integer(scan.next());
	}
}
