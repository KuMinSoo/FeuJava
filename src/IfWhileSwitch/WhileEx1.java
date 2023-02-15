package IfWhileSwitch;

public class WhileEx1 {

	public static void main(String[] args) {

		int i=5;
		while(i--!=0){
			System.out.println(i+" - i can do it ");
		}
		
		System.out.println("==============");
		
		int k=0;
		int sum=0;
		while(k<14) {
			sum+=k;
			System.out.printf("%d - %d%n",k,sum);
			k++;
		}
		
		
		
	}

}
