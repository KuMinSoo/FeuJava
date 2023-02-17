package OOP1;

public class Ex6 {

	public static void main(String[] args) {

		int[]data= {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪: "+max(data));
		System.out.println("�ִ밪: "+max(null));
		System.out.println("�ִ밪: "+max(new int[] {}));
		
		
	}

	private static int max(int[] data) {

		if(data==null||data.length==0) return -999999; 
		
		int max=0;
		
		for(int i=0;i<data.length;i++) {
			if(data[i]>max) {
				max=data[i];
			}
		}
		return max;
	}

}
