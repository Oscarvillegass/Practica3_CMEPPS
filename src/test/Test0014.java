package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class Test0014 {

	private static Cuenta cta12345;
	private static Cuenta cta67890;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cta12345 = new Cuenta(50);
		cta67890 = new Cuenta(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test12345() {
		cta12345.reintegro(200);
		cta12345.ingreso(100);
		cta12345.reintegro(200);
		
		assertEquals(-250, cta12345.getSaldo());
	}
	
	@Test
	void test67890() {
		cta67890.reintegro(350);
		cta67890.reintegro(200); //Error
		cta67890.reintegro(150);
		cta67890.ingreso(50);
		cta67890.reintegro(100); //Error
		
		assertEquals(-450, cta67890.getSaldo());
	}

}
