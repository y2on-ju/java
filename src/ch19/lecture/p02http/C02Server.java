package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class C02Server {
	public static void main(String[] args) {
		int port = 80;

		try (
				ServerSocket serverSocket = new ServerSocket(port);) {

			System.out.println("요청 기다리는중..");

			try (
					Socket socket = serverSocket.accept();

					OutputStream os = socket.getOutputStream();
					PrintStream ps = new PrintStream(os);) {
				
				String body = """
						<h1>This is NAVER!!</h1>
						<h3>다른 사이트로 이동 </h3>
						<ul>
							<li><a href="https://www.daum.net">daum</a></li>
							<li><a href="https://www.google.com">google</a></li>
						</ul>
						""";
				int length = body.getBytes().length;

				// 첫 줄
				ps.println("HTTP/1.1 200 OK");
				
				// 두번째 줄부터 헤더들
				ps.println("Content-Type: text/html; charset=utf-8");
				ps.println("Content-Length: " + length);
				
				// 빈 줄
				ps.println();
				
				// 응답 본문
				ps.println(body);
				

				ps.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("서버 종료!");
	}
}