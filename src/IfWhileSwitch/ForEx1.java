package IfWhileSwitch;

public class ForEx1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<6;i++) {
			System.out.printf("1부터 %d번째까지의 합: %d%n",i,sum+=i);
		}

		System.out.println("=========");
		for(int i=3;i<3*3*3*3*3*2;i*=3) {
			for(int j=20;j>1;j-=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=========");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("===========");
		for(int i=0;i<5;i++) {
			for(int j=0;i>=j;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
