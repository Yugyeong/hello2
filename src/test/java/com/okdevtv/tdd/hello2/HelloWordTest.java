package com.okdevtv.tdd.hello2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWordTest {
	//�ߺ��ڵ� ���� ���� �����丵 ����
	private HelloWorld hello;
	//= new HelloWorld();
	
	@Before //��� �׽�Ʈ ���� ���� �� �����
	public void setup() {
		hello = new HelloWorld();
	}
	
	@Test
	public void test() {
		//HelloWorld hello = new HelloWorld();
		String msg = hello.getMessage();
		assertEquals("Hello World", msg);
	}
	
	@Test
	public void testGetMessage() {
		//HelloWorld hello = new HelloWorld();
		String msg = hello.getMessage("kenu");
		assertEquals("Hello kenu", msg);
	}
	
	@Test
	public void testGetMessageNull() {
		//HelloWorld hello = new HelloWorld();
		String msg = hello.getMessage(null);
		assertEquals("Hello World", msg);
	}
	
	@After //��� �޼ҵ� ���������� �����. �ڿ� ����� ���� �� �ߺ��ڵ� ������ �����丵
	public void tearDown() { 
		System.out.println("...");
	}


}
