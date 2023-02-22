package JavalangPackage;

import java.util.Arrays;
import java.util.StringJoiner;

public class Ex2 {

	public static void main(String[] args) {
		Point3D p1=new Point3D(1,2,3);
		Point3D p2=new Point3D(1,2,3);
		
		System.out.println(p1);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}

}

class Point3D{
	int x,y,z;
	Point3D(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	Point3D() {
		this(0,0,0);
	}
	public boolean equals(Object obj) {
		if(obj instanceof Point3D) {
			Point3D p=(Point3D) obj;
			
			return (this.x==p.x) && (this.y==p.y) && (z==p.z);
		}
		return false;
	}
	
	/*
	 * public String toString() { StringJoiner sj=new StringJoiner(",", "[", "]");
	 * sj.add(String.valueOf(x)); sj.add(String.valueOf(y));
	 * sj.add(String.valueOf(z));
	 * 
	 * return sj.toString(); }
	 */
	
	/*
	 * public String toString() { return "["+x+","+y+","+z+"]"; }
	 */
	
	/*
	 * public String toString() { int[] a=new int[3]; a[0]=x; a[1]=y; a[2]=z;
	 * 
	 * return Arrays.toString(a); }
	 */
	
	/*
	 * public String toString() { return "["+String.join(",",
	 * String.valueOf(x),y+"",String.valueOf(z))+"]"; }
	 */	
	
	public String toString() {
		return String.join("","["+x+","+y+","+z+"]");
	}
	
	
}
