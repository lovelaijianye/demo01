package com.offcn.ws;

import javax.jws.WebService;
@WebService
public class HelloWebService {
	
	public String sayHello(String name){
		return "Hello! "+name;
	}
}