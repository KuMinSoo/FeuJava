package arithmeticOperator;

public class MathRoundEx {

	public static void main(String[] args) {
		double pi=3.141592;
		long spi=Math.round(pi*1000);
		double shortPi=Math.round(pi*1000)/1000;
		System.out.println("pi: "+pi);
		System.out.println("spi: "+spi);
		System.out.println("shortPi:  "+shortPi);
		
	}

}
