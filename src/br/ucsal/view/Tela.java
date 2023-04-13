package br.ucsal.view;

import br.ucsal.model.Comanda;

public class Tela {
	public static void main(String[] args) {
		Comanda comanda = new Comanda();
		int numero = comanda.getNumero();
		System.out.println(numero);
		comanda.setNumero(5);
		System.out.println(comanda.getNumero());
	}
}
