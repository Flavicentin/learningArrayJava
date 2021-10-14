import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int [][] armazen = new int [5][3];
		int [][] estoque = new int [4][3];
		int [] qtdArm = new int [4];
		int maiorProd2 = 0, indProd2 = 0;
		
		for (int i=0; i < 4; i++) {
			System.out.println("Estoque no armazém ( "+(i+1)+" ): ");
			for (int j=0; j < 3; j++) {
				System.out.print("Quantidade em estoque do Produto ( "+(j+1)+" ): ");
				armazen [i][j] = entrada.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Custo do produto ("+(1+i)+ "): ");
			estoque [4][i] = entrada.nextInt();
		}
		
		for (int i=0; i<4; i++) {
			for (int j = 0; j < 3; j++) {
				qtdArm [i] += estoque[i][j];
			}
		}
		System.out.println("Quantidade Armazens");
		for (int i = 0; i <4; i++) {
			System.out.println("Armazen "+(i+1)+":"+qtdArm[i]);
		}
		
		System.out.println("Amazen 2 - Maior Estoque");
		for (int i=0; i < 4; i++) {
			if (estoque[i][1] >maiorProd2) {
				maiorProd2  = estoque [i][1];
				indProd2 = i;
			}
		}
		System.out.println("Qtd maior produto 2 "+maiorProd2+"- Armazen "+indProd2);
	}

}
