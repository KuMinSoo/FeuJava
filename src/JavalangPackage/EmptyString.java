package JavalangPackage;

public class EmptyString {

	public static void main(String[] args) {
		
		char[] cArr=new char[0];//����� �迭����
		String s=new String(cArr);//����� new String("")
		
		System.out.println(cArr.length);
		System.out.println("@@@"+s+"@@@");
		
	}

}
