package JavalangPackage;

public class EmptyString {

	public static void main(String[] args) {
		
		char[] cArr=new char[0];//后傍归 硅凯积己
		String s=new String(cArr);//后傍归 new String("")
		
		System.out.println(cArr.length);
		System.out.println("@@@"+s+"@@@");
		
	}

}
