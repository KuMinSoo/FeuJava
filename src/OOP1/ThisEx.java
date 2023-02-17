package OOP1;

class car{
	String color;
	String gearType;
	int door;
	int capacity;
	
	car(){
		this("black","auto",4);
	}
	car(String color){
		this(color,"auto",4);
	}
	car(String color, String gearType){
		this.color=color;
		this.gearType=gearType;
	}
	car(int door){
		this("pint","none",door,10);
	}	
	car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	car(String color, String gearType, int door,int capacity){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
		this.capacity=capacity;
	}
	public String toString() {
		return "color: "+color+" / gearType: "+gearType+" / door: "+door+" / capacity: "+capacity;
	}
}
public class ThisEx {
	public static void main(String[] args) {
		car c1=new car();
		System.out.println(c1);
		car c2=new car("yellow");
		System.out.println(c2);
		car c3=new car("blue","manual");
		System.out.println(c3);
		car c4=new car(100);
		System.out.println(c4);
	}

}
