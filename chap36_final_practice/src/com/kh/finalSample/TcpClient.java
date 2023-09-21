package com.kh.finalSample;

import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
	int port =3333;
	String serverIP;
	
	try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
		Socket socket = new Socket(serverIP, port);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
