package com.offcn.ws;

import javax.xml.ws.Endpoint;

public class App {
	public static void main(String[] args) {
		String address = "http://127.0.0.1:9999/HelloWebService";
		// ע�Ტ�ҷ���һ������,arg0: �����ַ , arg1:Ҫ�����ķ������
		Endpoint endPoint = Endpoint.publish(address, new HelloWebService());
	}
}
