import java.util.Scanner;

public class Sprint {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int quantEquipe = 0;
		System.out.println("-------------- ROBOCUP --------------");
		System.out.print("Quantas equipes estão no Robocup? ");
		quantEquipe = entrada.nextInt();

		String[] nomeEquipe = new String[quantEquipe];
		int quantPartida = 0;
		int[] nota = new int[quantEquipe];				
		
		System.out.println("");
		System.out.println("");
		System.out.println("----------- NOMES DOS TIME -----------");
		for (int i = 0; i < quantEquipe; i++) {
			System.out.print("Nome da equipe " + (i + 1) + ": ");
			nomeEquipe[i] = entrada.next();
		}
		System.out.println("");
		System.out.println("");
		System.out.println("-------------- PARTIDAS --------------");
		System.out.print("Quantas partidas serão: ");
		quantPartida = entrada.nextInt();

		char[][] resultado = new char [quantPartida][quantEquipe];
		int[][] valorPartida = new int[quantPartida][quantEquipe];
		int[] somaCampeao = new int[quantEquipe];
		
		for (int i = 0; i < quantPartida; i++) {
			System.out.println("");
			System.out.println("-------------- RODADA " + (1 + i) + " --------------");
			for (int j = 0; j < quantEquipe; j++) {
				System.out.print("Resultado da equipe " + nomeEquipe[j] + " ");

				resultado[i][j] = entrada.next().toUpperCase().charAt(0);

				while (!(resultado[i][j] == 'V') && !(resultado[i][j] == 'E') && !(resultado[i][j] == 'D')) {
					System.out.println("");
					System.out.println("");
					System.out.println("Valor Inválido :/ ");
					System.out.println("Digite entre V, E ou D");
					System.out.println("V - Vitória");
					System.out.println("E - Empate");
					System.out.println("D - Derrota");
					System.out.print("Resultado da equipe " + nomeEquipe[j] + " ");
					resultado[i][j] = entrada.next().toUpperCase().charAt(0);
				}
				if (resultado[i][j] == 'V') {
					valorPartida[i][j] = 5;
				} else if (resultado[i][j] == 'E') {
					valorPartida[i][j] = 3;
				} else if (resultado[i][j] == 'D') {
					valorPartida[i][j] = 0;
				}
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("------------ DESIGN DO ROBO ------------");
		for (int i = 0; i < quantEquipe; i++) {

			System.out.print("Nota do Design do robo da equipe " + nomeEquipe[i] + ": ");

			nota[i] = entrada.nextInt();

			while (nota[i] > 10) {
				System.out.println("");
				System.out.println("Valor Inválido :/");
				System.out.println("Digite um valor menor que 10");
				System.out.print("Nota do Design do robo da equipe " + nomeEquipe[i] + ": ");
				nota[i] = entrada.nextInt();
			}
		}
		System.out.println("");
		for (int i = 0; i < quantEquipe; i++) {
			for (int j = 0; j < quantPartida; j++) {

				somaCampeao[i] += valorPartida[j][i];		
			}
		}
		int a = 0;
		String b;
		for (int i = 0; i < quantEquipe; i++) {	
			for (int j = 0; j < (quantEquipe - 1);j++) {
				if(somaCampeao[j] < somaCampeao[j+1]) {
					a = somaCampeao[j];
					somaCampeao[j] = somaCampeao[j+1];
					somaCampeao[j+1] = a;
					b = nomeEquipe[j];
					nomeEquipe[j] = nomeEquipe[j+1];
					nomeEquipe[j+1] = b;
				}
				if (somaCampeao[j] == somaCampeao[j+1]) {
					somaCampeao[j] = nota[j] + somaCampeao[j];
				}
			}
		}
		System.out.println("");
		System.out.println("----------- CLASSIFICAÇÃO -----------");
		for (int i = 0; i<quantEquipe;i++) {
			System.out.println((1+i)+"º Lugar "+nomeEquipe[i]+" - Pontuação: "+somaCampeao[i]);
		}
	}
}
