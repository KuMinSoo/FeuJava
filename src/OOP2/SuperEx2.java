package OOP2;

public class SuperEx2 {

	public static void main(String[] args) {

		Point3D pd=new Point3D(1, 2, 333);
		System.out.printf("x=%d , y=%d , z=%d", pd.x, pd.y, pd.z);
		
	}

}
class Point{
	int x,y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
}