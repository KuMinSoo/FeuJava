package Test;

import java.util.Scanner;
import java.util.StringJoiner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϸ� �Ҽ��� ����մϴ�");
		int input=0;
		for(;;) {
			try {

				input=sc.nextInt();
					
			}catch(Exception e) {
				System.out.println("������ �Է��ؾߵ˴ϴ�.");
			}
			StringJoiner jb=new StringJoiner(" ,","[","]");
			for(int i=1;i<=input;i++) {
				if(i<10) {
					if(!((i/2>1 && i%2==0)  || (i/3>1 && i%3==0))) {
						jb.add(String.valueOf(i));
					}
				}
				if(i>=10) {
					if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
						jb.add(i+"");
					}
				}
				
			}
			System.out.println(jb);
	
		}
				

	}

}
