package Array;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {

		//1.���� ����
		int[] score1;
		
		//2.���� ����
		score1=new int[] {10,2,3,4,5};
		//��. ���� ������ ���� �� �� ���� ������ new int[] ���� �Ұ�
		int[] scoree;
		//scoree= {1,2,3,4};
		
		
		//�ٷ� ��������� ���� ������ �� �� ����
		int[] score=new int[] {50,60,60,50,40};
		int[] score2= {1,2,2,3,4}; //new int[] ���� ����
		
		
		//�迭 ��� �θ��� Arrays.toString
		System.out.println(Arrays.toString(score2));
		
		//toString�� Ÿ��@�ּ� ����Ѵ�.
		System.out.println(score2);
	
		//���������� char[]�� ���� �̸��� ȣ���ص� �迭 ��Ҹ� �� ȣ�����ش�.
		char[] ch= new char[] {'1','2','3'};
		System.out.println(ch);//123 �ٿ��� ���
		System.out.println(Arrays.toString(ch));//[1,2,3] �̷��� �����ؼ� ��� 
		//char[]�迭 �����̸��� String ���� �ٿ��� ����� ��� ��ü�ּ� ��ȯ�Ѵ�.
		System.out.println("ch: "+ch);
	
		//�迭 ���հ� ���
		int sum=0;
		float average=0f;
		
		int[] score11=new int[] {100,88,100,100,90};
		for(int i=0;i<score11.length;i++) {
			sum+=score11[i];
		}
		average = sum/(float)score11.length;
		
		System.out.println("����: "+sum);
		System.out.println("���: "+average);
		
		System.out.println("=====�ִ밪 �ּҰ�====");
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
		
		System.out.println("�ִ밪: "+max);
		System.out.println("�ּҰ�: "+min);
		
		
		
	
	}	

}
