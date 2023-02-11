package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class InputStreamReaderOutputStreamWriter {

	public static void main(String[] args) {
		
		Properties prop=System.getProperties();
		System.out.println(prop.get("sun.jnu.encoding"));
		System.out.println("==========================");
		String line="";
		
		try(
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		)
		{
			
		System.out.println("사용 중인 인코딩은:" +isr.getEncoding());	
		do {
			System.out.println("문장을 입력하세요.. 마치시려면 q를 눌러주세요");
			line=br.readLine();
			if(line.equalsIgnoreCase("q")) {
				System.out.println("종료되었습니다...");
			}else {
			System.out.println("입력하신 문장은 "+line);
			}
		}while(!line.equalsIgnoreCase("q"));
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
