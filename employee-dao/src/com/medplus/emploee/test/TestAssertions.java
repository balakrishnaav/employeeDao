package com.medplus.emploee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertions {
	String obj1="medplus";
	String obj2="medplus";
	
	String obj5=null;
	int var1=55;
	int var2=25;
	int[] arithmetic1= {10,40,30};
	int[] arithmetic2= {10,20,30};
	@Test
	public void testEquals() {
		assertEquals(obj1,obj2);
	}
	@Test
	public void testNull() {
		assertNull(obj5);
	}
	@Test
	public void testTrue() {
		assertTrue(var1<var2);
	}
	@Test
	public void testVarFalse() {
		assertFalse(var1<var2);
	}
	@Test
	public void testArrayEquals() {
		assertArrayEquals(arithmetic1,arithmetic2);
	}
	
}
