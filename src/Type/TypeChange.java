package Type;

public class TypeChange {

	public static void main(String[] args) {

		//타입 간의 변환방법
		
		//숫자를 문자로 변환-숫자 뒤에 +'0'을 더한다.
		char a=(char)(3+'0');
		System.out.println("3+\'0\': "+a);

		//문자를 숫자로 변환 
		int b='4'-'0';
		System.out.println("'4'-'0': "+b);
	
		//숫자를 문자열로 변환
		String c=3+"";
		System.out.println("3+\"\": "+c);
		
		//문자열을 숫자로 변환(Integer)
		int d=Integer.parseInt("5");
		System.out.println("Integer.parseInt(\"5\"):"+d);
		int e=Integer.valueOf("6");
		System.out.println("Integer.valueOf(\"6\"): "+e);
		
		//문자열 숫자로 변환(Double)
		Double f=Double.parseDouble("3.14f");
		System.out.println("Double.parseDouble(\"3.14f\"): "+f);
		f=Double.parseDouble("3.14");
		System.out.println("Double.parseDouble(\"3.14\"): "+f);
		f=Double.valueOf("3.14");
		System.out.println("Double.valueOf(\"3.14\")"+f);
		
		//문자열을 문자로 변환
		char x="3".charAt(0);
		System.out.println("\"3\".charAt(0): "+x);
		
		//문자를 문자열로 반환
		String g='3'+"";
		String w=String.valueOf('3');
		System.out.println("\'3\'+\"\": "+g);
		System.out.println("String.valueOf(\'3\'): "+w);
		
		System.out.println();
		
		Character variable = (3+'0');
		System.out.println(variable);
		System.out.println(variable.getClass().getName());
		
		Integer variable2='3'-'0';
		System.out.println(variable2);
		System.out.println("variable2: "+variable2.getClass().getName());
	
		System.out.println("====예제1===");
		String str="3";
		System.out.println(str.charAt(0)-'0'+2);
		System.out.println('3'-'0'+1+'4'-'0');
		System.out.println(Integer.parseInt("10")+4);
		System.out.println(Integer.parseInt("3"+1)+9);
		System.out.println((char)(3+'0'));
	}

}


