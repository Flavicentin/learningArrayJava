
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int[][] numeros = new int[4][4];
		int somaLinha = 0, somaMatriz = 0, somaColuna=0;


		// CARREGAR MATRIZ
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Digite o valor [linha " + i + "- Coluna " + j + "]:");
				numeros[i][j] = entrada.nextInt();
				//soma matriz
				somaMatriz+=numeros[i][j];
			} // fecha j
		} // fecha i

		
		
		// SOMAR LINHA / MATRIZ
		for (int i = 0; i < 4; i++) {
			//precisa zerar a variável para próxima linha
			somaLinha=0;
			somaColuna=0;
			for (int j = 0; j < 4; j++) {
				somaLinha+=numeros[i][j];
				somaColuna+=numeros[j][i];
				
			}
			System.out.println("Soma Linha:"+somaLinha);
			System.out.println("Soma Coluna:"+somaColuna);
			
		} 
		System.out.println("");
		System.out.println("Soma Matriz:"+somaMatriz);
		
		
		
	}
}