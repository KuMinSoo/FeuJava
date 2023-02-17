package OOP1;

public class Ex3 {

	static int[] shuffle(int[] original) {
		if(original==null||original.length==0) {
			return original;
		}
		
		
		for(int i=0;i<original.length;i++) {
			int n=(int) (Math.random()*original.length);
			int a=0;
			a=original[i];
			original[i]=original[n];
			original[n]=a;
		}
		return original;
	}
	
	
	public static void main(String[] args) {
		
		int[] original= new int[]{1,2,3,4,5,6,7,8,9,};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result=shuffle(original);
		System.out.println(java.util.Arrays.toString(original));
		
		

	}

}
