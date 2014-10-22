package com.triangle.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.triangle.main.Triangle;

public class TestCase {
		
	Triangle instance = new Triangle();
	@Test
	public void test1() {
		
		String result1 = instance.check(2.0, 3.0, 2.0);
		assertEquals("Tam giac can", result1);
	}
	@Test
	public void test2(){
		String result2 = instance.check(0,  0,  0);
		assertEquals("Khong la tam giac", result2);
	}
	@Test
	public void test3(){
		String result3 = instance.check(5.0,  5.0,  5.0);
		assertEquals("Tam giac deu", result3);
	}
	@Test
	public void test4(){
		String result4 = instance.check(3.0,  4.0,  5.0);
		assertEquals("Tam giac vuong", result4);
	}
	@Test
	public void test5(){
		String result5 = instance.check(1.0, 1.0, Math.sqrt(2.0));
		assertEquals("Tam giac vuong can", result5);
	}
}
