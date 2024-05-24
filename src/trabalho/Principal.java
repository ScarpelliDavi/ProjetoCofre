package trabalho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		
		int escolha;
		System.out.println("Bem vindo ao cofre!");
		System.out.println("Selecione a opção que desjar");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Listar moedas");
		System.out.println("4-Calcular o valor total das moedas");
		System.out.println("0-Encerrar o programa");
		escolha = teclado.nextInt();
		double valor;
		Moeda moeda = null;
		
		Cofrinho listaMoedas = new Cofrinho();
		
		while(escolha !=0) {
			
			switch(escolha) {
			
			case 1:
				// Aqui o usuario vai selecionar o tipo de moeda,vai dizer se a moeda esta em real,euro ou dolar
				int tipoMoeda = 0;
				while(tipoMoeda >3 || tipoMoeda <=0) {
				System.out.println("Selecione o tipo de moeda");
				System.out.println("1-Real");
				System.out.println("2-Dólar");
				System.out.println("3-Euro");
				tipoMoeda = teclado.nextInt();
				}
				System.out.println("Qual o valor da moeda: ");
				// De acordo com a moeda escolhida, sera adicionado ao arrayList sendo real,dolar ou euro
				valor = teclado.nextFloat();
				if (tipoMoeda == 1) {
					moeda = new Real(valor);
					}
				else if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
					}
				else {
					moeda = new Euro(valor);
					}
				listaMoedas.adicionar(moeda);
				
				break;
				
			case 2:
				//Aqui o usuario vai utilizar a funcao de remover uma moeda
				tipoMoeda = 0;
				while(tipoMoeda >3 || tipoMoeda <=0) {
				System.out.println("Selecione o tipo de moeda");
				System.out.println("1-Real");
				System.out.println("2-Dólar");
				System.out.println("3-Euro");
				tipoMoeda = teclado.nextInt();
				}
				System.out.println("Qual o valor da moeda: ");
				// De acordo com a moeda escolhida, sera removido do arrayList sendo real,dolar ou euro, bem como seu valor
				valor = teclado.nextInt();
				if (tipoMoeda == 1) {
					moeda = new Real(valor);
					}
				else if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
					}
				else {
					moeda = new Euro(valor);
					}
				listaMoedas.remover(moeda);
					
				break;
				
			case 3:
				// nesse case a lista de moedas sera mostrada
				listaMoedas.listar();
				break;
			
			case 4:
				// As moedas em euro e dolar serao convertidas para real e o valor total sera mostrado
				listaMoedas.somar();
				
				break;
			
			default:
				// Se o usuário digitar um numero que nao representa nenhuma das opçoes, sera mostrada a mensagem abaixo
				System.out.println("Opção inválida, selecione corretamente");
			}
			
			System.out.println("Bem vindo ao cofre!");
			System.out.println("Selecione a opção que desjar");
			System.out.println("1-Adicionar moeda");
			System.out.println("2-Remover moeda");
			System.out.println("3-Listar moedas");
			System.out.println("4-Calcular o valor total das moedas");
			System.out.println("0-Encerrar o programa");
			escolha = teclado.nextInt();
		}
		teclado.close();
		System.out.println("Programa encerrado...");
	}
}
