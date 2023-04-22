package pacote.challenge.cliente;

import pacote.challenge.empresa.EmpresasAbertas;

public class CarteiraDigitalTreino 
{
	// Modificador, tipo de dado, variavel
	private double saldo;
	private double sacar;
	private double dividendos;
	private int totalAcoesAdquiridas;
	private EmpresasAbertas carteira;
	
	// Construtor vazio
	public CarteiraDigitalTreino() {
		super();
	}
	
	// Construtor cheio
	public CarteiraDigitalTreino(double saldo, double sacar, double dividendos, int totalAcoesAdquiridas) {
		super();
		this.saldo = saldo;
		this.sacar = sacar;
		this.dividendos = dividendos;
		this.totalAcoesAdquiridas = totalAcoesAdquiridas;
	}
	
	// Construtor cheio com atributo de referência
	public CarteiraDigitalTreino(double saldo, double sacar, double dividendos, int totalAcoesAdquiridas,
			EmpresasAbertas carteira) {
		super();
		this.saldo = saldo;
		this.sacar = sacar;
		this.dividendos = dividendos;
		this.totalAcoesAdquiridas = totalAcoesAdquiridas;
		this.carteira = carteira;
	}
	
	// Getters & Setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSacar() {
		return sacar;
	}
	public void setSacar(double sacar) {
		this.sacar = sacar;
	}
	public double getDividendos() {
		return dividendos;
	}
	public void setDividendos(double dividendos) {
		this.dividendos = dividendos;
	}
	public int getTotalAcoesAdquiridas() {
		return totalAcoesAdquiridas;
	}
	public void setTotalAcoesAdquiridas(int totalAcoesAdquiridas) {
		this.totalAcoesAdquiridas = totalAcoesAdquiridas;
	}
	public EmpresasAbertas getCarteira() {
		return carteira;
	}
	public void setCarteira(EmpresasAbertas carteira) {
		this.carteira = carteira;
	}
	
	public double valorFinal(double saldo, double sacar) {
		return saldo - sacar;
	}
}
