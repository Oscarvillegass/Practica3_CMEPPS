package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	private static Cuenta cta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		double inicio=20;
		cta = new Cuenta(inicio);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		//double ingresar = 25.0;
		cta.ingreso(25);
		assertEquals(45, cta.getSaldo());
		
	}
	
	@Test
	void testReintegro() {
		//double retirar = 25.0;
		cta.reintegro(15);
		assertEquals(5, cta.getSaldo());
	}
}
