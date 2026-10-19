package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Cuenta cta = new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		cta.ingreso(25);
		assertEquals(25, cta.getSaldo());
		
	}
	
	@Test
	void testReintegro()
	cta.reintegro(25);
	assertEquals(0, cta.getSaldo());
}
