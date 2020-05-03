import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
	int num1, num2;
	
	Scanner leitor = new Scanner(System.in);
	
	int soma, subtracao, divisao, multplicacao, modolo;
	
	//Leitura dos números
	System.out.println("Digite o primeiro número: ");
	num1 = leitor.nextInt();
	
	System.out.println("Digite o segundo número: ");
	num2 = leitor.nextInt();
	
	soma = num1 + num2;
	subtracao = num1 - num2;
	multplicacao = num1 * num2;
	divisao = num1 / num2;
	modolo = num1 % num2;
	
	System.out.println("Soma= "+soma);
	System.out.println("Subtração= "+subtracao);
	System.out.println("Divisão= "+divisao);
	System.out.println("Multiplicação= "+multplicacao);
	System.out.println("Módolo= "+modolo);
	
	
	
	
	
	
	
	
	
	
	

		
	}

}
