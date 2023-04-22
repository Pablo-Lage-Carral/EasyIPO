package pacote.challenge.empresa;

public class Prospecto extends Graficos
{
	// Modificador, tipo de dado, variavel
	private String classificacao;
	private String dataDisponibilizacao;
	private String destinacaoRecurso;
	private double valorOferta;
	private double valorEstMaximoAcao;
	private double valorEstMinimoAcao;
	
	// Construtor vazio
	public Prospecto() {
		super();
	}
	
	// Construtor cheio
	public Prospecto(String classificacao, String dataDisponibilizacao, String destinacaoRecurso, double valorOferta,
			double valorEstMaximoAcao, double valorEstMinimoAcao) {
		super();
		this.classificacao = classificacao;
		this.dataDisponibilizacao = dataDisponibilizacao;
		this.destinacaoRecurso = destinacaoRecurso;
		this.valorOferta = valorOferta;
		this.valorEstMaximoAcao = valorEstMaximoAcao;
		this.valorEstMinimoAcao = valorEstMinimoAcao;
	}

	// Construtor com herança cheio
	public Prospecto(int ano, double lucroBruto, double receitaLiquida, double dividaBruta, double lucroLiquido,
			String classificacao, String dataDisponibilizacao, String destinacaoRecurso, double valorOferta,
			double valorEstMaximoAcao,double valorEstMinimoAcao) {
		super(ano, lucroBruto, receitaLiquida, dividaBruta, lucroLiquido);
		this.classificacao = classificacao;
		this.dataDisponibilizacao = dataDisponibilizacao;
		this.destinacaoRecurso = destinacaoRecurso;
		this.valorOferta = valorOferta;
		this.valorEstMaximoAcao = valorEstMaximoAcao;
		this.valorEstMinimoAcao = valorEstMinimoAcao;
	}

	// Getter & Setters
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getDataDisponibilizacao() {
		return dataDisponibilizacao;
	}
	public void setDataDisponibilizacao(String dataDisponibilizacao) {
		this.dataDisponibilizacao = dataDisponibilizacao;
	}
	public String getDestinacaoRecurso() {
		return destinacaoRecurso;
	}
	public void setDestinacaoRecurso(String destinacaoRecurso) {
		this.destinacaoRecurso = destinacaoRecurso;
	}
	public double getValorOferta() {
		return valorOferta;
	}
	public void setValorOferta(double valorOferta) {
		this.valorOferta = valorOferta;
	}
	public double getValorEstMaximoAcao() {
		return valorEstMaximoAcao;
	}
	public void setValorEstMaximoAcao(double valorEstMaximoAcao) {
		this.valorEstMaximoAcao = valorEstMaximoAcao;
	}
	public double getValorEstMinimoAcao() {
		return valorEstMinimoAcao;
	}
	public void setValorEstMinimoAcao(double valorEstMinimoAcao) {
		this.valorEstMinimoAcao = valorEstMinimoAcao;
	}
}
