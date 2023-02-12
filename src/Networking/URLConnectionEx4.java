package Networking;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class URLConnectionEx4 {

	public static void main(String[] args) {
		
		URL url=null;
		InputStream in=null;
		FileOutputStream out=null;
		String address="http://www.codechobo.com/book/src/javabasic_src.zip";
		
		int ch=0;
		try {
			url=new URL(address);
			in=url.openStream();
			out=new FileOutputStream(".\\src\\Networking\\javabasci_src.zip");
			
			while((ch=in.read())!=-1) {
				out.write((char)ch);
			}
			in.close();
			out.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
