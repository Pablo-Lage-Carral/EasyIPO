package pacote.challenge.cliente;

public class PerfilInvestidor 
{
	// Modificador, tipo de dado, variavel
	private String objInvestir;
	private String tempoDeixarDinheiroInvestido;
	private double expectativaRenda;
	private String perfilInvestidor;
	
	// Construtor vazio
	public PerfilInvestidor() {
		super();
	}
	
	// Construtor cheio
	public PerfilInvestidor(String objInvestir, String tempoDeixarDinheiroInvestido, double expectativaRenda,
			String perfilInvestidor) {
		super();
		this.objInvestir = objInvestir;
		this.tempoDeixarDinheiroInvestido = tempoDeixarDinheiroInvestido;
		this.expectativaRenda = expectativaRenda;
		this.perfilInvestidor = perfilInvestidor;
	}

	// Getters & Setters
	public String getObjInvestir() {
		return objInvestir;
	}
	public void setObjInvestir(String objInvestir) {
		this.objInvestir = objInvestir;
	}
	public String getTempoDeixarDinheiroInvestido() {
		return tempoDeixarDinheiroInvestido;
	}
	public void setTempoDeixarDinheiroInvestido(String tempoDeixarDinheiroInvestido) {
		this.tempoDeixarDinheiroInvestido = tempoDeixarDinheiroInvestido;
	}
	public double getExpectativaRenda() {
		return expectativaRenda;
	}
	public void setExpectativaRenda(double expectativaRenda) {
		this.expectativaRenda = expectativaRenda;
	}
	public String getPerfilInvestidor() {
		return perfilInvestidor;
	}
	public void setPerfilInvestidor(String perfilInvestidor) {
		this.perfilInvestidor = perfilInvestidor;
	}
}
