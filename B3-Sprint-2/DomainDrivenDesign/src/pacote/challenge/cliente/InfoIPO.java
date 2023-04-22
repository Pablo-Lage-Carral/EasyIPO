package pacote.challenge.cliente;

import pacote.challenge.empresa.ListagemIpo;

public class InfoIPO 
{
	// Modificador, tipo de dado, variavel
	private String oqueE;
	private ListagemIpo listagemIpo;
	
	// Construtor vazio
	public InfoIPO() {
		super();
	}
	
	// Construtor cheio
	public InfoIPO(String oqueE) {
		super();
		this.oqueE = oqueE;
	}
	
	// Construtor cheio com atributos de referência
	public InfoIPO(String oqueE, ListagemIpo listagemIpo) {
		super();
		this.oqueE = oqueE;
		this.listagemIpo = listagemIpo;
	}

	// Getters & Setters
	public String getOqueE() {
		return oqueE;
	}
	public void setOqueE(String oqueE) {
		this.oqueE = oqueE;
	}
	public ListagemIpo getListagemIpo() {
		return listagemIpo;
	}
	public void setListagemIpo(ListagemIpo listagemIpo) {
		this.listagemIpo = listagemIpo;
	}
}
