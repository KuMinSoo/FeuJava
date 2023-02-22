package JavalangPackage;

public class StringBufferEx2 {

	public static void main(String[] args) {

		String a=new String("123");
		String b=new String("123");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//String에서는 equals 메서드가 해당 값을 비교할 수 있도록 오버라이딩이 되어있지만..!!
		//StringBuffer는 equals메서드가 오버라이딩 되지 않아서 주소값만 비교 하는 == 와 동일하다
		
		StringBuffer d=new StringBuffer("123");
		StringBuffer e=new StringBuffer("123");

		System.out.println(d==e);
		System.out.println(d.equals(e));
	
		
		//toString은 오버라이딩을 하고 있어서 해당 문자열!!을 출력해준다 
		System.out.println(d);
		System.out.println(d.toString());
		//그래서 StringBuffer 문자열을 비교할때 equals 메소드를 오버라이딩 하거나 오버라이딩이 귀찮으면..
		//문자열로 뽑아서 비교하면 된다
		System.out.println(d.toString().equals(e.toString()));//true
		//주소값이 아닌 문자열 과 문자열 비교할 수 있도록  toString해준다.. StringBuffer에서는
		//왜냐하면 StringBuffer에서는 equals가 오버라이딩 되어 있지 않고 주소값을 비교하는 형태이기때문이다.
		//그래서 StringBuffer에서는 equals메소드가 주소값을 비교하기 때문에 문자열로 변경하여 toString메서드를 이용해서 문자열값 비교를한다.
		//그러나 String은 equals메서드가 문자열을 비교할 수 있도록 오버라이딩 되어있기때문에 toString메서드를 사용하지 않고 해당 String 객체를 비교할 수 있다.
		System.out.println(d==e);//주소값비교 false
	}

}
