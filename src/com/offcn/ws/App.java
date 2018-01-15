package com.offcn.ws;

import javax.xml.ws.Endpoint;

public class App {
	public static void main(String[] args) {
		String address = "http://127.0.0.1:9999/HelloWebService";
		// 注册并且发布一个服务,arg0: 服务地址 , arg1:要发布的服务对象
		Endpoint endPoint = Endpoint.publish(address, new HelloWebService());
	}
}
