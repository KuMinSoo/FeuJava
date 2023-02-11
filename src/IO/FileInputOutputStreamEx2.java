package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamEx2 {

	public static void main(String[] args) {
		String path = FileInputOutputStreamEx2.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		File file = new File(path);
		System.out.println("Current Java File Path: " + file.getAbsolutePath());
		String realPath=file.getAbsolutePath()+"\\FileInputOutputStreamEx2.class";
		System.out.println(realPath);

		
	}

}
