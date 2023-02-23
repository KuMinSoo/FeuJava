package Test;

import java.util.Scanner;
import java.util.StringJoiner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하면 소수로 출력합니다");
		int input=0;
		for(;;) {
			try {

				input=sc.nextInt();
					
			}catch(Exception e) {
				System.out.println("정수를 입력해야됩니다.");
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
