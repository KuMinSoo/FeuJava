package Type;

public class TypeEx1 {

	public static void main(String[] args) {

		//������ ��� ���ʿ��� ���������� ����.
		//���� ���� ""���̸� ���ڿ��� �ȴ�.
		System.out.println(7+7+"");//14���ڿ�
		System.out.println(""+7+7);//77���ڿ� 
		System.out.println(String.valueOf(7+7));
		System.out.println(String.valueOf(7+7).getClass().getName());
		
		System.out.println("======�� ������ �� �ٲٱ�======");
		//�� ������ �� �ٲٱ�
		int x=10, y=5, tmp=0;
		System.out.println("x="+10);
		System.out.println("y="+5);
		
		tmp=x;//�ӽ÷� x���� tmp�� �����
		x=y;//y���� x�� �ֱ�
		y=tmp;//y�� tmp(x��) �ֱ�
		System.out.println("���� ��");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println(true+"");
		System.out.println(new String(true+"").getClass().getName());
		System.out.println('A'+'B');
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+"ava");
		
		System.out.println("===�������� 2===");
		x=1;
		y=2;
		int z=3;
		tmp=0;
		
		tmp=x;
		
		x=y;
		y=z;
		z=tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
	}

}
