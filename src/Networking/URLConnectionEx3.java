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
			URL url=new URL("http://www.codechobo.com/sample/hello.html");//url ����
			//ù��° ���
			URLConnection uc=url.openConnection();
			InputStream isi=uc.getInputStream();
			//1. url�� ����
			//2. URLConnection ���� ���ø����̼�(java) ����
			//3. InputStream ��ü�� ����� �ش� ���� �б� 
			
			
			//�ι�° ���
			InputStream is=url.openStream();
			//openStream()��
			//URLConnection:OpenConnection -> �Ŀ� InputStream : getInputStream ����.
			//��, �ش� url�� ���� ������ �� inputStream���� �����!
			
			
			InputStreamReader isr=new InputStreamReader(is);//����Ʈ ���-->���ڱ������ �ٲ�
			BufferedReader br=new BufferedReader(isr);//���۸� �̿��� ȿ������ ���
			
			File file=new File(".\\src\\Networking\\test.txt");//�ش� url�� ������ ���� ����
			if(!file.exists()&&!file.isDirectory()) {//���� ��ȿ�� üũ(�ش� ��ο� ���� ������ ����
				file.createNewFile();//�ش� ���� ����
				System.err.println("���� ����");
			}else {
				System.err.println("���� ���� ����");
				
			}
			
			
			FileOutputStream fr=new FileOutputStream(file);
			PrintStream pw=new PrintStream(fr);
			System.setOut(pw);		
			
			
			String line="";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			System.err.println("����");
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
