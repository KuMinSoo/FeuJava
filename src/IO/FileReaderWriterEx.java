package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReaderWriterEx {

	public static void main(String[] args) {
		

		String fileName="test.txt";
		String currentFileDirectory=System.getProperty("user.dir")+"\\"+fileName;
		System.out.println(currentFileDirectory);
		File test=new File("FileReaderWriterEx.java");
		String AbsolutePath=test.getAbsolutePath();
		System.out.println(AbsolutePath);
		
		
		try {
			FileInputStream fis=new FileInputStream(fileName);
			InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
			BufferedReader br=new BufferedReader(isr);
			int data=0;
			while((data=br.read())!=-1) {
				System.out.print((char)data);
			}
			
			br.close();
			isr.close();
			fis.close();
			
			System.out.println();
			
			FileReader fr=new FileReader(fileName);
			
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
			fr.close();
			System.out.println();

			System.out.println(System.getProperty("user.dir"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
