package br.ucsal.model;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
	private int numero;
	private boolean aberta;
	private int qtdDeClientes;
	private List<Garcom> garcons = new ArrayList<>();
	private List<Item> itens = new ArrayList<>();
	private Mesa mesa;

	public int getNumero() {
		return numero;
	}

	public boolean isAberta() {
		return aberta;
	}

	public int getQtdDeClientes() {
		return qtdDeClientes;
	}

	public List<Garcom> getGarcons() {
		return garcons;
	}

	public List<Item> getItens() {
		return itens;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public void setQtdDeClientes(int qtdDeClientes) {
		this.qtdDeClientes = qtdDeClientes;
	}

	public void setGarcons(List<Garcom> garcons) {
		this.garcons = garcons;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

}
