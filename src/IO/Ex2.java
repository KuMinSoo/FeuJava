package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Ex2 {

	public static void main(String[] args) {
		
		if(args.length!=1) {
			System.out.println("USAGE: java HexaViewer FileName");
			System.exit(0);
		}

		String fileInput=args[0];
		try {
			FileInputStream fis=new FileInputStream(fileInput);
			PrintStream output=new PrintStream(System.out);
			
			int data=0;
			int i=0;
			while((data=fis.read())!=-1) {
				output.printf("%02X ",data);
				if(++i%16==0) System.out.println();
			}
			output.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
