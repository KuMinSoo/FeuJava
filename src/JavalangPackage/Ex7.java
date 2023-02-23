package JavalangPackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {

	public static void main(String[] args) {
		String str="abc123def456";
		Pattern pattern= Pattern.compile("\\d+");
		Matcher matcher=pattern.matcher(str);
		String result="";
		
		while(matcher.find()) {
			result+=matcher.group();
			
		}
	System.out.println(result);	

	
	
	
	
	
	
	
	
	
	}

	
	
}
