package br.com.caixaControl.model;

public enum Status {
  FECHADO("Fechado"),ABERTO("Aberto");
	private String status;
	private Status(String status) {
		// TODO Auto-generated constructor stub
     this.status=status;
	}
	
  public String getStatus() {
	return this.status;   
	  
  }
	
}
