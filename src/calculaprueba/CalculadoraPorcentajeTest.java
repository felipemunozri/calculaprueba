package calculaprueba;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraPorcentajeTest {

	@Test
	public void testPorcentaje() {
        CalculadoraPorcentaje calculadoraPorcentaje = new CalculadoraPorcentaje();
        double resultado = calculadoraPorcentaje.porcentaje(100, 10);
        assertEquals(10, resultado, 0.01);
	}
}
