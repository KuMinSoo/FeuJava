package JavalangPackage;

public class StringBufferEx {

	public static void main(String[] args) {
		//StringBuffer의 append 메소드는 자신의 객체주소를 반환하기 때문에 자신의 주소에서 이어서 계속 합칠 수 있다.
		//새로운 객체가 생기지 않고 자신의 객체에서 그대로 추가된다.
		
		StringBuffer sb=new StringBuffer("abc");
		sb.append("123");
		sb.append("456").append("asdfas").append("111");
		
		StringBuffer sb2=sb;
		
		System.out.println(sb);
		sb.append("추가");
		sb.append("df");
		sb2.append("sb2추가");
		
		
		System.out.println(sb2);
		System.out.println(sb);
		
	}

}
