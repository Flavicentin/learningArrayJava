import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo03{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMedia = new DecimalFormat("#0.0");
		
		
		double [][] notas = new double [3][4];
		
		
		for(int i=0;i<3;i++) {
			System.out.println("Aluno "+(i+1));
			
			for(int j=0;j<3;j++) {
			System.out.print("Nota Prova "+(j+1)+":");
			//carrega as três notas	
			notas[i][j]=entrada.nextDouble();
			//soma as notas e guarda na última coluna3
			notas[i][3]+=notas[i][j];
				
			}
			//faz a média das notas do aluno
			notas[i][3]=notas[i][3]/3;
		}
		System.out.println();
		System.out.println("Lista de Médias");
		for(int i=0;i<3;i++) {
			System.out.println("Aluno "+(i+1)+":"+formataMedia.format((notas[i][3])));
		}
		
	}

}
