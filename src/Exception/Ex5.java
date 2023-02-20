package Exception;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		
		do {
			count++;
			System.out.println("1°ú 100 »çÀÌÀÇ°ªÀ» ÀÔ·ÂÇÏ¼¼¿ä :");
			try {
				input=new Scanner(System.in).nextInt();
			}catch(Exception e) {
				continue;
			}
			
			if(input>answer) {
				System.out.println("´õ ÀÛÀº ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
			}else if(input<answer){
				System.out.println("´õ Å« ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
			}else {
				System.out.println("¸Â­Ÿ½À´Ï´Ù");
				System.out.println("½ÃµµÈ½¼ö´Â "+count+"¹ø ÀÔ´Ï´Ù");
				break;
			}
			
			
		}while(true);
		
		

	}

	
}
/*
 * class InputMismatchException extends Exception{ InputMismatchException() {
 * 
 * } }
 */
