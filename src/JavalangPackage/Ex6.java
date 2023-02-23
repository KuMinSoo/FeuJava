package JavalangPackage;

public class Ex6 {

	
	static String delChar(String src, String delCh) {
		if(src==null || delCh==null) {
			throw new NullPointerException();
		}
		StringBuilder sb= new StringBuilder(src.length());
		
		int i=0;
		int k=0;
		while(i<src.length()) {
			char a=src.charAt(i);
			
				if(delCh.indexOf(a)==-1) {
					sb.append(a);
					
				}				
				i++;
			}
			
		
			return sb.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+"->"+delChar("(1!2@3^4~5)","~!@#$%^&*()"));

	}

}
