package com.code.me.pro.impl;

import javax.jws.WebService;

import com.code.me.pro.HelloWorld;

@WebService(endpointInterface = "com.code.me.pro.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String getHelloWorld() {
		return "Hello World Code Me Pro";
	}
}
