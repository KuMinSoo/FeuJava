package IO;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class StrandardIO {

	public static void main(String[] args) {

		PrintStream ps=null;
		FileOutputStream fos=null;
		Scanner sc=new Scanner(System.in);
		ByteArrayInputStream is=null;
		byte[] ac=null;
		int data=0;
		try{
			fos=new FileOutputStream("test.txt");
			ps=new PrintStream(fos);
			System.out.println("�Է��ϼ���");
			System.setOut(ps);
			System.setErr(ps);
			System.setIn(is);
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		//sc.nextLine();
		
		String aa=sc.nextLine();
		ac=new byte[aa.length()];
		for(int i=0;i<aa.length();i++) {
			ac[i]=(byte) aa.charAt(i);
		}
		is=new ByteArrayInputStream(ac);
		
		try {
			InputStreamReader isr=new InputStreamReader(is,"utf-8");
			while((data=isr.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {e.printStackTrace();}
		System.out.println();
		System.out.println("Out: ������ �Է� ��ΰ� �م����ϴ�. ");
		System.err.println("Err: ������ �Է� ��ΰ� �م����ϴ�. ");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		
	}

}
