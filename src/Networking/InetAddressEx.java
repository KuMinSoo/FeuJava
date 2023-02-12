package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class InetAddressEx {

	@SuppressWarnings("null")
	public static void main(String[] args) {
   
		InetAddress ip=null;
		InetAddress[] ipArr=null;
		String internetURL="www.naver.com";
		try {
			System.out.println("=======외부 URI 정보========");
			ip=InetAddress.getByName(internetURL);
			System.out.println("getHostName(): "+ip.getHostName());
			System.out.println("getHostAddress(): "+ip.getHostAddress());
			System.out.println("toString(): "+ip.toString());// toSting은 ip 이름과 주소를 같이 보여준다.
			byte[] ipAddr=ip.getAddress();
			System.out.println("ipAddr(): "+Arrays.toString(ipAddr));
			String result="";
			for(int i=0;i<ipAddr.length;i++) {
				result+=(ipAddr[i]<0?ipAddr[i]+256:ipAddr[i])+". ";
			}
			System.out.println("getAddress()+256"+result);
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("=====로컬 정보=====");
		
		try {
			ip=InetAddress.getLocalHost();
			System.out.println("getHostName(): "+ip.getHostName());
			System.out.println("getHostAddress(): "+ip.getHostAddress());
			System.out.println("");
		
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("=======외부 URI 정보========");
		
		try {
			ipArr=InetAddress.getAllByName("www.naver.com");
			for(int i=0;i<ipArr.length;i++) {
				System.out.println("["+i+"]"+ipArr[i]);
			}
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	
		
		
		
		
	}

}
