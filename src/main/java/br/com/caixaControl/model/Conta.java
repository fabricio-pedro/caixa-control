package br.com.caixaControl.model;

public abstract class Conta {
  
	private String descricao;
	private Double saldo;
    private Tipo tipoConta;
    public Conta() {
		// TODO Auto-generated constructor stub
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getSaldo() {
		return saldo;
	}
	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Tipo getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(Tipo tipoConta) {
		this.tipoConta = tipoConta;
	}
    
}
