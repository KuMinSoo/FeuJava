package IO;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

public class StringReaderWriter {

	public static void main(String[] args) throws Exception {
		
		String inputData="ABCDEFGQWEASDS";
		StringReader input=new StringReader(inputData);
		StringWriter output=new StringWriter();
		char[] test=null;
		int data=0;
		while((data=input.read())!=-1) {
			output.write(data);
		}
		
		System.out.println("inputData: "+inputData);
		
		System.out.println("input:  "+input.toString());
		System.out.println("output:   "+output.toString());

	
	
	}

}
