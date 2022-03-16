package com.okdevtv.tdd.hello2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void test() {
		assertEquals("1,000", StringUtils.comma(1000));
		assertEquals("10,000", StringUtils.comma(10000));
		assertEquals("100,000", StringUtils.comma(100000));
		assertEquals("1,200,000", StringUtils.comma(1200000));
	}

}
