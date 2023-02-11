package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx2 {

	public static void main(String[] args) {
		try {
			String path = FileReaderWriterEx2.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			File file = new File(path);
			System.out.println("Current Java File Path: " + file.getAbsolutePath());
			String realPath=file.getAbsolutePath()+"\\FileReaderWriterEx2.class";
			System.out.println(realPath);

			File txt=new File("convert.txt");
			String txtt=txt.getAbsolutePath();
			System.out.println(txtt);
			
			FileReader fr=new FileReader(path);
			FileWriter fw=new FileWriter(txtt);

			int data=0;
			while((data=fr.read())!=-1) {
				if(data!='\t' && data!='\n' && data!=' ' && data!='\r') {
					fw.write(data);
				}
			}
			fr.close();
			fw.close();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
