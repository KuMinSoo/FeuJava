package IfWhileSwitch;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("====문제 1====");
		int i=0;
		while(i<=10) {
			int x=0;
			while(x<=i) {
				System.out.print("*");
				x++;
			}
			System.out.println();
			i++;
		}


		System.out.println("====문제 2===");
		String str="12345";
		int sum=0;

		for(i=0;i<str.length();i++) {
			int ch=str.charAt(i)-'0';
			sum+=Integer.valueOf(ch);
		}
		System.out.println("sum="+sum);
		
		System.out.println("====문제 3====");
		int cnt=0;
		for(i=1;i<7;i++) {
			for(int j=1;j<7;j++) {
				if(i+j==6) {
					cnt++;
					System.out.printf("%d번째: (%d,%d)%n",cnt,i,j);
				}
			}
		}
		
		System.out.println("=====문제 4====");
		int value=(int) (Math.random()*6+1);
		System.out.println("임의의 난수: "+value);
		
		System.out.println("=====문제 5====");
		int num=12345;
		sum=0;
		
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		
		System.out.println("sum="+sum);
		
		System.out.println("=====문제 6====");
		
	}
	
		

}
