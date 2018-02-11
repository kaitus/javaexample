package ejemplogit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculatortest {
	
	static calculadora cal;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cal = new calculadora();
		System.out.println("before");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testsuma() {
		int valorA = 2;
		int valorB = 2;
		int resultado = cal.suma(valorA, valorB);
		System.out.println(resultado);
		assertEquals(4, resultado);
	}

	@Test
	public void testresta() {
		int valorA = 2;
		int valorB = 2;
		int resultado = cal.resta(valorA, valorB);
		System.out.println(resultado);
		assertEquals(0, resultado);
	}

}
