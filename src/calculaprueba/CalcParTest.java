package calculaprueba;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcParTest {

	@Test
	public void testEsPar() {
		CalcPar calcPar = new CalcPar();
        boolean resultado = calcPar.esPar(2);
        assertEquals(true, resultado);
	}
	
	@Test
	public void testEsPar2() {
		CalcPar calcPar = new CalcPar();
        boolean resultado = calcPar.esPar(3);
        assertEquals(false, resultado);
	}
}
