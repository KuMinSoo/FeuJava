package OOP2;

public class PolymorphisOfParameter {

	public static void main(String[] args) {
		Computer c1=new Computer();
		Computer c2=new Computer();
		Tv2 t1=new Tv2(); 
		Tv2 t2=new Tv2(); 
		buyer buyer=new buyer();

		System.out.println("���� buyer�� �ܾ���:"+buyer.money);
		System.out.println("���� buyer�� ���ʽ���:"+buyer.bonusPoint);		
		
		buyer.buy(t1);System.out.println("tv ����");
		
		System.out.println("���� buyer�� �ܾ���:"+buyer.money);
		System.out.println("���� buyer�� ���ʽ���:"+buyer.bonusPoint);
		
		buyer.buy(c2);System.out.println("��ǻ�� ���� ");

		System.out.println("���� buyer�� �ܾ���:"+buyer.money);
		System.out.println("���� buyer�� ���ʽ���:"+buyer.bonusPoint);
		
		System.out.println("tv, computer ���� ");
		buyer.pbuy(t2);
		buyer.pbuy(c2);
		
		System.out.println("���� buyer�� �ܾ���:"+buyer.money);
		System.out.println("���� buyer�� ���ʽ���:"+buyer.bonusPoint);
	
	
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


