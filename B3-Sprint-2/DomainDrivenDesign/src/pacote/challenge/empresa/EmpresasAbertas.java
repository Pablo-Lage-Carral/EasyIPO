package pacote.challenge.empresa;

public class EmpresasAbertas extends Empresa
{
	// Modificador, tipo de dado, variavel
	private double valorAcao;
	private String codigoIsin;
	private String codNegociacao;
	private Noticias noticias;
	private Prospecto prospecto;
	
	// Construtor vazio
	public EmpresasAbertas() {
		super();
	}
	
	// Construtor cheio
	public EmpresasAbertas(double valorAcao, String codigoIsin, String codNegociacao) {
		super();
		this.valorAcao = valorAcao;
		this.codigoIsin = codigoIsin;
		this.codNegociacao = codNegociacao;
	}
	
	// Construtor cheio com atributos de referência
	public EmpresasAbertas(double valorAcao, String codigoIsin, String codNegociacao, Noticias noticias, 
			Prospecto prospecto) {
		super();
		this.valorAcao = valorAcao;
		this.codigoIsin = codigoIsin;
		this.codNegociacao = codNegociacao;
		this.noticias = noticias;
		this.prospecto = prospecto;
	}
	
	// Construtor com herança cheio
	public EmpresasAbertas(String razaoSocial, String cnpj, String segmento,
			double valorAcao, String codigoIsin, String codNegociacao) {
		super(razaoSocial, cnpj, segmento);
		this.valorAcao = valorAcao;
		this.codigoIsin = codigoIsin;
		this.codNegociacao = codNegociacao;
	}

	// Construtor com herança cheio com atributos de referência
	public EmpresasAbertas(String razaoSocial, String cnpj, String segmento,
			double valorAcao, String codigoIsin, String codNegociacao, Noticias noticias, Prospecto prospecto) {
		super(razaoSocial, cnpj, segmento);
		this.valorAcao = valorAcao;
		this.codigoIsin = codigoIsin;
		this.codNegociacao = codNegociacao;
		this.noticias = noticias;
		this.prospecto = prospecto;
	}
	
	// Getters & Setters
	public double getValorAcao() {
		return valorAcao;
	}
	public void setValorAcao(double valorAcao) {
		this.valorAcao = valorAcao;
	}
	public String getCodigoIsin() {
		return codigoIsin;
	}
	public void setCodigoIsin(String codigoIsin) {
		this.codigoIsin = codigoIsin;
	}
	public String getCodNegociacao() {
		return codNegociacao;
	}
	public void setCodNegociacao(String codNegociacao) {
		this.codNegociacao = codNegociacao;
	}
	public Noticias getNoticias() {
		return noticias;
	}
	public void setNoticias(Noticias noticias) {
		this.noticias = noticias;
	}
	public Prospecto getProspecto() {
		return prospecto;
	}
	public void setProspecto(Prospecto prospecto) {
		this.prospecto = prospecto;
	}
}
