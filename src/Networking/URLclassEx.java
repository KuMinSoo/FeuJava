package Networking;

import java.net.URL;

public class URLclassEx {

	public static void main(String[] args) throws Exception {

		URL url3=new URL("http://www.codechobo.com/sample/hello.html");
		URL url1=new URL("http","www.codechobo.com", "/sample/hello.html");
		URL url2=new URL("http", "www.codechobo.com", 80, "/sample/hello.html");
		
		URL url=new URL("http://www.codechobo.com:80/sample/"+"hello.html?referer=codechobo#index1");
		
		System.out.println("url.getAuthority(): "+url.getAuthority());//호스트명+포트번호 
		System.out.println("url.getContent(): "+url.getContent());//url의 content객체 반환
		System.out.println("url.getDefaultPort(): "+url.getDefaultPort());// 기본 디폴트 포트 반환 : 80
		System.out.println("url.getPort(): "+url.getPort());// 포트번호 반환
		System.out.println("url.getFile(): "+url.getFile());//호스트명과 포트번호 뒤에 있는!!! 파일명 반환(쿼리까지)
		System.out.println("url.getHost(): "+url.getHost());//호스트명 반환
		System.out.println("url.getPath(): "+url.getPath());//호스트명 뒤에 있는 경로명 반환
		System.out.println("url.getProtocol(): "+url.getProtocol()); //프로토콜 반환
		System.out.println("url.getQuery(): "+url.getQuery());//쿼리문 반환
		System.out.println("url.getRef(): "+url.getRef());//참조 반환
		System.out.println("url.getUserInfo(): "+url.getUserInfo());//사용자 정보 반환 없으면 null
		System.out.println("url.toExternalForm(): "+url.toExternalForm()); //url을 문자열로 반환
		System.out.println("url.toURI(): "+url.toURI());//url을 uri로 반환
		
		
		
	}

}
