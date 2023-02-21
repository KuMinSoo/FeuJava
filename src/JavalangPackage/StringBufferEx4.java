package JavalangPackage;

public class StringBufferEx4 {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("012");
		StringBuffer sb2=sb.append(3).append("4");
		StringBuffer sb3=sb.append(56);
		sb2.append("78");
		sb3.append(9.0f);
		
		System.out.println("sb="+sb);
		System.out.println("sb2="+sb2);
		System.out.println("sb3="+sb3);
		
		System.out.println("sb="+sb.deleteCharAt(10));
		System.out.println("sb="+sb.delete(3,6));
		System.out.println("sb="+sb.insert(3, "abc"));
		System.out.println("sb="+sb.replace(6, sb.length(), "END"));
		System.out.println("capacity="+sb.capacity());//16+3
		System.out.println("length="+sb.length());
	}

}
