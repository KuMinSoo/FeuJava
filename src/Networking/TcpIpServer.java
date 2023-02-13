package Networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {

	public static void main(String[] args) {

		ServerSocket serverSocket =null;
		
	      try {
	            serverSocket = new ServerSocket(7777); // 7777번 포트로 서버소켓을 생성합니다.
	            System.out.println(serverSocket.getLocalPort());
	            System.out.println(serverSocket.getLocalSocketAddress());
	            System.out.println(serverSocket.getInetAddress());
	            System.out.println(serverSocket.getLocalSocketAddress());
	            System.out.println("[Server] Server is ready");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        while (true) {
	            try {
	                System.out.println("[Server] Waiting for a connection request");
	                Socket socket = serverSocket.accept(); // 연결요청이 들어올 때까지 대기합니다.
	                System.out.println("[Server] Connected from " + socket.getInetAddress());
	                
	                OutputStream out = socket.getOutputStream();
	                DataOutputStream dos = new DataOutputStream(out);
	                
	                dos.writeUTF("[Server] Test message from the server");
	                System.out.println("[Server] Data sent");
	                
	                dos.close();
	                socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
			
			
			
		}
		
		
	}

	
	static String getTime() {
		SimpleDateFormat f =new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
	
}
