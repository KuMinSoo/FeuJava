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
		
		//기존 파일이 있을때!!
		File f=new File("c:\\Users\\user\\eclipse-workspace\\FeuJava\\src\\IO","FileEx2.java");
		FileReader ff=new FileReader(f);
		BufferedReader bf=new BufferedReader(ff);
		String data="";
		
		while((data=bf.readLine())!=null) {
			if(data.indexOf('.')!=-1) {
				System.out.println(data);
			}
		}
	
		//기존 파일이 없을때 첫번째 방법
		File fa=new File("c:\\Users\\user\\eclipse-workspace\\FeuJava\\src\\IO","starbucks.java");
		fa.createNewFile();//파일 생성
		System.out.println("파일생성1");
	
		//기존 파일이 없을때 두번째 방법
		File faa=new File("gagahoho.java");
		
		if(faa.createNewFile()) {
			System.out.println(faa.getName()+"파일이 생성되었습니다..");
		}else System.out.println("기존에 있는 파일 입니다.");
		
		//파일 내용 넣기
		FileOutputStream fos=new FileOutputStream(faa);
		Scanner sc=new Scanner(System.in);
		System.out.println("파일에 넣고 싶은 내용을 적고 엔터를 누르세요");
		String input=sc.nextLine();
		fos.write(input.getBytes());
		fos.close();
		
		
		System.out.println("파일생성2");
			
	
	
	
	}

}
