package JavalangPackage;

import java.util.Arrays;
import java.util.Date;

public class StringMethod {

	public static void main(String[] args) {
		
		//String(char[] value)
		char[]c= new char[] {'1','2','4','7',};
		String s=new String(c);
		System.out.println(s);//char 배열을 하나의 문자열로 만듬
		
		//String(StringBuffer buf)
		StringBuffer sb=new StringBuffer("hello");
		String ss=new String(sb);//StringBuffer를 새로운 문자열객체로 만듬
		System.out.println(ss);
		
		
		
		//char charAt(int index)
		String s1="hello";
		String s2="012345";
		char a=s1.charAt(0);//문자열 중에 첫번째 인덱스값 반환
		System.out.println(a);
		char a1=s2.charAt(5);
		System.out.println(a1);
	
		//int compareTo(String str) 같으면 0 , 작으면 -1, 크면 1
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
		boolean s6=s5.contains("ssd");//뒤에 문자열이 포함되있는지 확인
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
		
		
		//int indexof(int ch,int pos)// ch 문자를 해당위체에서 붙어 찾는다
		String ss1="helooooooooooooooasd";
		int id=ss1.indexOf("o", 1);//해당 위치에서부터 해당 글자가 있는 인덱스를 반환해주고 없으면 -1을 반환한다
		System.out.println(id);
		
		//int lastIndexof(int ch)// 지정된 인덱스를 오른쪽 끝에서 찾아줌
		String s11="java.lang.java";
		int id1=s11.lastIndexOf('.');
		int id2=s11.indexOf('.');
		System.out.println(id1);
		System.out.println(id2);
		//int lastIndexof(String str)
		int id11=s11.lastIndexOf("ava");//ava 문자가 시작하는 첫번쨰 a의 인덱스 위치를 반환한다
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
		String[] arr2=animals.split(",",3);//뒤에 있는 3은 해당 배열의 길이를 얘기하고 2까지 , 기준으로 나누고 나머지는 한개의 배열로 저장한다
		System.out.println(arr2.length);
		
		
		//boolean startswith(String prefix) 주어진 문자가 시작하는지
		System.out.println(s11.startsWith("java"));//처음부터 시작되는 값이어야 한다
		System.out.println(s11.startsWith("ava"));// false
		System.out.println(s11.startsWith("lang"));//그 이후 값은 false
		
		//String substring(int begin)
		//String substring(int begin, int end)
		String qwe="javaisdifficult";
		System.out.println(qwe.substring(3));
		System.out.println(qwe.substring(3,5));//3은 포함 5는 미포함
		
		
		//String toLowerCase()
		String qqwe="Hello";
		System.out.println(qqwe.toLowerCase());
		
		//String toString()
		System.out.println(qqwe.toString());
	
		//String toUpperCase()
		System.out.println(qqwe.toUpperCase());
	
		//String trim()
		String asdx="         hel       ll          word       ";
		System.out.println(asdx.trim());//양끝 공백제거, 중간공백은 제거되지 않는다.
		
		//String valueOf()// 지정된 값을 문자열로 변환
		java.util.Date dd=new java.util.Date();
		String aqs=String.valueOf(dd);
		System.out.println(aqs);
		//String valueOf(byte, Integer, char 등등 여러가지 기본형도 있지만 Object 매개변수도 있다)
		
		
	
	}	
}
