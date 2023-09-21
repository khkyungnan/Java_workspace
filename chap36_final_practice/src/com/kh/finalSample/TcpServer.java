package com.kh.finalSample;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	int port =3333;
	
	ServerSocket server;
	
	server = new ServerSocket(port);
	while(true) {
		Socket client = server.accept();
	}
}


