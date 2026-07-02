package com.tsola2002.calculatorapp;

import com.tsola2002.calculatorapp.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class CalculatorappApplicationTests {

	private CalculatorService calculator = new CalculatorService();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}


}
