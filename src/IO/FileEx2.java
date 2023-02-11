package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class FileEx2 {

	public static void main(String[] args) throws Exception{
		File fr=new File(".\\src\\IO\\FileEx2.java");
		System.out.println(System.getProperty("user.dir"));
		System.out.println(fr.getCanonicalPath());
		
		//���� ������ ������!!
		File f=new File("c:\\Users\\user\\eclipse-workspace\\FeuJava\\src\\IO","FileEx2.java");
		FileReader ff=new FileReader(f);
		BufferedReader bf=new BufferedReader(ff);
		String data="";
		
		while((data=bf.readLine())!=null) {
			if(data.indexOf('.')!=-1) {
				System.out.println(data);
			}
		}
	
		//���� ������ ������ ù��° ���
		File fa=new File("c:\\Users\\user\\eclipse-workspace\\FeuJava\\src\\IO","starbucks.java");
		fa.createNewFile();//���� ����
		System.out.println("���ϻ���1");
	
		//���� ������ ������ �ι�° ���
		File faa=new File("gagahoho.java");
		
		if(faa.createNewFile()) {
			System.out.println(faa.getName()+"������ �����Ǿ����ϴ�..");
		}else System.out.println("������ �ִ� ���� �Դϴ�.");
		
		//���� ���� �ֱ�
		FileOutputStream fos=new FileOutputStream(faa);
		Scanner sc=new Scanner(System.in);
		System.out.println("���Ͽ� �ְ� ���� ������ ���� ���͸� ��������");
		String input=sc.nextLine();
		fos.write(input.getBytes());
		fos.close();
		
		
		System.out.println("���ϻ���2");
			
	
	
	
	}

}
