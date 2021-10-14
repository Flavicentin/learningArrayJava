import java.util.Scanner;

//FLAVIO MARCHIORETTO 
// BRUNO HENRIQUE
// VITOR AUGUSTO
// GIOVANNA DOS ANJOS

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		double[][] preco = new double[5][4];
		double[][] imposto = new double[5][4];
		String[] prod = new String[5];
		double[] trans = new double[5];
		
		double[] porc = new double[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o nome do produto " + (i + 1) + ": ");
			prod[i] = entrada.next();
			System.out.print("Indorme o custo do transporte do prodtuo " + (i + 1) + ": ");
			trans[i] = entrada.nextDouble();
			System.out.println("");
			
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o preço do produto: " + prod[i]);
			for (int j = 0; j < 4; j++) {

				System.out.print("Preço do produto da loja " + (1 + j) + ": ");
				preco[i][j] = entrada.nextDouble();
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Nome do produto: "+prod[i] +" - Custo do trasnporte: "+trans[i]);
			for (int j = 0; j < 4; j++) {
				//CALCULANDO IMPOSTO
				if (preco[i][j] <= 50) {
					porc [i] = trans[i]*0.05;
				} else {
					if (preco[i][j] >= 50.1 && preco[i][j] < 100) {
						porc [i] = trans[i]*0.10;
					} else {
						if (preco[i][j] > 100) {
							porc [i] = trans[i]*0.20;
						}
					}
				}
				
				System.out.println("--------Loja "+(j+1)+"--------");
				System.out.println("--------Imposto: "+porc[i]);
				System.out.println("--------Preço: "+preco[i][j]);
				System.out.println("--------Preço Final: "+ (preco[i][j] + porc[i] + trans[i]));
			}
		}
	}

}
