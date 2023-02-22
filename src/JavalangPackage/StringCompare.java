package JavalangPackage;

public class StringCompare {

	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		String str4=new String("abc");
		
		//HashCode와 주소값은 다르다.
		//String 에서 값이 같으면 객체가 달라도 HashCode는 무조건 같다.
		//그러나 값이 같다고 주소값도 같지 않다.
		//new String으로 객체를 새롭게 생성하면 값이 같은 값이여도 주소값은 다르다
		//equals 메소드는 해시코드를 비교하는 것이고
		//== 값은 주소값을 비교하는 것이다.
		
		System.out.println(str1==str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	
	}

}
