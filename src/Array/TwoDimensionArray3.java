package Array;

import java.util.Scanner;

public class TwoDimensionArray3 {

	public static void main(String[] args) {
		
		String[][] word= {
				{"chair","����"},	
				{"computer","��ǻ��"},	
				{"integer","����"}	
		};
		Scanner sc=new Scanner(System.in);
		String input="";
		for(int i=0;i<word.length;i++) {
			System.out.printf("Q%d. %s�� ����?",i+1,word[i][0]);
			input=sc.nextLine();
			if(word[i][1].equals(input)) {
				System.out.println("�����Դϴ�!!!!!!!");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�%n",word[i][1]);
			}
		}
		
		
		
		
		
		
		
	}

}
