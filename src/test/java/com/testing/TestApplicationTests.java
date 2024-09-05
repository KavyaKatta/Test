package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@Test
	public void additionTest() {
		
		assertEquals(10,Calculator.addition(5, 5));
	}
	
	@Test
	public void subtractionTest() {
		
		assertEquals(10,Calculator.subtraction(20, 10));
	}
	@Test
	public void multiplicationTest() {
		
		assertEquals(25,Calculator.multiplication(5, 5));
	}
	@Test
	public void divisionTest() {
		
		assertEquals(5,Calculator.division(10, 2));
	}

}
