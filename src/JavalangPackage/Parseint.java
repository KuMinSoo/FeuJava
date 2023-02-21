package JavalangPackage;

public class Parseint {

	public static void main(String[] args) {
		String dd="+"+"12312.0";
		System.out.println(Double.parseDouble(dd.trim()));
		String dd1="-"+"12312.0";
		System.out.println(Double.parseDouble(dd1.trim()));
		
		
		int iVal=100;
		String strVal=String.valueOf(iVal);
		
		double dVal=200.0;
		String strVal2=dVal+"";
		
		double sum=Integer.parseInt(strVal.trim())+Double.parseDouble(strVal2.trim());
		double sum2=Integer.valueOf("+"+iVal)+Double.valueOf(strVal2.trim());
		
		System.out.println(String.join("",strVal,"+",strVal2,"=",sum+""));
		System.out.println(String.join("",strVal,"+",strVal2,"=",String.valueOf(sum)));
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		
		String fl="10.123f";
		System.out.println(Float.valueOf(fl.trim()));
		System.out.println(Float.parseFloat(fl.trim()));
		//System.out.println(Integer.parseInt(fl));//오류 발생 형식에 맞지 않음
		
		String qwe=String.join("", "1","2","12aaccc512abc4").toString();
		System.out.println(Long.parseLong(qwe,16));
		
		
	}

}
