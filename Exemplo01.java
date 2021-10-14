import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		// VETOR
		String nomes[] = new String[3];
		// MATRIZ
		int numeros[][] = new int[3][3];

		// VETOR
		// for(int i=0;i<3;i++) {

		// System.out.println("Digite um nome:");
		// nomes[i]=entrada.next();
		// }

		// CARREGAR MATRIZ
		// Gerencia as linhas da matriz
		for (int indLinha = 0; indLinha < 3; indLinha++) {
			// Gerencia as colunas da matriz
			for (int indColuna = 0; indColuna < 3; indColuna++) {
				System.out.print("Digite o número [" + indLinha + "," + indColuna + "]:");
				numeros[indLinha][indColuna] = entrada.nextInt();

			}

		}
		//EXIBIR MATRIZ
		// Gerencia as linhas da matriz
		for (int indLinha = 0; indLinha < 3; indLinha++) {
			// Gerencia as colunas da matriz
			for (int indColuna = 0; indColuna < 3; indColuna++) {
System.out.println("número["+indLinha+","+indColuna+"]:"+numeros[indLinha][indColuna]);
			}
		}

		
		//EXIBIR MATRIZ FORMATO MATRIZ
		// Gerencia as linhas da matriz
				for (int indLinha = 0; indLinha < 3; indLinha++) {
					// Gerencia as colunas da matriz
					for (int indColuna = 0; indColuna < 3; indColuna++) {
		System.out.print(numeros[indLinha][indColuna]+"\t");
					}
					System.out.println("");
				}
		
		
		
	}

}
