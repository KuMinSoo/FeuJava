package JavalangPackage;

public class Equals {

	public static void main(String[] args) {
		Value v1=new Value(10);
		Value v2=new Value(10);
		if(v1.equals(v2))
			System.out.println("v1과 v2 같습니다");
		else
			System.out.println("v1과 v2는 다릅니다");

		
		
		String a=new String("10");
		String b=new String("10");
		
		if(a==b) 
			System.out.println("a==b는 true");
		else
			System.out.println("a==b는 false");
		
		
		
		if(a.equals(b))
			System.out.println("a과 b는 같습니다");
		else
			System.out.println("a과 b는 다릅니다");
		
		//중요!!!!!!!!!!!!!!!!!!!!
		//기본형 매퍼클래스(Byte, Integer, Short 등)과 String은 기본적으로 Object의 equals 매서드가 주소값이 아닌 참조변수의 값을 비교할 수 있도록 오버라이딩!!되어 있다.
		//그래서 주소값이 다른 객체라도 값을 비교할 수 있도록 설정이 되어 있다.
		
		//그러나 그 외의 그냥 객체를 비교할때에는 Object의 equals 메소드가 오버라이딩 되어 있지 않기 때문에 주소값만 비교하게 되어 있고
		//참조변수의 값을 비교하고 싶으면 Override해서 설정해야된다.
		
		
		
		
	}
}

class Value{
	
	int value;
	
	Value(int value){
		this.value=value;
	}
}