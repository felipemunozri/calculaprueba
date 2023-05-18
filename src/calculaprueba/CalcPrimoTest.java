package calculaprueba;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcPrimoTest {

	@Test
	public void testEsPrimo() {
		CalcPrimo calcPrimo = new CalcPrimo();
        boolean resultado = calcPrimo.esPrimo(0);
        assertEquals(false, resultado);
	}
	
	@Test
	public void testEsPrimo2() {
		CalcPrimo calcPrimo = new CalcPrimo();
        boolean resultado = calcPrimo.esPrimo(1);
        assertEquals(false, resultado);
	}
	
	@Test
	public void testEsPrimo3() {
		CalcPrimo calcPrimo = new CalcPrimo();
        boolean resultado = calcPrimo.esPrimo(4);
        assertEquals(false, resultado);
	}
	
	@Test
	public void testEsPrimo4() {
		CalcPrimo calcPrimo = new CalcPrimo();
        boolean resultado = calcPrimo.esPrimo(2);
        assertEquals(true, resultado);
	}
}
