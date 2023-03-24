package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C06Server {
	public static void main(String[] args) {
		int port = 50500;

		try (ServerSocket serverSocket = new ServerSocket(port);) {
			while (true) {
				System.out.println("연결 기다리는 중...");
				Socket socket = serverSocket.accept();
				Thread t = new Thread(() -> {
					try (
							InputStream is = socket.getInputStream();
							BufferedInputStream bis = new BufferedInputStream(is);
							InputStreamReader isr = new InputStreamReader(bis);) {
						
						char[] data = new char[1024];
						int len = 0;
						System.out.println("입력 받는 중 ...");
						while ((len = isr.read(data)) != -1) {
							String input = new String(data, 0, len);
							System.out.println(input);
						}
						socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				});
				t.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


		System.out.println("프로그램 종료");

	}
}