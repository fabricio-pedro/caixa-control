package caixaControl.model.com.br;

public enum Tipo {
RESULTADO("Resultado"), PASSIVO("Passivo"), ATIVO("Ativo");
	private String contaTipo;
	 private Tipo(String tipo) {
		// TODO Auto-generated constructor stub
		 this.contaTipo=tipo;
	}
public String getContatTipo() {
	return this.contaTipo;
	
}
	 
}
