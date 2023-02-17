package OOP1;

public class Initialization {
	static {
		System.out.println("초기화 블럭을 실행합니다....");//초기화 블럭은 한번만 생성
	}
	
	//인스턴스 블럭은 인스턴스가 생길때매다 생성됨
	{
		System.out.println("인스턴스 블럭이 실행되었습니다......");
	}
	
	static int[]arr=new int[10];
	
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("ex1 생성자 만들겠습니다");
		Initialization ex1=new Initialization();
		
		System.out.println("ex2 생성자를 만들겠습니다");
		Initialization ex2=new Initialization();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		
	}

}
