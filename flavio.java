import java.util.Scanner;

public final class flavio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RM: 87231
		// NOME: Flavio Marchioretto Vicentin

		Scanner entrada = new Scanner(System.in);

		int[][] matriz = new int[4][3];
		String[] estado = new String[] { "São Paulo", "Minas Gerais", "Rio De Janeiro", "Espirito Santo" };
		String[] revista = new String[] { "Veja", "Quadro Rodas", "VC S/A" };
		int[] totalEstado = new int[4];
		int[] totalRevista = new int[4];
		double totalGeral = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println(estado[i]);
			for (int j = 0; j < 3; j++) {
				System.out.print(revista[j]);
				matriz[i][j] = entrada.nextInt();
				totalGeral += matriz[i][j];
				totalEstado[i] += matriz[i][j];
			}
		}
//		for (int i = 0; i < 4; i++) {
//			System.out.println(totalEstado[i]);
//		}

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 4; i++) {
				totalRevista[j] += matriz[i][j];
			}
		}
//		for (int j = 0; j < 3; j++) {
//			System.out.println(totalRevista[j]);
//		}
		System.out.println(totalGeral);
		for (int j = 0; j < 3; j++) {
			System.out.println((totalRevista[j] / totalGeral) * 100 + "%");
		}

		int menorVenda = 0, indMenor = 0;
		int maiorVenda = 0, indMaior = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					menorVenda = totalEstado[i];
					indMenor = i;
				} else {
					if (totalEstado[i] < indMenor) {
						indMenor = i;
						menorVenda = totalEstado[i];
					}
					if (totalEstado[i] > indMenor) {
						indMaior = i;
						maiorVenda = totalEstado[i];
					}
				}
			}
		}
		System.out.println("Pior: " + estado[indMenor]);
		System.out.println("Maior: " + estado[indMaior]);
		
		int maiorCircula = 0, indCircula = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (matriz[i][j] > maiorCircula) {
					maiorCircula = matriz[i][j];
					indCircula = j;
				}
				
			}
			System.out.println(estado[i]+": "+revista[indCircula]);
			maiorCircula = 0;
		}
	}
}
