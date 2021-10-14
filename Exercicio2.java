import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		//int [][] m = new int [linha][coluna]
		int [][] m = new int [2][2];
		int [][] r = new int [2][2];
		int maiorElemento=0;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("M["+i+","+j+"]:");
				m[i][j]=entrada.nextInt();
				
				if(m[i][j] > maiorElemento) {
					maiorElemento=m[i][j];
				}
				
			}
		}
		
		
		//CARREGAR A MATRIZ R E EXIBIR
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
		
		r[i][j]= m[i][j] * maiorElemento;
				
		
		System.out.println("Resultado Matriz M ["+i+","+j+"]="+r[i][j]);
		
			}
		} 
		
		
		
		
}
} 