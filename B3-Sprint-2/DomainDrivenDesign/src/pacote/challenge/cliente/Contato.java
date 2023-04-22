package pacote.challenge.cliente;

public class Contato 
{
	// Modificador, tipo de dado, variavel
	private String email;
	private String celular;
	
	// Construtor vazio
	public Contato() {
		super();
	}
	
	// Construtor cheio
	public Contato(String email, String celular) {
		super();
		this.email = email;
		this.celular = celular;
	}

	// Getters & Setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
}
