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
		//super(); ���� �ڽ��� ������ ������ �ڵ����� �θ��� �⺻������ super()�� ������ �����Ѵ�. �׷��� ����Ŭ�������� �⺻�����ڰ� ������ ������ ������ ���� 
		//�Ƹ� ����Ŭ�����̱� ������ �⺻���� ���� �������� �ɼ��� �ǹ������� ������ �ִ� �� ����.(super())
	}
	Tv11(String a){
		//super();(����Ŭ���� �⺻ ������ ����)
		//super(100);
		//super �ߺ��ȵ� �ۼ� �ȵ�
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
