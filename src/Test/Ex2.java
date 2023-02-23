package Test;

public class Ex2 {

	public static void main(String[] args) {
		int cnt=0;
		int cnt2=0;
		for (int i = 0; i < 7; i++) {
		
			for (int j = 0; j < 7; j++) {
				if(i<=3) {
					if(i+j>=3 && i+j<=3+cnt) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				if(i>3) {
					if(5+cnt2<=i+j&& i+j<=9) {
						System.out.print("*");
					}else {
						System.out.print(" ");	
					}
					
				}
			}
			System.out.println();
			if(i<=3) cnt+=2;
			if(i>3) cnt2+=2;
		}
		
		
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i + j >= 3 && i + j <= 9 && Math.abs(i - j) <= 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        int counttt=0;
        
        while(counttt<7) {
        	int tt=0;
        	while(tt<7) {
        		if(counttt + tt>=3 && tt+counttt<=9 && Math.abs(counttt-tt)<=3) {
        			System.out.print("*");
        		}else {
        			System.out.print(" ");
        		}
        		tt++;
        	}
        	System.out.println();
        	counttt++;
        }
		
	}
}
