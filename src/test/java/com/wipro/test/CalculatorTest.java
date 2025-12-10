package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.Calculator;

public class CalculatorTest {

	@Test
	public void testAddition() {
		assertEquals(10,Calculator.addition(5, 5));
	}

	@Test
	public void testSubstraction() {
		assertEquals(10,Calculator.substraction(20, 10));
	}

	@Test
	public void testMultiplication() {
		assertEquals(10,Calculator.multiplication(10, 1));
	}

	@Test
	public void testDivision() {
		assertEquals(10,Calculator.division(50, 5));
	}

}
