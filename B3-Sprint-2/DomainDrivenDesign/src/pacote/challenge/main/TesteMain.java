package pacote.challenge.main;

import javax.swing.JOptionPane;

import pacote.challenge.cliente.Cadastro;
import pacote.challenge.cliente.CarteiraDigitalTreino;
import pacote.challenge.cliente.Contato;
import pacote.challenge.cliente.InfoIPO;
import pacote.challenge.cliente.PerfilInvestidor;
import pacote.challenge.empresa.Empresa;
import pacote.challenge.empresa.EmpresasAbertas;
import pacote.challenge.empresa.ListagemIpo;
import pacote.challenge.empresa.Noticias;
import pacote.challenge.empresa.Prospecto;

public class TesteMain 
{
	static String tipoString(String tipoString) {
		return JOptionPane.showInputDialog(tipoString);
	}	
	
	static double tipoDouble(String tipoDouble) {
		return Double.parseDouble(JOptionPane.showInputDialog(tipoDouble));
	}
	
	static int tipoInt(String tipoInt) {
		return Integer.parseInt(JOptionPane.showInputDialog(tipoInt));
	}
	
	public static void main(String[] args) 
	{
		// EMPRESA
		Empresa objEmpresa = new Empresa(tipoString("Digite a razão social da empresa"),
				tipoString("Digite o CNPJ da empresa"),
				tipoString("Digite o segmento da empresa"));
		
		System.out.println("Informações EMPRESA");
		System.out.println("Razão Social: " + objEmpresa.getRazaoSocial() +
				"\nCNPJ: " + objEmpresa.getCnpj() +
				"\nSegmento empresa: " + objEmpresa.getSegmento());
		
		// EMPRESAS ABERTAS
		EmpresasAbertas objEmpA = new EmpresasAbertas(tipoString("Digite a razão social da empresa de capital aberto"),
				tipoString("Digite o CNPJ da empresa"),
				tipoString("Digite o segmento da empresa"),
				tipoDouble("Digite o valor da ação"),
				tipoString("Digite o código de identificação (isin)"),
				tipoString("Digite o código de negociação"));
		
		Noticias objNot = new Noticias(tipoString("Data de publicação da notícia"),
				tipoString("Autor da notícia"), 
				tipoString("Conteúdo da notícia"));
		
	   /*
		Graficos objGraficos = new Graficos(tipoInt("Digite o ano do gráfico financeiro"),
				tipoDouble("Digite o valor do lucro bruto"),
				tipoDouble("Digite o valor da receita liquida"),
				tipoDouble("Digite o valor da divida bruta"),
				tipoDouble("Digite o valor do lucro liquido"));
		*/
		
		Prospecto objProspecto = new Prospecto(tipoInt("Digite o ano do gráfico financeiro"),
				tipoDouble("Digite o valor do lucro bruto"),
				tipoDouble("Digite o valor da receita liquida"),
				tipoDouble("Digite o valor da divida bruta"),
				tipoDouble("Digite o valor do lucro liquido"),
				tipoString("Digite a classificação do IPO"),
				tipoString("Digite a data de disponibilização do prospecto"),
				tipoString("Digite a destinacao dos recursos obtidos pelo IPO"),
				tipoDouble("Digite o valor da oferta"),
				tipoDouble("Digite o valor máximo estimado por ação"),
				tipoDouble("Digite o valor mínimo estimado por ação"));
		
		
		System.out.println("\nInformações Empresas Abertas (IPO)");
		System.out.println("Razão Social: " + objEmpA.getRazaoSocial() +
				"\nCNPJ: " + objEmpA.getCnpj() +
				"\nSegmento empresa: " + objEmpA.getSegmento() +
				"\nValor ação: " + objEmpA.getValorAcao() +
				"\nCódigo de identificação: " + objEmpA.getCodigoIsin() +
				"\nCódigo de negociação na bolsa: " + objEmpA.getCodNegociacao() +
				
				"\n\nNOTICIAS DA EMPRESA (IPO):" +
				"\nData de publicação da nóticia: " + objNot.getDataPublicacao() +
				"\nAutor da notícia: " + objNot.getAutor() +
				"\nConteudo da nóticia: " + objNot.getConteudo() +
				
				"\n\nDADOS DO PROSPECTO DA EMPRESA (IPO):" +
				"\nClassificação IPO: " + objProspecto.getClassificacao() +
				"\nData de disponibilização do prospecto: " + objProspecto.getDataDisponibilizacao() +
				"\nDestinação dos recursos obtidos: " + objProspecto.getDestinacaoRecurso() +
				"\nValor da oferta: " + objProspecto.getValorOferta() +
				"\nValor mínimo estimado por ação: " + objProspecto.getValorEstMinimoAcao() +
				"\nValor máximo estimado por ação: " + objProspecto.getValorEstMaximoAcao() +
				
				"\n\nDADOS FINANCEIROS DA EMPRESA (IPO): " +
				"\nAno do gráfico financeiro: " + objProspecto.getAno() +
				"\nValor do lucro bruto: " + objProspecto.getLucroBruto() +
				"\nReceita líquida: " + objProspecto.getReceitaLiquida() +
				"\nDivida Bruta: " + objProspecto.getDividaBruta() +
				"\nLucro líquido: " + objProspecto.getLucroLiquido() +
				"\nCálculo Lucro líquido: " + objProspecto.CalculoLucroLiquido(objProspecto.getLucroBruto(), objProspecto.getDividaBruta()));
		
		
		// LISTAGEM IPO
		/*
		ListagemIpo objListagemIpo = new ListagemIpo(tipoString("Informe a data de lançamento do IPO"),
				tipoString("Informe a razão social da empresa"),
				tipoString("Informe o CNPJ da empresa"),
				tipoString("Informe o segmento da empresa"),
				tipoDouble("Informe o valor inicial do preço por ação"),
				tipoString("Informe o código de identificação (isin)"),
				tipoString("Informe o código de negociação na bolsa"));
		
		System.out.println("\n\nListagem IPO:");
		System.out.println("Data de lançamento do IPO: " + objListagemIpo.getDataLancamento() +
				"\nRazão social: " + objListagemIpo.getRazaoSocial() +
				"\nCNPJ: " + objListagemIpo.getCnpj() +
				"\nValor inicial do preço por ação: " + objListagemIpo.getValorAcao() +
				"\nCódigo de identificação (isin): " + objListagemIpo.getCodigoIsin() +
				"\nCódigo de negociação na bolsa: " + objListagemIpo.getCodNegociacao());
		*/
		
		ListagemIpo objListagemIpo = new ListagemIpo(tipoString("Informe a data de lançamento do IPO"));
		System.out.println("\n\nListagem IPO:");
		System.out.println("Data de lançamento do IPO: " + objListagemIpo.getDataLancamento() +
				"\nRazão social: " + objEmpA.getRazaoSocial() +
				"\nCNPJ: " + objEmpA.getCnpj() +
				"\nValor inicial do preço por ação: " + objEmpA.getValorAcao() +
				"\nCódigo de identificação (isin): " + objEmpA.getCodigoIsin() +
				"\nCódigo de negociação na bolsa: " + objEmpA.getCodNegociacao());
		
		// CADASTRO
		Cadastro objCadastro = new Cadastro(tipoString("Digite o nome do cliente"),
				tipoInt("Digite a idade do cliente"),
				tipoString("Digite CPF do cliente"),
				tipoString("Digite o usuario do cliente"),
				tipoString("Digite a senha do cliente"));
		
		Contato objContato = new Contato(tipoString("Informe o e-mail do cliente"),
				tipoString("Informe o telefone de contato do cliente"));
		
		System.out.println("\n\nInformações do cliente:");
		System.out.println("Nome: " + objCadastro.getNome() +
				"\nIdade: " + objCadastro.getIdade() +
				"\nCPF: " + objCadastro.getCpf() +
				"\nE-mail: " + objContato.getEmail() +
				"\nTelefone de contato: " + objContato.getCelular() +
				"\nUsuario: " + objCadastro.getUsuario() +
				"\nSenha: " + objCadastro.getSenha());
		
		PerfilInvestidor objPerfil = new PerfilInvestidor(tipoString("Digite o objetivo do cliente com o investimento"),
				tipoString("Informe o tempo de investimento"),
				tipoDouble("Informe a expectativa de renda" ),
				tipoString("Seu perfil de investidor: "));
		
		System.out.println("\nPerfil de Investidor do cliente:");
		System.out.println("Objetivo com o investimento: " + objPerfil.getObjInvestir() +
				"\nTempo de investimento: " + objPerfil.getTempoDeixarDinheiroInvestido() +
				"\nExpectativa de renda: " + objPerfil.getExpectativaRenda() +
				"\nPerfil de investidor: " + objPerfil.getPerfilInvestidor());
		
		// Info IPO
		InfoIPO objInfoIPO = new InfoIPO(tipoString("Informar definição IPO"));
		
		System.out.println("\nInformações IPO:");
		System.out.println("Significado/definição: " + objInfoIPO.getOqueE());
		System.out.println("\nExemplo de empresa que realizou IPO" +
				"\nData de lançamento do IPO: " + objListagemIpo.getDataLancamento() +
				"\nRazão social: " + objEmpA.getRazaoSocial() +
				"\nCNPJ: " + objEmpA.getCnpj() +
				"\nValor inicial do preço por ação: " + objEmpA.getValorAcao() +
				"\nCódigo de identificação (isin): " + objEmpA.getCodigoIsin() +
				"\nCódigo de negociação na bolsa: " + objEmpA.getCodNegociacao());
		
		// Carteira Digital Treino
		CarteiraDigitalTreino objCarteira = new CarteiraDigitalTreino(tipoDouble("Informe o saldo do cliente"),
				tipoDouble("Digite o valor desejado para sacar"),
				tipoDouble("Informe o valor de dividendos"),
				tipoInt("Informe o total de ações adquiridas"));
		
		System.out.println("\nInformações Carteira Digital");
		System.out.println("Saldo: " + objCarteira.getSaldo() +
				"\nValor desejado para sacar: " + objCarteira.getSacar() +
				"\nValor total dos dividendos: " + objCarteira.getDividendos() +
				"\nTotal de ações adquiridas: " + objCarteira.getTotalAcoesAdquiridas() +
				"\nEmpresa que possui ações: " + objEmpA.getRazaoSocial() +
				"\nCódigo de negociação (isin): " + objEmpA.getCodigoIsin() +
				"\nCódigo de negociação na bolsa: " + objEmpA.getCodNegociacao());
		
		System.out.println("Saldo final do cliente com saque: " + objCarteira.valorFinal(objCarteira.getSaldo(), objCarteira.getSacar()));
	}
}
