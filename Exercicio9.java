import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int [][] prod = new int [7][4];
		String [] nomeProd = new String [] {"Notebook", "Computador", "Tablets", "Servidores"};
		int [] totalLinha = new int [4];
		int [] totalColuna = new int [4];
		int [] meta = new int [4];
		
		System.out.println("----------- VENDAS -----------");
		for (int i = 0; i < 4; i++) {
			System.out.println("");
			System.out.println("Linhas do Produto: "+nomeProd[i]);
			for (int j = 0; j < 4; j++) {
				System.out.print("--- Vendas "+(j+1)+"º Semestre: ");
				prod [i][j] = entrada.nextInt();
			}
		}
		System.out.println("");
		System.out.println("----------- METAS -----------");
		for (int i = 0; i < 4; i++) {
			System.out.print("Meta do "+(i+1)+"º Trimestre: ");
			meta[i] = entrada.nextInt();
		}
		System.out.println("");
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				totalLinha[i] += prod[j][i];
			}			
		}
		
		for (int i=0; i<4; i++) {
			for (int j = 0; j < 4; j++) {
				totalColuna[j] += prod[i][j];
			}
		}
		int pior = 0, indMenor = 0, melhor = 0, indMaior = 0;
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				pior = totalLinha[i];
				indMenor=i;
			}
			
			if(totalLinha[i] > melhor) {
				melhor = totalLinha[i];		
				indMaior = i;	
			}
			if(totalLinha[i] < pior) {
				pior = totalLinha[i];
				indMenor = i;
			}
		}
		
		System.out.println("----------- RESULTADO VENDAS -----------");
		System.out.println("Melhor Linha "+nomeProd[indMaior]);
		System.out.println("Pior Linha "+nomeProd[indMenor]);
		System.out.println("");
		
		System.out.println("----------- METAS ATINGIDAS -----------");
		System.out.println("Trimestre que atingiram a meta: ");
		for (int i=0; i < 4; i++) {
			if (totalLinha[i] >= meta[i] ) {
				System.out.println(i+1);
			}
		}	
	}
}
