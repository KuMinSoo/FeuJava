package Networking;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) throws Exception {

		String address="http://www.codechobo.com/sample/hello.html";
		
		URL url=new URL(address);	
		URLConnection conn=url.openConnection();	
		
		System.out.println("conn.toString(): "+conn.toString());//conn ��ü ��ȯ
		System.out.println("getAllowUserInteraction():"+conn.getAllowUserInteraction()); //UserInteraction ��뿩�� ��ȯ
		System.out.println("getConnectTimeout(): "+conn.getConnectTimeout());//���� ���� �ð� õ���� 1 ��ȯ
		System.out.println("getContent():"+conn.getContent());//content��ü ����
		System.out.println("getContentEncoding(): "+conn.getContentEncoding());//content�� ���ڵ� ��ȯ
		System.out.println("getContentLength(): "+conn.getContentLength());//content ũ�� ��ȯ
		System.out.println("getContentType(): "+conn.getContentType());// ����Ʈ Ÿ�� ��ȯ... text/html
		System.out.println("getDate(): "+(conn.getDate()));//����� date �ʵ尪 ��ȯ
		System.out.println("getDefaultAllowUserInteraction(): "+conn.getDefaultAllowUserInteraction());
		System.out.println("getDoInput(): "+conn.getDoInput()); //doIntput �ʵ尪 ��ȯ
		System.out.println("getDoOutput(): "+conn.getDoOutput()); //doOutput �ʵ尪 ��ȯ
		System.out.println("getExpiration(): "+conn.getExpiration());//���� ���� ��ȯ 1000���� 1 ����.. : long Ÿ��
		System.out.println("getHeadFleids(): "+conn.getHeaderFields());// ����� ��� �ʵ�� �� Map ���·� ��ȯ
		System.out.println("getIfModifiedSince(): "+conn.getIfModifiedSince()); //(���濩��) �ʵ��� �� ��ȯ
		System.out.println("getLastModified(): "+conn.getLastModified());//(LastModified)���� ������ �ʵ尪 ��ȯ
		System.out.println("getReadTimeout(): "+conn.getReadTimeout());//�б� ���� �ð��� �� ��ȯ
		System.out.println("getURL(): "+conn.getURL());// url ��ȯ..
		System.out.println("getUseCache(): "+conn.getUseCaches());//ĳ�� ��뿩�θ� true/false ��ȯ
		
		
		
		
		
		

	}

}
