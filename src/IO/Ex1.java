package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1 {

	public static void main(String[] args) {
		try {
	
		
		int lineNum=Integer.parseInt(args[0]);
		String fileName=args[1];
		
		File f=new File(fileName);
		if(f.exists()&&!f.isDirectory()) {
			BufferedReader br=new BufferedReader(new FileReader(fileName));
			String line="";
			int i=1;
			while((line=br.readLine())!=null && i<=lineNum) {
				System.out.println(line);
				i++;
			}
		} else {
			throw new FileNotFoundException(fileName+"��/�� ���丮�̰ų�, �������� �ʴ� �����Դϴ�.");
		}
			
		
			
	}catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
	}catch(Exception e) {
		System.out.println("USAGE: java FileHead 10 FILENAME");
	}
	}
}
