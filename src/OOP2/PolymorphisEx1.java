package OOP2;

class Product33{
	int price;
	int bonusPoint;
	
	Product33(int price){
		this.price=price;
		this.bonusPoint=(int)(price/10.0);
	}
	Product33(){}
}

class Tv4 extends Product33{
	
	Tv4(){super(100);}
	public String toString() {return "Tv";}
}

class Computer4 extends Product33{
	Computer4(){super(200);}
	public String toString() {return "Computer";}
	
}
class Audio2 extends Product33{
	Audio2(){super(50);}
	public String toString() {return "audio";}
}
class Buyer33{
	int money=1000;
	int bonusPoint=0;
	Product33[] cart=new Product33[10];
	int i=0;
	
	void buy(Product33 p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�... ���� �ܾ�:"+p.price);
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		cart[i++]=p;
		System.out.println(p+"�� �����߽��ϴ�..");
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) break;
			sum+=cart[i].price;
			itemList+=i==0?" "+cart[i]:" ,"+cart[i];
		}
	System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�..");
	System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�..");
	
	}
	
}
public class PolymorphisEx1 {

	public static void main(String[] args) {
		Buyer33 b=new Buyer33();
		b.buy(new Tv4());
		b.buy(new Audio2());
		b.buy(new Computer4());
		b.buy(new Computer4());
		b.buy(new Computer4());
		b.buy(new Computer4());
		b.buy(new Computer4());
		b.summary();

	}

}
