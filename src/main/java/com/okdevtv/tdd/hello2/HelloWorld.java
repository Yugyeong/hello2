package com.okdevtv.tdd.hello2;

public class HelloWorld {

	public String getMessage() {
		return "Hello World";
	}

	public String getMessage(String name) {
		if(name == null) {
			name = "World";
		}
		return "Hello " + name;
	}

}
