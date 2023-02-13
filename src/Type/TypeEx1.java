package Type;

public class TypeEx1 {

	public static void main(String[] args) {

		//덧셈의 경우 왼쪽에서 오른쪽으로 간다.
		//숫자 옆에 ""붙이면 문자열로 된다.
		System.out.println(7+7+"");//14문자열
		System.out.println(""+7+7);//77문자열 
		System.out.println(String.valueOf(7+7));
		System.out.println(String.valueOf(7+7).getClass().getName());
		
		System.out.println("======두 변수의 값 바꾸기======");
		//두 변수의 값 바꾸기
		int x=10, y=5, tmp=0;
		System.out.println("x="+10);
		System.out.println("y="+5);
		
		tmp=x;//임시로 x값을 tmp에 담아줌
		x=y;//y값을 x에 넣기
		y=tmp;//y에 tmp(x값) 넣기
		System.out.println("변경 후");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println(true+"");
		System.out.println(new String(true+"").getClass().getName());
		System.out.println('A'+'B');
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+"ava");
		
		System.out.println("===연습문제 2===");
		x=1;
		y=2;
		int z=3;
		tmp=0;
		
		tmp=x;
		
		x=y;
		y=z;
		z=tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
	}

}
