package entities;

import java.util.ArrayList;
import java.util.List;

public class Hangar {

	public String nome;
	public String localizacao;
	
	private Helicoptero helicoptero;
	
	private List<ListaHelicopteros> listaHelicopteros = new ArrayList<ListaHelicopteros>();
	
	public Hangar() {
		
	}


	public Hangar(String nome, String localizacao, Helicoptero helicoptero) {
		super();
		this.nome = nome;
		this.localizacao = localizacao;
		this.helicoptero = helicoptero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void addHelicoptero(ListaHelicopteros helicoptero) {
		listaHelicopteros.add(helicoptero);
	}
	
	public void addHelicoptero(ListaHelicopteros helicoptero) {
		listaHelicopteros.remove(helicoptero);
	}
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Nome Hangar: " + nome.toString() + "\n");
		sb.append("Localização: " + localizacao.toString() + "\n");
		
		for (ListaHelicopteros item : listaHelicopteros) {
			sb.append(item + "\n");
		}
		
		return sb.toString();
	}
	
}
