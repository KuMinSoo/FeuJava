package Array;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {

		//1.변수 선언
		int[] score1;
		
		//2.변수 생성
		score1=new int[] {10,2,3,4,5};
		//단. 변수 선언을 따로 한 후 변수 생성시 new int[] 생략 불가
		int[] scoree;
		//scoree= {1,2,3,4};
		
		
		//바로 변수선언과 변수 생성을 할 수 있음
		int[] score=new int[] {50,60,60,50,40};
		int[] score2= {1,2,2,3,4}; //new int[] 생략 가능
		
		
		//배열 요소 부르기 Arrays.toString
		System.out.println(Arrays.toString(score2));
		
		//toString은 타입@주소 출력한다.
		System.out.println(score2);
	
		//예외적으로 char[]은 변수 이름만 호출해도 배열 요소를 다 호출해준다.
		char[] ch= new char[] {'1','2','3'};
		System.out.println(ch);//123 붙여서 출력
		System.out.println(Arrays.toString(ch));//[1,2,3] 이렇게 정리해서 출력 
		//char[]배열 변수이름에 String 값을 붙여서 출력할 경우 객체주소 반환한다.
		System.out.println("ch: "+ch);
	
		//배열 총합과 평균
		int sum=0;
		float average=0f;
		
		int[] score11=new int[] {100,88,100,100,90};
		for(int i=0;i<score11.length;i++) {
			sum+=score11[i];
		}
		average = sum/(float)score11.length;
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);
		
		System.out.println("=====최대값 최소값====");
		int[] score111= new int[]{79,88,91,33,100,55,95};
		
		int max=score111[0];
		int min=score111[0];
		
		for(int i=1;i<score111.length;i++) {
			if(score111[i]>max) {
				max=score111[i];
			}else if(score111[i]<min) {
				min=score111[i];
			}
		}
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
		
		
	
	}	

}
