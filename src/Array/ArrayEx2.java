package Array;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] iArr1=new int[10];
		int[] iArr2=new int[10];
		int[] iArr3=new int[] {100,95,80,70,60};
		char[] chArr= {'a','b','c','d'};
		
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i]=i+1;
		}
		
		for(int i=0;i<iArr2.length;i++) {
			iArr2[i]=(int) (Math.random()*10+1);
		}

		for(int i=0;i<iArr1.length;i++) {
			System.out.print(iArr1[i]+", ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(iArr3);
		System.out.println(chArr);
		System.out.println(Arrays.toString(chArr));
		
		System.out.println("==========¹è¿­ ¼¯±â 1 ========");
		
		int[] numArr=new int[] {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		//int tmp=0;
		for(int i=0;i<100;i++) {
			int n=(int)Math.random()*10;
			int tmp=numArr[0];
			numArr[0]=numArr[n];
			numArr[n]=tmp;
		
		}
		
		System.out.println(Arrays.toString(numArr));
		
		System.out.println("==========¹è¿­ ¼¯±â 2 ========");
		
		int[] ball=new int[45];
		for(int i=0;i<45;i++) {
			ball[i]=i+1;
		}
		
		
		for(int i=0;i<6;i++) {
			int tmp=0;
			int n=(int)Math.random()*45;
			tmp=ball[i];
			ball[i]=ball[n];
			ball[n]=tmp;
		}
		
		for(int i=0;i<6;i++) {
			System.out.printf("ball[%d] = %d%n",i,ball[i]);
		}
		System.out.println(Arrays.toString(ball));
		
		
		
		
		
		
		
		
	}

}
