package IfWhileSwitch;

public class Ex3 {

	public static void main(String[] args) {

		int anwser=(int)Math.random()*100+1;
		int input=0;
		int count=0;
		
		java.util.Scanner s= new java.util.Scanner(System.in);
		do {
			count++;
			System.out.println("1�� 100 ������ ���� �Է��ϼ���");
			input=s.nextInt();
				
			if(anwser>input) {
				System.out.printf("�� ū���� �Է��ϼ���");
			}else if(anwser<input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}
			if(anwser==input) {
				System.out.println("�������ϴ�.");
				System.out.printf("�õ�ȸ���� %d���Դϴ�.",count);
				break;
			}
		}while(4==4);
		
	}

}
