package JavalangPackage;

public class Ex5 {

	public static String delChar(String src, String delCh) {
		StringBuffer sb=new StringBuffer(src);
		
		for(int i=0;i<src.length();i++) {
			int pos=0;
			for(int j=0;j<delCh.length();j++) {
				char ch=delCh.charAt(j);
				int idx=0;
				while(idx!=-1) {
					idx=src.indexOf(ch, pos);
					if(idx!=-1) {
						sb.deleteCharAt(idx);
						pos=idx;	
					}else {
						break;
					}
					
				}
			}
		
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()"));

	}

}
