package pacote.challenge.empresa;

public class Noticias 
{
	// Modificador, tipo de dado, variavel
	private String dataPublicacao;
	private String autor;
	private String conteudo;
	
	// Construtor vazio
	public Noticias() {
		super();
	}
	
	// Construtor cheio
	public Noticias(String dataPublicacao, String autor, String conteudo) {
		super();
		this.dataPublicacao = dataPublicacao;
		this.autor = autor;
		this.conteudo = conteudo;
	}

	// Getters & Setters
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}	
}
