package JavalangPackage;

import java.util.Arrays;
import java.util.StringJoiner;

public class JoinStringJoin2 {

	public static void main(String[] args) {

		String animals="dog,cat,lion";
		String[] arr=animals.split(",");
		System.out.println(Arrays.toString(arr));
		
		String asd=String.join("-", arr);
		System.out.println(asd);
		
		StringJoiner sj=new StringJoiner("/","[","]");
		
		for(String s: arr) {
			sj.add(s);
		}
		System.out.println(sj);
	}

}
