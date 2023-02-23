package JavalangPackage;

public class Ex5 {

	public static String delChar(String src, String delCh) {
		if(src==null||delCh==null) {
			throw new NullPointerException();
		}
		
		
		StringBuffer sb=new StringBuffer(src);
		for(int i=0;i<sb.length();i++) {
			char ch=sb.charAt(i);
			for(int j=0;j<delCh.length();j++) {
				char ch2=delCh.charAt(j);
				if(ch==ch2) {
					sb.deleteCharAt(i);
					i--;break;
				}
			}
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+"->"+delChar("(1!2@3^4~5)","~!@#$%^&*()"));

	}

}
