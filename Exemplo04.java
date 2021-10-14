import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo04{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat("#0.00");
		
		int numeros[][] = new int [2][2];
		double valores[][] = new double[2][2];
		double total=0;
		
		for(int i=0; i<2 ;i++) {
			
			System.out.println("Produto "+(i+1));

			System.out.print("Digite o código: ");
			numeros[i][0] = entrada.nextInt();

			System.out.print("Digite o preço: ");
			valores[i][0] = entrada.nextDouble();

			System.out.print("Digite a quantidade: ");
			numeros[i][1] = entrada.nextInt();
		//calcula o subTotal e armazena na matriz coluna 1
			valores[i][1] = valores[i][0] * numeros[i][1];
			
			total += valores[i][1];
		}
	
		
		//LISTA DE PRODUTOS
		System.out.println("");
		for(int i=0;i<2;i++) {
				
		System.out.println("Código:"+numeros[i][0]+"\t Preço:"+formataMoeda.format(valores[i][0])+ "\t Quantidade:"+ numeros[i][1]+"\t Subtotal:"+formataMoeda.format(valores[i][1]));
		}
		System.out.println("");
		System.out.println("Total Geral:"+total);
		
		 
	}
}