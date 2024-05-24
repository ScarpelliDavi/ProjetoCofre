package trabalho;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> cofrinho = new ArrayList<Moeda>();
	
	public void adicionar(Moeda x) {
		cofrinho.add(x);
	}
	
	public void remover(Moeda x) {
		cofrinho.remove(x);
	}
	
	public void listar() {
		
		for (Moeda x : cofrinho) {
			System.out.println(x);
		}
	}
	
	public void somar() {
		// soma os valores convertidos e imprime a mensagem com o valor total
	    double soma = 0;
	    for (Moeda moeda : cofrinho) {
	        soma += moeda.converter();
	    }
	    System.out.println("Valor total das moedas em reais: " + soma);
	}
}
