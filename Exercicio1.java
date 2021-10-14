
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Matriz Clientes
		int[][] arrayClientes = new int[4][5];

		for (int indLinha = 0; indLinha < 4; indLinha++) {

			// entradas
			System.out.print("Digite o código do " + (indLinha + 1) + "º cliente:");
			arrayClientes[indLinha][0] = entrada.nextInt();

			System.out.print("Digite a quantidade de milhagem:");
			arrayClientes[indLinha][1] = entrada.nextInt();

			System.out.print("Digite a categoria:");
			arrayClientes[indLinha][2] = entrada.nextInt();

			// validação da categoria
			while ((arrayClientes[indLinha][2] != 1) && (arrayClientes[indLinha][2] != 2)
					&& (arrayClientes[indLinha][2] != 3)) {
				System.out.print("Digite a categoria corretamente:");
				arrayClientes[indLinha][2] = entrada.nextInt();
			}

			if (arrayClientes[indLinha][2] == 1) {
				arrayClientes[indLinha][3] = 10000;
			} else if (arrayClientes[indLinha][2] == 2) {
				arrayClientes[indLinha][3] = 5000;
			} else {
				arrayClientes[indLinha][3] = 0;
			}

			arrayClientes[indLinha][4] = arrayClientes[indLinha][1] + arrayClientes[indLinha][3];

		}

		// RELATÓRIO

		for (int i = 0; i < 4; i++) {

			System.out.println("Código " + arrayClientes[i][0] + "\t Qtd:" + arrayClientes[i][1] + "\t Categoria:"
					+ arrayClientes[i][2] + "\t Bônus:" + arrayClientes[i][3] + "\t Atualizado:" + arrayClientes[i][4]);

		}

	}

}
