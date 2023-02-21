package JavalangPackage;

import java.util.Arrays;
import java.util.StringJoiner;

public class JoinStringJoin {

	public static void main(String[] args) {
		String animals="dog,cat,lion";
		String[]arrs=animals.split(",");
		System.out.println(Arrays.toString(arrs));
		
		String str=String.join("--", arrs);//배열 중간에 구분자를 넣어 하나의 문자열로 반환함.
		System.out.println(str);
	
		StringJoiner af=new StringJoiner(",","(",")");
		
		for(String s:arrs) {
			af.add(s);
		}
		System.out.println(af.toString());
		System.out.println(af);
		String as="asdf";
		StringJoiner sj=new StringJoiner(",","[[","]]");//(구분자, 접두사, 접미사)
		//sj.add()를하면 해당 요소를 갯수에 맞게 구분하여 "," 붙이고 접미사 접두사는 양쪽 끝으로 배열이 완성된다. 
		System.out.println(sj.add(as).toString());
		sj.add("asdfa1");
		sj.add("asdfa1");
		sj.add("asdfa1");
		System.out.println(sj.toString());
	
	}

}
