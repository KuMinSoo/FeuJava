package Array;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {

		int[]arr= {0,1,2,3,4};
		int[][]arr2= {{11,22},{21,22}};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
		System.out.println(Arrays.equals(arr, arr));
		
		String[][]str2D=new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][]str2D2={{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.equals(str2D,str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arr3=new int[] {0,1,2,3,4,5};
		int[] arr4=Arrays.copyOf(arr3, arr3.length);
		System.out.println(Arrays.toString(arr3));
		int[] arr5=Arrays.copyOf(arr3, 3);
		System.out.println(Arrays.toString(arr5));
		int[] arr6=Arrays.copyOf(arr3, 9);
		System.out.println(Arrays.toString(arr6));
		int[] arr7=Arrays.copyOfRange(arr3, 2, 5);
		System.out.println(Arrays.toString(arr7));
		
		int [] arr33= {3,2,4,5,1};
		System.out.println(Arrays.toString(arr33));
		Arrays.sort(arr33);
		System.out.println(Arrays.toString(arr33));
		
		//������... !! new int[����][][] �ش� ������ŭ �� ��ü ����
		int []arsfr[][]=new int[5][][];
		
		//������ �ǵڿ� �޸� �־ ��.
		int [] asf12= {1,2,3,3,};
			
		
	}

}
