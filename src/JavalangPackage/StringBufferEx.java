package JavalangPackage;

public class StringBufferEx {

	public static void main(String[] args) {
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
