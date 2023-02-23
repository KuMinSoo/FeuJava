package JavalangPackage;

import java.util.Arrays;
import java.util.Date;

public class StringMethod {

	public static void main(String[] args) {
		
		//String(char[] value)
		char[]c= new char[] {'1','2','4','7',};
		String s=new String(c);
		System.out.println(s);//char �迭�� �ϳ��� ���ڿ��� ����
		
		//String(StringBuffer buf)
		StringBuffer sb=new StringBuffer("hello");
		String ss=new String(sb);//StringBuffer�� ���ο� ���ڿ���ü�� ����
		System.out.println(ss);
		
		
		
		//char charAt(int index)
		String s1="hello";
		String s2="012345";
		char a=s1.charAt(0);//���ڿ� �߿� ù��° �ε����� ��ȯ
		System.out.println(a);
		char a1=s2.charAt(5);
		System.out.println(a1);
	
		//int compareTo(String str) ������ 0 , ������ -1, ũ�� 1
		int i="aa".compareTo("aa");//0
		System.out.println(i);
		int ii="aa".compareTo("bb");//-1
		System.out.println(ii);
		int iii="bb".compareTo("aa");
		System.out.println(iii);
		
		//String concat(String str)
		String s3="hello";
		String s4=s3.concat(" world");
		System.out.println(s4);
	
		//boolean contains(CharSequence s)
		String s5="asdfqwe";
		boolean s6=s5.contains("ssd");//�ڿ� ���ڿ��� ���Ե��ִ��� Ȯ��
		System.out.println(s6);
		
		//boolean endsWith(String suffix)
		String file="hello.txt";
		boolean b=file.endsWith(".txt");
		System.out.println(b);
		
		//boolean equals(Object obj)
		String s7="hello";
		System.out.println(s7.equals("Hello"));
		System.out.println(s7.equals("hello"));
		
		//boolean equalsIgnoreCase(String str)
		System.out.println(s7.equalsIgnoreCase("Hello"));
		System.out.println(s7.equalsIgnoreCase("hello"));
		
		//int index0f(int ch)
		System.out.println(s7.indexOf('h'));
		System.out.println(s7.indexOf('l'));
		
		
		//int indexof(int ch,int pos)// ch ���ڸ� �ش���ü���� �پ� ã�´�
		String ss1="helooooooooooooooasd";
		int id=ss1.indexOf("o", 1);//�ش� ��ġ�������� �ش� ���ڰ� �ִ� �ε����� ��ȯ���ְ� ������ -1�� ��ȯ�Ѵ�
		System.out.println(id);
		
		//int lastIndexof(int ch)// ������ �ε����� ������ ������ ã����
		String s11="java.lang.java";
		int id1=s11.lastIndexOf('.');
		int id2=s11.indexOf('.');
		System.out.println(id1);
		System.out.println(id2);
		//int lastIndexof(String str)
		int id11=s11.lastIndexOf("ava");//ava ���ڰ� �����ϴ� ù���� a�� �ε��� ��ġ�� ��ȯ�Ѵ�
		System.out.println(id11);
		int id12=s11.indexOf("jav");
		System.out.println(id12);
		
		//String replace(char old, char nw)
		String a123=ss1.replace('h', 'c');
		System.out.println(a123);
		
		String a1234=a123.replace("el", "cc");
		System.out.println(a1234);
		
		
		//String replaceAll(String reg, String replace)
		String ab="AABBAABB";
		String r=ab.replaceAll("BB", "AA");
		System.out.println(r);
		
		String q=ab.replaceFirst("BB", "AA");
		System.out.println(q);
		
		//String[] split(String regex)
		String animals="dog, cat, bear,fox,frog,rabbit";
		String[] arr=animals.split(", +");
		System.out.println(Arrays.toString(arr));
		
		//String[] split(String regex, int limit)
		String[] arr2=animals.split(",",3);//�ڿ� �ִ� 3�� �ش� �迭�� ���̸� ����ϰ� 2���� , �������� ������ �������� �Ѱ��� �迭�� �����Ѵ�
		System.out.println(arr2.length);
		
		
		//boolean startswith(String prefix) �־��� ���ڰ� �����ϴ���
		System.out.println(s11.startsWith("java"));//ó������ ���۵Ǵ� ���̾�� �Ѵ�
		System.out.println(s11.startsWith("ava"));// false
		System.out.println(s11.startsWith("lang"));//�� ���� ���� false
		
		//String substring(int begin)
		//String substring(int begin, int end)
		String qwe="javaisdifficult";
		System.out.println(qwe.substring(3));
		System.out.println(qwe.substring(3,5));//3�� ���� 5�� ������
		
		
		//String toLowerCase()
		String qqwe="Hello";
		System.out.println(qqwe.toLowerCase());
		
		//String toString()
		System.out.println(qqwe.toString());
	
		//String toUpperCase()
		System.out.println(qqwe.toUpperCase());
	
		//String trim()
		String asdx="         hel       ll          word       ";
		System.out.println(asdx.trim());//�糡 ��������, �߰������� ���ŵ��� �ʴ´�.
		
		//String valueOf()// ������ ���� ���ڿ��� ��ȯ
		java.util.Date dd=new java.util.Date();
		String aqs=String.valueOf(dd);
		System.out.println(aqs);
		//String valueOf(byte, Integer, char ��� �������� �⺻���� ������ Object �Ű������� �ִ�)
		
		
	
	}	
}
