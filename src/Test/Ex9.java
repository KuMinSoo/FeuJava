package Test;

public class Ex9 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
		System.out.println();
		int i=0;
		while(i<arr.length) {
			System.out.print(arr[i++]+" ");
		}
	
		int[][] arr1 = {{1, 2}, {3, 4}, {5, 6}};
		System.out.println();
		for(i=0;i<arr1.length;i++) {
			for(int k=0;k<arr1[i].length;k++) {
				System.out.print(arr1[i][k]+" ");
			}
		}
		
		
	}

}
