package JavalangPackage;

public class Hashcode {

	public static void main(String[] args) {
		String str1=new String("abc");
		String str2=new String("abc");
		//우리가 객체 주소값 아닌 hashcode를 쓰는 이유는 다량의 데이터를 저장하고 검색하는데 유용하기 때문이다.
		//hashcode는 일정한 범위내에서 생성함으로 검색시 더 빨린 검색가능하다 이를 이용한 변수는 HahsMap,HashSet있다.
		//객체에 저장된 주소값이 있다
		//hashcode는 객체에 저장된 주소값을 바탕으로 또 다른 해시코드을 만듬!!
		//그러나 String은 값이 같으면 똑같은 동일한 Hashcode 반환하나 주소값은 다름.

		
		System.out.println(str1==str2);//주소값이 다름!!!
		System.out.println(str1.equals(str2));//String의 경우는 객체가 달라도 똑같은 hashcode를 반환한다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str1));
		//String에 경우 새로운 객체를 생성하더라도 문자열이 같으면 똑같은 hashcode를 생성한다.
		//그러나 System.identityHashCode를 메서드를 사용하면 Object클래스의 hashCode메서드 처럼 주소값으로 해시코드르 생성함!!
		//이에 같은 값의 String이라도 다른 해시코드르 반환한다.
		
		
		//Integer도 String과 똑같음, 즉 기본형 메퍼와 String 참조변수는 두 객체가 주소값이 달라도 같은 값이면 똑같은 해시코드를 반환한다.
		//그래서 다른 객체인지 해시코드로 구별하려면 System.identityHashcode를 이용하면 된다.
		
		Integer a=new Integer(1);
		Integer b=new Integer(1);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
	}

}
