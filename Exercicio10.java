import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int [][] matriz1 = new int [3][3];
		int [][] matriz2 = new int [3][3];
		int [][] bimestre = new int [3][4];
		int [][] meta = new int [3][4];
		int totalProduto = 0;
		
		for (int i = 0; i < 3; i ++) {
			System.out.println("Loja "+(i+1));
			for (int j = 0; j < 3; j++) {
				System.out.print("Vendas do prod"+(1+j)+": ");
				matriz1 [i][j] = entrada.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i ++) {
			System.out.println("Loja "+(i+1));
			for (int j = 0; j < 3; j++) {
				System.out.print("Vendas do prod"+(1+i)+": ");
				matriz2 [i][j] = entrada.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for ( int j = 0; j < 3	; j++) {
				bimestre [i][j] = matriz1[i][j] + matriz2[i][j];
				totalProduto += bimestre[i][j];
			}
		}
		
		for (int i = 0; i<3; i++) {
			System.out.println("Metas");
			meta[i][4] = entrada.nextInt();
		}
	}
}
