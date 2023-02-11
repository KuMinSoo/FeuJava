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
			
		System.out.println("��� ���� ���ڵ���:" +isr.getEncoding());	
		do {
			System.out.println("������ �Է��ϼ���.. ��ġ�÷��� q�� �����ּ���");
			line=br.readLine();
			if(line.equalsIgnoreCase("q")) {
				System.out.println("����Ǿ����ϴ�...");
			}else {
			System.out.println("�Է��Ͻ� ������ "+line);
			}
		}while(!line.equalsIgnoreCase("q"));
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
