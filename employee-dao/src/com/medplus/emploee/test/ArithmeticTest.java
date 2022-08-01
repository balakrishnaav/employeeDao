package com.medplus.emploee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest {
	Arithmatic arth=new Arithmatic();

	@Test
	public void testAdd() {
		assertEquals(10, arth.add(5, 5));
	}
	@Test
	public void testSubtract() {
		assertEquals(5 , arth.subtract(5, 5));
	}

}
