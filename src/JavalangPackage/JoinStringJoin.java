package JavalangPackage;

import java.util.Arrays;
import java.util.StringJoiner;

public class JoinStringJoin {

	public static void main(String[] args) {
		String animals="dog,cat,lion";
		String[]arrs=animals.split(",");
		System.out.println(Arrays.toString(arrs));
		
		String str=String.join("--", arrs);//�迭 �߰��� �����ڸ� �־� �ϳ��� ���ڿ��� ��ȯ��.
		System.out.println(str);
	
		StringJoiner af=new StringJoiner(",","(",")");
		
		for(String s:arrs) {
			af.add(s);
		}
		System.out.println(af.toString());
		System.out.println(af);
		String as="asdf";
		StringJoiner sj=new StringJoiner(",","[[","]]");//(������, ���λ�, ���̻�)
		//sj.add()���ϸ� �ش� ��Ҹ� ������ �°� �����Ͽ� "," ���̰� ���̻� ���λ�� ���� ������ �迭�� �ϼ��ȴ�. 
		System.out.println(sj.add(as).toString());
		sj.add("asdfa1");
		sj.add("asdfa1");
		sj.add("asdfa1");
		System.out.println(sj.toString());
	
	}

}
