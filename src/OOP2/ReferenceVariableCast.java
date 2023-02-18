package OOP2;

public class ReferenceVariableCast {

	public static void main(String[] args) {
		Car car=null;
		FireEngine fe=new FireEngine();
		FireEngine fe2=null;
		
		fe.water();
		car=fe;//FireEngine은 car의 자손임으로 자동항변환 가능함. car의 리모콘으로 fe의 요소를 car 범위 내에서 자유롭게 할 수 있기 땜문..
		//car.water() 안뙴.. 그 이유는 
		fe2=(FireEngine)car; // fe2 리모콘이 자유롭게 사용할 수 있도록 car를 FireEngine으로 강제 항변환 해준다
		fe2.water();
		
		if(fe2 instanceof FireEngine) {
			System.out.println("해당타입은 FireEngine 입니다");
		}
		//보통 조상 타입에서 해당 자손타입이 맞는 알아볼때 사용함
		
		
		if(fe2 instanceof Car) {
			System.out.println("해당타입은 Car 입니다");
		}
	}

}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrr!");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
	
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}