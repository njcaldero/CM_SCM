package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {

		Calculadora c = new CalculadoraImpl();
		c.sumar(4, 2);
		assertTrue(c.getResultado() == 6);
	}

	@Test
	public void testRestar() {

		Calculadora c = new CalculadoraImpl();
		c.restar(4, 2);
		assertTrue(c.getResultado() == 2);
	}

}
