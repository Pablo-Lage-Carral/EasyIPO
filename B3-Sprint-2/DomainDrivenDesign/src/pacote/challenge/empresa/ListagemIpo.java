package pacote.challenge.empresa;

public class ListagemIpo extends EmpresasAbertas
{
	// Modificador, tipo de dado, variavel
	private String dataLancamento;

	// Construtor vazio
	public ListagemIpo() {
		super();
	}
	
	// Construtor cheio
	public ListagemIpo(String dataLancamento) {
		super();
		this.dataLancamento = dataLancamento;
	}
	
	// Construtor com herança Empresas/EmpresasAbertas cheio sem atributos de referencia
	public ListagemIpo(String dataLancamento, String razaoSocial, String cnpj, String segmento, double valorAcao, String codigoIsin,
			String codNegociacao) {
		super(razaoSocial, cnpj, segmento, valorAcao, codigoIsin, codNegociacao);
		this.dataLancamento = dataLancamento;
	}	
	
	// Construtor com herança Empresas/EmpresasAbertas cheio com atributos de referencia
	public ListagemIpo(String dataLancamento, String razaoSocial, String cnpj, String segmento, double valorAcao, String codigoIsin,
			String codNegociacao, Noticias noticias, Prospecto prospecto) {
		super(razaoSocial, cnpj, segmento, valorAcao, codigoIsin, codNegociacao, noticias, prospecto);
		this.dataLancamento = dataLancamento;
	}
	
	// Construtor com herança EmpresasAbertas cheio com atributos de referencia
	public ListagemIpo(String dataLancamento, double valorAcao, String codigoIsin, String codNegociacao, Noticias noticias,
			Prospecto prospecto) {
		super(valorAcao, codigoIsin, codNegociacao, noticias, prospecto);
		this.dataLancamento = dataLancamento;
	}
	
	// Getter & Setters
	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
}
