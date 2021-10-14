import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		String[] arrayLoja = new String[] { "A", "B", "C", "D", "F", "G", "H", "I", "J", "K" };
		String[] arrayPro = new String[] { "w", "x", "z", "y" };

		double[][] arrayPreco = new double[4][8];

		for (int i = 0; i < 4; i++) {
			System.out.println(arrayPro[i]);

			for (int j = 0; j < 8; j++) {
				System.out.println("Informe o nome da loja " + arrayLoja[j] + ":");
				arrayPreco[i][j] = (int) (Math.random() * 190);

			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(arrayPro[i]);

			for (int j = 0; j < 8; j++) {
				if (arrayPreco[i][j] < 120) {
					System.out.println("Loja:"+arrayLoja[i] + " - Preço:" + arrayPreco[i][j]);
				}

			}
		}

	}

}
