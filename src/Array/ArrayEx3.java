package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {

		System.out.println("=====문제1=====");
		int[] arr= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum="+sum);

		System.out.println("=====문제2=====");
		
		int[][]arr11= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
		};
		int total=0;
		int i=0,k=0;
		float average=0;
		for(i=0;i<arr11.length;i++) {
			for(k=0;k<arr11[i].length;k++) {
				total+=arr11[i][k];
			}
		}
		average=(float)total/(arr11.length*arr11[0].length);
		System.out.println(arr11.length*arr11[0].length);
		
		
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		System.out.println("==== 문제 3====");
		
		int[] ballArr= {1,2,3,4,5,6,7,8,9,};
		int[] ball3= new int[3];
		
		
		for(i=0;i<ballArr.length;i++) {
			int j=(int)(Math.random()*ballArr.length);
			int tmp=0;
			tmp=ballArr[0];
			ballArr[0]=ballArr[j];
			ballArr[j]=tmp;
		}
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		//ball3=Arrays.copyOfRange(ballArr, 0, 3);
		for(i=0;i<ball3.length;i++) {
			System.out.println(ball3[i]);
		}
		
		System.out.println("=====문제 4====");
		
		String[] words= {"television","computer","mouse","phone"};
		Scanner sc=new Scanner(System.in);
		
		for(int a=0;a<words.length;a++) {
			char[] question=words[a].toCharArray();

			int ran=(int) (Math.random()*question.length);
			
			for(i=0;i<question.length;i++) {
				char tmp=question[i];
				question[i]=question[ran];
				question[ran]=tmp;
			}
		
		System.out.printf("Q%d. %s의 정답을 입력하세요.>",a+1,new String(question));
		
		String answer=sc.nextLine();
		if(words[a].equals(answer.trim())) {
			System.out.printf("정답입니다%n%n%n");
		}else {
			System.out.printf("틀렸습니다%n%n%n");
		}
		
		

			
		}
					
		
	}

}
