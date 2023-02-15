package IfWhileSwitch;

public class Ex3 {

	public static void main(String[] args) {

		int anwser=(int)Math.random()*100+1;
		int input=0;
		int count=0;
		
		java.util.Scanner s= new java.util.Scanner(System.in);
		do {
			count++;
			System.out.println("1과 100 사이의 값을 입력하세요");
			input=s.nextInt();
				
			if(anwser>input) {
				System.out.printf("더 큰수를 입력하세요");
			}else if(anwser<input) {
				System.out.println("더 작은 수를 입력하세요");
			}
			if(anwser==input) {
				System.out.println("맞혔습니다.");
				System.out.printf("시도회수는 %d번입니다.",count);
				break;
			}
		}while(4==4);
		
	}

}
