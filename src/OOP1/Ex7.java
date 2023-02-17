package OOP1;

public class Ex7 {

	public static int abs(int value) {
		return value=value>0?value:-value;
	}
	
	
	public static void main(String[] args) {

		int value=5;
		System.out.printf(" %d의 절대값은: %d%n",value,abs(value));

		value=-10;
		System.out.printf(" %d의 절대값은: %d%n",value,abs(value));
		
		
	}

}
