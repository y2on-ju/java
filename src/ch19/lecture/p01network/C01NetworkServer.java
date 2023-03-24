package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C01NetworkServer {
	public static void main(String[] args) {
		// ip주소
		// port 번호 필요
		int port = 50500;
		
		try(ServerSocket serverSocket = new ServerSocket(port);){
			System.out.println("연결 기다리는 중.....");
		
			try(
					Socket socket = serverSocket.accept();
					OutputStream os = socket.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(os);
					BufferedWriter bw = new BufferedWriter(osw);) {
				
				bw.write("Hello Client");
				
				bw.flush();
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}

}
