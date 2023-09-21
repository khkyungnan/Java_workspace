package com.kh.finalSample;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	int port =3333;
	
	ServerSocket server;
	
	server = new ServerSocket(port);
	sysout(port);
	while(true) {
		Socket client = server.accept();
		sysout (client.getInetAddress());
		
		BufferedReader
		OutputStream
		
		client.close();
	}
}


