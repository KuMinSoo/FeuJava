package IfWhileSwitch;

public class LoopName {

	public static void main(String[] args) {

		Loop1 :for(int i=2;i<7;i++) {
			for(int j=1;j<10;j++) {
				if(j==5) 
					//break Loop1;
					//continue Loop1;
					//	break;
					continue;
				System.out.printf("%d * %d =%d%n",i,j,i*j);

			
			}
		}
		
	}

}
