package pacote.challenge.empresa;

public class Empresa 
{
	// Modificador, tipo de dado, variavel
	private String razaoSocial;
	private String cnpj;
	private String segmento;
	
	// Construtor vazio
	public Empresa() {
		super();
	}
	
	// Construtor cheio
	public Empresa(String razaoSocial, String cnpj, String segmento) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.segmento = segmento;
	}
	
	// Getters & Setters
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
}
