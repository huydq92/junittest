package com.quanghuy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.quanghuy.main.Main;

public class TestCase {
	Main instance = new Main();
	@Test
	public void test1() {
		String result1 = instance.calculator(1.0, 2.0, 3.0);
		assertEquals("instance bac 2 vo nghiem", result1);
		
	}
	
	@Test
	public void test2() {
		String result1 = instance.calculator(3.0, 6.0, 3.0);
		assertEquals("instance co nghiem kep: -1.0", result1);
		
	}
	@Test
	public void test3() {
		String result1 = instance.calculator(1.0, -3.0, 2.0);
		assertEquals("instance co 2 nghiem: 2.0 ; 1.0", result1);
		
	}
	
	@Test
	public void test4() {
		String result1 = instance.calculator(0.0, 0.0, 0.0);
		assertEquals("instance vo so nghiem", result1);
		
	}
	
	@Test
	public void test5() {
		String result1 = instance.calculator(0.0, 1.0, 2.0);
		assertEquals("instance co 1 nghiem: -2.0", result1);
		
	}
	
	@Test
	public void test6() {
		String result1 = instance.calculator(0.0, 0.0, 2.0);
		assertEquals("instance vo nghiem", result1);
		
	}
}
