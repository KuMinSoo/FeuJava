package Type;

public class TypeChange {

	public static void main(String[] args) {

		//Ÿ�� ���� ��ȯ���
		
		//���ڸ� ���ڷ� ��ȯ-���� �ڿ� +'0'�� ���Ѵ�.
		char a=(char)(3+'0');
		System.out.println("3+\'0\': "+a);

		//���ڸ� ���ڷ� ��ȯ 
		int b='4'-'0';
		System.out.println("'4'-'0': "+b);
	
		//���ڸ� ���ڿ��� ��ȯ
		String c=3+"";
		System.out.println("3+\"\": "+c);
		
		//���ڿ��� ���ڷ� ��ȯ(Integer)
		int d=Integer.parseInt("5");
		System.out.println("Integer.parseInt(\"5\"):"+d);
		int e=Integer.valueOf("6");
		System.out.println("Integer.valueOf(\"6\"): "+e);
		
		//���ڿ� ���ڷ� ��ȯ(Double)
		Double f=Double.parseDouble("3.14f");
		System.out.println("Double.parseDouble(\"3.14f\"): "+f);
		f=Double.parseDouble("3.14");
		System.out.println("Double.parseDouble(\"3.14\"): "+f);
		f=Double.valueOf("3.14");
		System.out.println("Double.valueOf(\"3.14\")"+f);
		
		//���ڿ��� ���ڷ� ��ȯ
		char x="3".charAt(0);
		System.out.println("\"3\".charAt(0): "+x);
		
		//���ڸ� ���ڿ��� ��ȯ
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
	
		System.out.println("====����1===");
		String str="3";
		System.out.println(str.charAt(0)-'0'+2);
		System.out.println('3'-'0'+1+'4'-'0');
		System.out.println(Integer.parseInt("10")+4);
		System.out.println(Integer.parseInt("3"+1)+9);
		System.out.println((char)(3+'0'));
	}

}


