package OOP1;
class Date_1{
	int value;
}

class Date_2{
	int value;
	Date_2(int value){
		this.value=value;
	}
}
public class ConstructorEx {

	int x;
	public ConstructorEx(int y) {
		x=y;
	}
	//ConstructorEx(){} 오류 발생.. 그 이유는 public class의 생성자를 만들때는 생성자 앞에 public을 붙여줘야 된다.
	//그 이유는 해당 클래스는 제어자 기준으로 활동하는데 다른 클래스에서 해당 클래스를 불러올때 생성자를 자동 생성하는데 
	//이때 클래스는 자유롭게 불러올 수 있는데 해당 생성자를 자유롭게 부르지 못하는 제어자이면 생성자 생성시 오류가 발생하기 때문이다.
	
	
	public static void main(String[] args) {
		Date_1 a=new Date_1();//기본 생성자 자동 생성
		//Date_2 b=new Date_2();//만약 해당 클래스에 생성자를 지정하지 않고 새로 만든 상황인데.. 그 생성자가 매개변수가 있는 생성자이면 .. 매개변수가 있는 생성자만 생성할 수 있음.
		Date_2 c=new Date_2(1);//가능
		//ConstructorEx d=new ConstructorEx();에러.. 위와 마찬가지
		ConstructorEx d=new ConstructorEx(1);
	}

}
