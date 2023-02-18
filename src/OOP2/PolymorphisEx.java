package OOP2;

public class PolymorphisEx {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		
		Tv1 tv=new Tv1();
		Computer1 c=new Computer1();
		
		b.buy(tv);
		b.buy(c);	
	}
}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10);
	}
}

class Tv1 extends Product{
	Tv1(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer1 extends Product{
	
	Computer1(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money=1000;
	int bonusPoint=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�.....���� �ܾ�:"+money);
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"�� �����߽��ϴ�");
		System.out.println(p.toString()+"�� �����߽��ϴ�");
		System.out.printf("���� �ܾ�: %d%n",money);
		System.out.printf("���� ���ʽ�: %d%n",bonusPoint);
	}
}




