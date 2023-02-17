package OOP1;


class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name,int ban,int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}
	
	
	public String info() {
		int sum=kor+math+eng;
		float average= sum/3f;
		float average1=Math.round(sum/3f*10)/10.f;
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+average1;
	}

	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return Math.round(getTotal()/3f*10)/10f;
	}


}


public class Ex1 {
	
	static double getDistance(int x,int y, int x1,int y1) {
		double xx=Math.pow(x-x1,2);
		double yy=Math.pow(y-y1,2);
		return Math.sqrt(xx+yy);
	}
	
	public static void main(String[] args) {
		Student s=new Student("È«±æµ¿", 1, 1, 100, 60, 76);
		String str=s.info();
		System.out.println(str);
		System.out.println("ÀÌ¸§: "+s.name);
		System.out.println("ÃÑÁ¡: "+s.getTotal());
		System.out.println("Æò±Õ: "+s.getAverage());
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
