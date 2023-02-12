package Networking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx3 {

	public static void main(String[] args) {

		try {
			URL url=new URL("http://www.codechobo.com/sample/hello.html");//url 생성
			//첫번째 방법
			URLConnection uc=url.openConnection();
			InputStream isi=uc.getInputStream();
			//1. url을 생성
			//2. URLConnection 웹과 어플리케이션(java) 연결
			//3. InputStream 객체로 만들어 해당 내용 읽기 
			
			
			//두번째 방법
			InputStream is=url.openStream();
			//openStream()은
			//URLConnection:OpenConnection -> 후에 InputStream : getInputStream 같다.
			//즉, 해당 url을 웹과 연동한 후 inputStream으로 만든다!
			
			
			InputStreamReader isr=new InputStreamReader(is);//바이트 기반-->문자기반으로 바꿈
			BufferedReader br=new BufferedReader(isr);//버퍼를 이용한 효율적인 출력
			
			File file=new File(".\\src\\Networking\\test.txt");//해당 url를 저장할 파일 생성
			if(!file.exists()&&!file.isDirectory()) {//파일 유효성 체크(해당 경로에 파일 없으면 생성
				file.createNewFile();//해당 파일 생성
				System.err.println("파일 생성");
			}else {
				System.err.println("기존 파일 있음");
				
			}
			
			
			FileOutputStream fr=new FileOutputStream(file);
			PrintStream pw=new PrintStream(fr);
			System.setOut(pw);		
			
			
			String line="";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			System.err.println("성공");
			pw.close();
			fr.close();
			
			br.close();
			isr.close();
			is.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
