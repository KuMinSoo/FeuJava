package OOP2;

class Productt{
	int price;
	int bonusPoint;
	Productt(){
		price=11;
	}
	Productt(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}
class Tv11 extends Productt{
	Tv11(){
		//super(); 생략 자식은 생성자 생성시 자동으로 부모의 기본생성자 super()을 가지고 생성한다. 그래서 조상클래스에서 기본생성자가 없으면 컴파일 에러가 난다 
		//아마 조상클래스이기 때문에 기본적인 조상 생성자의 옵션을 의무적으로 가지고 있는 거 같다.(super())
	}
	Tv11(String a){
		//super();(조상클래스 기본 생서자 생략)
		//super(100);
		//super 중복안됨 작성 안됨
		a="";
	}
	public String toString() {
		return "Tv";
	}
}



public class Ex2 {

	public static void main(String[] args) {

		Tv t=new Tv();
		
		

	}

}
