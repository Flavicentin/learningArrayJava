import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String[] cidade = new String[5];
		int[][] kmCidade = new int[5][5];
		int gasolina = 0;

		System.out.println("-------------- NOME DAS CIDADES --------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome da " + (i + 1) + "� cidade: ");
			cidade[i] = entrada.next();
		}
		System.out.println("");

		System.out.println("---------- DIST�NCIA ENTRE AS CIDADES ----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					kmCidade[i][j] = 0;
				} else {
					System.out.print("Informe a dist�ncia entre a cidade ( " + cidade[i] + " ) e a cidade ( "
							+ cidade[j] + " ) = ");
					kmCidade[i][j] = entrada.nextInt();
				}
			}
		}
		System.out.println("");
		System.out.println("------- CONSUMO DE COMBUST�VEL POR UM VE�CULO -------");
		System.out.println("");
		System.out.print("Informe o consumo de um ve�culo ");
		gasolina = entrada.nextInt();
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		System.out.println("------------- PERCURSOS INFERIORES A 250Km -------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (kmCidade[i][j] > 0 && kmCidade[i][j] < 250) {
					System.out.println("Dist�ncia: " + kmCidade[i][j] + "km - entra a cidade ( " + cidade[i]
							+ " ) e a cidade ( " + cidade[j] + " )");
				}
			}
		}
		System.out.println("------------- CONSUMO POR PERCURSO -------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (kmCidade[i][j] > 0) {
					System.out.println("Consumo entra a cidade ( " + cidade[i] + " ) e a cidade ( " + cidade[j]
							+ " ) �: " + (kmCidade[i][j] / gasolina) + "Km");
				}
			}
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		System.out.println("");	
	}

}
