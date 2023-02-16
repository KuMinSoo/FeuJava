package Array;

public class TwoDimensionArray2 {

	public static void main(String[] args) {
		
		int[][] score= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		System.out.printf("%3s %3s %3s %3s %3s %3s%n ","¹øÈ£","±¹¾î","¿µ¾î", "¼öÇÐ", "ÃÑÁ¡", "Æò±Õ");
		System.out.println("============================");
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum=0;
			System.out.printf("%3d",i+1);
			for(int k=0;k<score[i].length;k++) {
				System.out.printf("%5d",score[i][k]);
				sum+=score[i][k];
			}

			System.out.printf("%5d",sum);
			System.out.println("  "+(double)(sum/score[i].length));
			
		}
		System.out.println("============================");
		

		System.out.print("ÃÑÁ¡:");
		for(int i=0;i<3;i++) {
			sum=0;
			for(int f=0;f<score.length;f++) {
				sum+=score[f][i];	
			
			}
			System.out.printf("%5d",sum);
		}
		
		
		
		
		
		
		
		
	}

}
