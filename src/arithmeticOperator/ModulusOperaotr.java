package arithmeticOperator;

public class ModulusOperaotr {

	public static void main(String[] args) {
		
		int x=10;
		int y=8;
		System.out.printf("%d을 %d로 나누면,%n",x,y);
		System.out.printf("몫은 %d이고, 나머지는 %d이다.",x/y,x%y);
		
		System.out.println("-----------------");
		
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		//여기서 제일 중요한 부분은 나누는 수는 음수를 허용하며 실제 계산시에는 부호가 무시되고 음수의 절대값으로 계산된다.
	}

}
