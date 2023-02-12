package Networking;

import java.net.URL;

public class URLclassEx {

	public static void main(String[] args) throws Exception {

		URL url3=new URL("http://www.codechobo.com/sample/hello.html");
		URL url1=new URL("http","www.codechobo.com", "/sample/hello.html");
		URL url2=new URL("http", "www.codechobo.com", 80, "/sample/hello.html");
		
		URL url=new URL("http://www.codechobo.com:80/sample/"+"hello.html?referer=codechobo#index1");
		
		System.out.println("url.getAuthority(): "+url.getAuthority());//ȣ��Ʈ��+��Ʈ��ȣ 
		System.out.println("url.getContent(): "+url.getContent());//url�� content��ü ��ȯ
		System.out.println("url.getDefaultPort(): "+url.getDefaultPort());// �⺻ ����Ʈ ��Ʈ ��ȯ : 80
		System.out.println("url.getPort(): "+url.getPort());// ��Ʈ��ȣ ��ȯ
		System.out.println("url.getFile(): "+url.getFile());//ȣ��Ʈ��� ��Ʈ��ȣ �ڿ� �ִ�!!! ���ϸ� ��ȯ(��������)
		System.out.println("url.getHost(): "+url.getHost());//ȣ��Ʈ�� ��ȯ
		System.out.println("url.getPath(): "+url.getPath());//ȣ��Ʈ�� �ڿ� �ִ� ��θ� ��ȯ
		System.out.println("url.getProtocol(): "+url.getProtocol()); //�������� ��ȯ
		System.out.println("url.getQuery(): "+url.getQuery());//������ ��ȯ
		System.out.println("url.getRef(): "+url.getRef());//���� ��ȯ
		System.out.println("url.getUserInfo(): "+url.getUserInfo());//����� ���� ��ȯ ������ null
		System.out.println("url.toExternalForm(): "+url.toExternalForm()); //url�� ���ڿ��� ��ȯ
		System.out.println("url.toURI(): "+url.toURI());//url�� uri�� ��ȯ
		
		
		
	}

}
