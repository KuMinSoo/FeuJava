package IfWhileSwitch;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		int score=0;
		char grade=' ',opt= '0';

		System.out.println("������ �Է����ּ���.>");
		Scanner sc=new Scanner(System.in);
		score = sc.nextInt();
		
		if(score>=90) {
			grade='A';
			if(score>=98) {
				opt='+';
			}else if(score<94){
				opt='-';
			}
		}else if(score>=80) {
			grade='B';
			if(score>=88) {
				opt='+';
			}else if(score<84){
				opt='-';
			}
		}else {
			grade='C';
		}
		System.out.printf("����� ������ %s���Դϴ�%n",score);
		System.out.printf("����� ������ %c%c%n",opt,grade);
		

	}

}
