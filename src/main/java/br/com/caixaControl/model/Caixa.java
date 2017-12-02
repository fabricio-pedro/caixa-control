package br.com.caixaControl.model;

import java.time.LocalDate;

public class Caixa extends Conta{

  private LocalDate dataM;
  private Status status;
  
  public Caixa() {
	// TODO Auto-generated constructor stub
	  this.setTipoConta(Tipo.ATIVO);
}
 public void abrirCaixa(LocalDate data) throws Exception {
	 if(status==Status.ABERTO) {
		throw new Exception() ;
		 
	 }
	 this.status=Status.ABERTO;
	 this.dataM=data;
	    
	 
 }
  
  public void fecharCaixa() {
	 this.status=Status.FECHADO;   
	  
  }
 
  


  
	
}
