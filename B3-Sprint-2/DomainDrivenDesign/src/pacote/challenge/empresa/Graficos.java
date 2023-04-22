package pacote.challenge.empresa;

public class Graficos 
{
	// Modificador, tipo de dado, variavel
	private int ano;
	private double lucroBruto;
	private double receitaLiquida;
	private double dividaBruta;
	private double lucroLiquido;
	
	// Construtor vazio
	public Graficos() {
		super();
	}
	
	// Construtor cheio
	public Graficos(int ano, double lucroBruto, double receitaLiquida, double dividaBruta, double lucroLiquido) {
		super();
		this.ano = ano;
		this.lucroBruto = lucroBruto;
		this.receitaLiquida = receitaLiquida;
		this.dividaBruta = dividaBruta;
		this.lucroLiquido = lucroLiquido;
	}

	// Getters & Setters
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getLucroBruto() {
		return lucroBruto;
	}
	public void setLucroBruto(double lucroBruto) {
		this.lucroBruto = lucroBruto;
	}
	public double getReceitaLiquida() {
		return receitaLiquida;
	}
	public void setReceitaLiquida(double receitaLiquida) {
		this.receitaLiquida = receitaLiquida;
	}
	public double getDividaBruta() {
		return dividaBruta;
	}
	public void setDividaBruta(double dividaBruta) {
		this.dividaBruta = dividaBruta;
	}
	public double getLucroLiquido() {
		return lucroLiquido;
	}
	public void setLucroLiquido(double lucroLiquido) {
		this.lucroLiquido = lucroLiquido;
	}
	public double CalculoLucroLiquido(double lucroBruto, double dividaBruta) {
        return lucroBruto - dividaBruta;
    }
}
