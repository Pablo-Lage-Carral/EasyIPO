package pacote.challenge.cliente;

public class Cadastro 
{
	// Modificador, tipo de dado, variavel
	private String nome;
	private int idade;
	private String cpf;
	private String usuario;
	private String senha;
	private PerfilInvestidor perfilInvestidor;
	private Contato contato;
	
	// Construtor vazio
	public Cadastro() {
		super();
	}
	
	// Construtor cheio
	public Cadastro(String nome, int idade, String cpf, String usuario, String senha) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	// Construtor cheio com atributos de referência
	public Cadastro(String nome, int idade, String cpf, String usuario, String senha, PerfilInvestidor perfilInvestidor,
			Contato contato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
		this.perfilInvestidor = perfilInvestidor;
		this.contato = contato;
	}

	// Getters & Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public PerfilInvestidor getPerfilInvestidor() {
		return perfilInvestidor;
	}
	public void setPerfilInvestidor(PerfilInvestidor perfilInvestidor) {
		this.perfilInvestidor = perfilInvestidor;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
}
