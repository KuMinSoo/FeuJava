package OOP2;

public class PolymorphisOfParameter {

	public static void main(String[] args) {
		Computer c1=new Computer();
		Computer c2=new Computer();
		Tv2 t1=new Tv2(); 
		Tv2 t2=new Tv2(); 
		buyer buyer=new buyer();

		System.out.println("현재 buyer의 잔액은:"+buyer.money);
		System.out.println("현재 buyer의 보너스는:"+buyer.bonusPoint);		
		
		buyer.buy(t1);System.out.println("tv 구매");
		
		System.out.println("현재 buyer의 잔액은:"+buyer.money);
		System.out.println("현재 buyer의 보너스는:"+buyer.bonusPoint);
		
		buyer.buy(c2);System.out.println("컴퓨터 구매 ");

		System.out.println("현재 buyer의 잔액은:"+buyer.money);
		System.out.println("현재 buyer의 보너스는:"+buyer.bonusPoint);
		
		System.out.println("tv, computer 구매 ");
		buyer.pbuy(t2);
		buyer.pbuy(c2);
		
		System.out.println("현재 buyer의 잔액은:"+buyer.money);
		System.out.println("현재 buyer의 보너스는:"+buyer.bonusPoint);
	
	
	}

}
class Product11{
	int price;
	int bonusPoint;
}

class Tv2 extends Product11{
	
	Tv2(){
		price=100;
		bonusPoint=10;
	}
	
}

class Computer extends Product11{
	
	Computer(){
		price=300;
		bonusPoint=20;
	}
	
}

class buyer{
	int money;
	int bonusPoint;
	
	buyer(){
		money=1000;
		bonusPoint=100;
	}
	void buy(Tv2 t) {
		money-=t.price;
		bonusPoint+=t.bonusPoint;
	}
	void buy(Computer c) {
		money-=c.price;
		bonusPoint+=c.bonusPoint;
	}
	void pbuy(Product11 p) {
		money-=p.price;
		bonusPoint-=p.bonusPoint;
	}
	
	
}


