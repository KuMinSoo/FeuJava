package IO;

import java.io.*;

public class BufferedOutputStreamEx {


	 public static void main(String[] args) {
	      try {
	         FileOutputStream fos = new FileOutputStream("123.txt");
	         BufferedOutputStreamEx bos = new BufferedOutputStreamEx(fos, 5);
	         for (int i = '1'; i < '9'; i++) {
	            bos.write(i);
	         }
	         bos.close();
	         fos.close();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
	}