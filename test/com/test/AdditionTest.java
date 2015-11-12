package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {
	@Test
	public void testAdd()
	{
		Addition ad = new Addition();
		assertEquals(3, ad.add(1, 2));
	}
	
	@Test
	public void testAdd2()
	{
		Addition ad = new Addition();
		assertEquals(3, ad.add(1, 2));
	}
}
