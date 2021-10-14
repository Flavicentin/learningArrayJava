//5) Elabore um programa que receba a quantidade de matr�culas de cinco cursos em tr�s
//unidades diferentes nos dois semestres do ano. O programa dever� armazenar as
//matr�culas em duas matrizes 5x3. A terceira matriz que � a anual � uma matriz 5x3 tamb�m,
//ela recebe o resultado da soma das duas matrizes anteriores. Dever� ainda calcular e
//mostrar:

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5_V {

	public static void main(String[] args) {
		// TODO Auto-generated method stubF
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");

		// Variav�is
		int semestre1[][] = new int[5][3]; // Matriz que controla a quantidade de matr�culas no 1� semestre
		int semestre2[][] = new int[5][3]; // Matriz que controla a quantidade de matr�culas no 1� semestre
		int somaAno[][] = new int[5][3]; // Matriz que controla a quantidade de matr�culas no ano
		int somaUnidade[] = new int[3]; // Controla a soma das unidades
		int somaCurso [] = new int [5]; // Controla a soma dos cursos
		int maior = 0; // Controla o maior n�mero de matr�culas

		// Entrada dos dados - 1� Semestre
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("1� Semestre");
		System.out.println("-------------------------------------------------------------------------------------");
		for (int curso = 0; curso < 5; curso++) { // controla os cursos [linha]
			for (int unidade = 0; unidade < 3; unidade++) { // controla as unidades [coluna]
				System.out.print("Digite o n�mero de inscritos no 1� Semestre no curso " + (curso + 1) + " na unidade "
						+ (unidade + 1) + ": ");
				semestre1[curso][unidade] = entrada.nextInt();

			}

		}

		// Entrada dos dados - 2� Semestre
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("2� Semestre");
		System.out.println("-------------------------------------------------------------------------------------");
		for (int curso = 0; curso < 5; curso++) { // controla os cursos [linha]
			for (int unidade = 0; unidade < 3; unidade++) { // controla as unidades [coluna]
				System.out.print("Digite o n�mero de inscritos no 2� Semestre no curso " + (curso + 1) + " na unidade "
						+ (unidade + 1) + ": ");
				semestre2[curso][unidade] = entrada.nextInt();

				// Soma da quantidade de matr�culas de cada curso por unidade no ano
				somaAno[curso][unidade] += semestre1[curso][unidade] + semestre2[curso][unidade];

			}

		}

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// a) Quantidade de matr�culas de cada curso por unidade no ano;
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("A) QUANTIDADE DE ALUNOS POR CURSO E UNIDADE NO ANO");
		System.out.println("-------------------------------------------------------------------------------------");

		for (int curso = 0; curso < 5; curso++) { // controla os cursos [linha]
			System.out.println("Curso: " + (curso + 1));
			for (int unidade = 0; unidade < 3; unidade++) { // controla as unidades [coluna]

				System.out.println(
						"Quantidade de matr�culas na unidade " + (unidade + 1) + ": " + somaAno[curso][unidade]);
			}

		}

		// Somar a quantidade de matr�culas de cada curso por unidade no ano e o
		// total de matr�culas por unidade no ano

		// b) o total de matr�culas por unidade no ano;

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("B) QUANTIDADE DE MATR�CULAS POR UNIDADE");
		System.out.println("-------------------------------------------------------------------------------------");

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 5; j++) {

				somaUnidade[i] += somaAno[j][i];

				// somaUnidade[0] += somaAno[0][0];
				// somaUnidade[0] += somaAno[1][0];
				// somaUnidade[0] += somaAno[2][0];
				// somaUnidade[0] += somaAno[3][0];
				// somaUnidade[0] += somaAno[4][0];

			}
			System.out.println("Qtd de matriculas unidade " + (i + 1) + ":" + somaUnidade[i]);

		}

		//for (int i = 0; i < 3; i++) {
			//System.out.println("Qtd de matriculas unidade " + (i + 1) + ":" + somaUnidade[i]);

		//}
		
		
		
		// c) o total de matr�culas de cada curso no ano;

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("C) QUANTIDADE DE MATR�CULAS POR CURSO");
		System.out.println("-------------------------------------------------------------------------------------");

		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<3;j++) {
		
				somaCurso[i] += somaAno[i][j];
				
				//somaCurso[0] += somaAno[0][0];	
				//somaCurso[0] += somaAno[0][1];
				//somaCurso[0] += somaAno[0][2];
		
			}//fecha a soma das tr�s unidades
			//proximo passo mostrar a soma do curso
			System.out.println("Qtd de matriculas no curso "+(i+1)+":"+somaCurso[i]);
		}
		
			
		
		// d) O curso com maior n�mero de matr�culas por curso no ano;

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("D)CURSO COM O MAIOR N�MERO DE MATR�CULAS");
		System.out.println("-------------------------------------------------------------------------------------");

		
		for(int i=0;i<5;i++) {
			
			if(somaCurso[i]>maior) {	
				maior=somaCurso[i];
			}
		}
		
		System.out.println("Maior n�mero de matriculas:"+maior );
		
		
	}
}