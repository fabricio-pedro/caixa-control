package br.com.caixaControl.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.caixaControl.exceptions.SaldoInsuficienteException;

@Entity(name="caixa")
public class LivroCaixa {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
 private Long id;
 private BigDecimal saldo;
 private BigDecimal entrada;
 private BigDecimal saida;
 private LocalDate dataMovimento;
 private String historico;
public LivroCaixa() {
 this.saldo=new BigDecimal(0);
}
 public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public BigDecimal getEntrada() {
	return entrada;
}
public void setEntrada(BigDecimal entrada) {
	this.entrada = entrada;
	this.saldo=this.saldo.add(entrada);
	

}
public BigDecimal getSaida() {
	return saida;
}
public void setSaida(BigDecimal saida) throws SaldoInsuficienteException {
	if(saida.compareTo(this.saldo)>1) {
	 throw new SaldoInsuficienteException("O caixa nao tem saldo para efetuar pagamento");
		
	}
	this.saldo=this.saldo.subtract(saida);
	
}
public LocalDate getDataMovimento() {
	return dataMovimento;
}
public void setDataMovimento(LocalDate dataMovimento) {
	this.dataMovimento = dataMovimento;
}
public String getHistorico() {
	return historico;
}
public void setHistorico(String historico) {
	this.historico = historico;
}
 public BigDecimal getSaldo() {
 return this.saldo;	 
	 
 } 	
}
