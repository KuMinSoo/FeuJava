package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWriterEx {

	public static void main(String[] args) {

		try {
			FileReader fr=new FileReader(".\\src\\IO\\BufferedReaderWriter.java");
			BufferedReader br=new BufferedReader(fr);
			
			String line="";
			int cnt=1;
			while((line=br.readLine())!=null) {
				if(line.indexOf(';')!=-1) {
					System.out.println(cnt+":"+line);
				}
				cnt++;
			}
			
			
			
			
		} catch (IOException e) {e.printStackTrace();}
		
		
		
	}

}
