package br.com.caixaControl;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.caixaControl.exceptions.SaldoInsuficienteException;
import br.com.caixaControl.model.LivroCaixa;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CaixaControlApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void saldoInsuficienteExceptionTest() throws SaldoInsuficienteException {
	 	LivroCaixa caixa=new LivroCaixa();
	 	caixa.setEntrada(new BigDecimal(150));
	 	caixa.setSaida(new BigDecimal(200));
		
	}
	@Test
	public void TestEfetuaRecebimento() {
		LivroCaixa caixa=new LivroCaixa();
	 	caixa.setEntrada(new BigDecimal(150));
	    caixa.setEntrada(new BigDecimal(350));
		assertTrue(caixa.getSaldo().compareTo(new BigDecimal(500))==0);
	}
	

}
