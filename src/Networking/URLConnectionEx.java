package Networking;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) throws Exception {

		String address="http://www.codechobo.com/sample/hello.html";
		
		URL url=new URL(address);	
		URLConnection conn=url.openConnection();	
		
		System.out.println("conn.toString(): "+conn.toString());//conn 객체 반환
		System.out.println("getAllowUserInteraction():"+conn.getAllowUserInteraction()); //UserInteraction 사용여부 반환
		System.out.println("getConnectTimeout(): "+conn.getConnectTimeout());//연결 종료 시간 천분의 1 반환
		System.out.println("getContent():"+conn.getContent());//content객체 생성
		System.out.println("getContentEncoding(): "+conn.getContentEncoding());//content의 인코딩 반환
		System.out.println("getContentLength(): "+conn.getContentLength());//content 크기 반환
		System.out.println("getContentType(): "+conn.getContentType());// 컨텐트 타입 반환... text/html
		System.out.println("getDate(): "+(conn.getDate()));//헤더에 date 필드값 반환
		System.out.println("getDefaultAllowUserInteraction(): "+conn.getDefaultAllowUserInteraction());
		System.out.println("getDoInput(): "+conn.getDoInput()); //doIntput 필드값 반환
		System.out.println("getDoOutput(): "+conn.getDoOutput()); //doOutput 필드값 반환
		System.out.println("getExpiration(): "+conn.getExpiration());//만료 일자 반환 1000분의 1 단위.. : long 타입
		System.out.println("getHeadFleids(): "+conn.getHeaderFields());// 헤더ㅢ 모든 필드와 값 Map 형태로 반환
		System.out.println("getIfModifiedSince(): "+conn.getIfModifiedSince()); //(변경여부) 필드의 값 반환
		System.out.println("getLastModified(): "+conn.getLastModified());//(LastModified)최종 변경일 필드값 반환
		System.out.println("getReadTimeout(): "+conn.getReadTimeout());//읽기 제한 시간의 값 반환
		System.out.println("getURL(): "+conn.getURL());// url 반환..
		System.out.println("getUseCache(): "+conn.getUseCaches());//캐쉬 사용여부를 true/false 반환
		
		
		
		
		
		

	}

}
