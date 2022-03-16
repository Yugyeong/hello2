package com.okdevtv.tdd.hello2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWordTest {
	//중복코드 제거 위한 리펙토링 진행
	private HelloWorld hello;
	//= new HelloWorld();
	
	@Before //모든 테스트 시작 전에 꼭 실행됨
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
	
	@After //모든 메소드 끝날때마다 실행됨. 자원 만들고 해제 시 중복코도 있으면 리펙토링
	public void tearDown() { 
		System.out.println("...");
	}


}
