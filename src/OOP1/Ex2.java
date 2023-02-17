package OOP1;

class MyPoint{
	int x;
	int y;

	MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	double getDistance(int x, int y) {
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));	
				
		
	}
	
	
}


public class Ex2 {

	public static void main(String[] args) {
		MyPoint p=new MyPoint(1,1);
		
		System.out.println(p.getDistance(2, 2));
		
	}

}
