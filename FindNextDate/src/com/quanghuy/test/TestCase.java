package com.quanghuy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.quanghuy.main.FindNextDate;

public class TestCase {

	@Test
	public void test1() {
		FindNextDate nextDate = new FindNextDate(31,12 , 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/1/2015", result1);
	}

	@Test
	public void test2() {
		FindNextDate nextDate = new FindNextDate(29,2 , 2008);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/3/2008", result1);
	}
	
	@Test
	public void test3() {
		FindNextDate nextDate = new FindNextDate(28,2 , 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/3/2014", result1);
	}
	
	@Test
	public void test4() {
		FindNextDate nextDate = new FindNextDate(30, 6, 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/7/2014", result1);
	}
	
	@Test
	public void test5() {
		FindNextDate nextDate = new FindNextDate(31, 3, 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/4/2014", result1);
	}
	
	@Test
	public void test6() {
		FindNextDate nextDate = new FindNextDate(15, 6, 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("16/6/2014", result1);
	}
	
	@Test
	public void test7() {
		FindNextDate nextDate = new FindNextDate(0, 6, 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("Dữ liệu không hợp lệ", result1);
	}
}
