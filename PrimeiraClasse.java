import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
	int num1, num2;
	
	Scanner leitor = new Scanner(System.in);
	
	int soma, subtracao, divisao, multplicacao, modolo;
	
	//Leitura dos n�meros
	System.out.println("Digite o primeiro n�mero: ");
	num1 = leitor.nextInt();
	
	System.out.println("Digite o segundo n�mero: ");
	num2 = leitor.nextInt();
	
	soma = num1 + num2;
	subtracao = num1 - num2;
	multplicacao = num1 * num2;
	divisao = num1 / num2;
	modolo = num1 % num2;
	
	System.out.println("Soma= "+soma);
	System.out.println("Subtra��o= "+subtracao);
	System.out.println("Divis�o= "+divisao);
	System.out.println("Multiplica��o= "+multplicacao);
	System.out.println("M�dolo= "+modolo);
	
	
	
	
	
	
	
	
	
	
	

		
	}

}
