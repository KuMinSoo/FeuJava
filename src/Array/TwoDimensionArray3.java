package Array;

import java.util.Scanner;

public class TwoDimensionArray3 {

	public static void main(String[] args) {
		
		String[][] word= {
				{"chair","의자"},	
				{"computer","컴퓨터"},	
				{"integer","정수"}	
		};
		Scanner sc=new Scanner(System.in);
		String input="";
		for(int i=0;i<word.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?",i+1,word[i][0]);
			input=sc.nextLine();
			if(word[i][1].equals(input)) {
				System.out.println("정답입니다!!!!!!!");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다%n",word[i][1]);
			}
		}
		
		
		
		
		
		
		
	}

}
