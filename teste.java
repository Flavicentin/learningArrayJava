import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int vendasRevistas[][] = new int[4][3];
		String nomesRevistas[] = new String[] {"Veja", "Quatro Rodas", "VC S/A"};
		String estadosRevistas[] = new String[] {"São Paulo", "Minas Gerais", "Rio de Janeiro", "Espírito Santo"};
		double somaVendaRevista=0;
		int somaVendaEstado=0;
		double totalVendas=0;
		int menorVenda=0;
		int indMenor=0;
		int maiorVenda=0;
		int indMaior=0;
		int maiorCirculacao=0;
		int indMaiorCirculacao=0;
		
		for(int i=0;i<4;i++) {
			System.out.println("\n======= Revistas Vendidas no Estado de "+estadosRevistas[i]+" =======");
			for(int j=0;j<3;j++) {
				System.out.print("Digite a quantidade de revistas "+nomesRevistas[j]+" vendidas: ");
				vendasRevistas[i][j] = input.nextInt();
				totalVendas+=vendasRevistas[i][j];
				somaVendaEstado+=vendasRevistas[i][j];
				
				//ITEM B
				if(i==0 && j==0) {
					menorVenda=somaVendaEstado;
					indMenor=i;
				}
				
				if(somaVendaRevista<menorVenda) {
					menorVenda=somaVendaEstado;
					indMenor=i;
				}
				
				if(somaVendaRevista>maiorVenda) {
					maiorVenda=somaVendaEstado;
					indMaior=i;
				}
			}
			somaVendaEstado=0;
		}
		
		//ITEM A E SAÍDA ITEM A
		System.out.println("\n======= Percentual de Vendas por Revista no Mês =======");
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				somaVendaRevista+= vendasRevistas[j][i];
			}
			System.out.println(nomesRevistas[i]+": "+(somaVendaRevista/totalVendas)*100+"%");
			somaVendaRevista=0;
		}
		
		//SAÍDA ITEM B
		System.out.println("\n======= Relátorio de Melhor e Pior Venda por Estado =======");
		System.out.println("Estado com melhor venda: "+estadosRevistas[indMaior]);
		System.out.println("Estado com pior venda: "+estadosRevistas[indMenor]);
		
		//SAÍCA ITEM C
		
		System.out.println("\n======= Relátorio Revista com Maior Circulação por Estado =======");
		for (int i=0;i<4;i++) {
			for (int j=0;j<3;j++) {
				if (i==0 && j==0) {
					maiorCirculacao=vendasRevistas[i][j];
					indMaiorCirculacao=j;
				}
				if(vendasRevistas[i][j]>maiorCirculacao) {
					maiorCirculacao=vendasRevistas[i][j];
					indMaiorCirculacao=j;
				}
			}
			System.out.println(estadosRevistas[i]+" - "+nomesRevistas[indMaiorCirculacao]);
			maiorCirculacao=0;
		}
		for (int )
	}
}