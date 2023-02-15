package IfWhileSwitch;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		int score=0;
		char grade=' ',opt= '0';

		System.out.println("점수를 입력해주세요.>");
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
		System.out.printf("당신의 점수는 %s점입니다%n",score);
		System.out.printf("당신의 학점은 %c%c%n",opt,grade);
		

	}

}
