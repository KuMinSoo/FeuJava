package Test;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//����ڷκ��� �Է¹��� ���� ���� n�� ����, n�� ���丮���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		while(1==1) {
			int input=0;
			try {
				System.out.println("���� ������ �Է��ϸ� ���丮��� ����մϴ� >> �Է��ϼ���");
				input=new Scanner(System.in).nextInt();
				if(input<0) {
					System.out.println("������ �ƴ� ���� ������ �Է��ϼ���");
					continue;
				}
			}catch(Exception e) {
				System.out.println("���� ������ �Է��ϼ���");
				continue;
			}
			int result=1;
			for(int i=input;i>0;i--) {
				result*=i;
				System.out.printf("%s",(i!=1)?i+" X ":i +"=");
			}
			System.out.println(result);
		}
		
	}

}
