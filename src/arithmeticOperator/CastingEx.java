package arithmeticOperator;

public class CastingEx {

	public static void main(String[] args) {
		// �ڵ��׺�ȯ ����
		
		Integer b='a'+'b';
		System.out.println(b);
		float f=111111111111L;//longŸ�� �ڵ��׺�ȯ float
		System.out.println(f);
		float d='A'+'b';
		System.out.println(d);
		float dd=4.1231f+1231.123f+1231231231233l+'a';
		System.out.println(dd);
		Float cc=1+1.0f;
		
		double b1=1.0f;
		//Double b2=1.0f;
		float a1=1;
		//Double b2=2+'A';
		
		
		Integer c1='a'+'b';
		
		double ddc1= 1.0f+'a';
		//Double ddc2= 1.0f+'a';// �ڵ��׺�ȯ �ȵ�... �� ���� �⺻Ÿ�԰� �׺�ȯ�̵ǳ� Ŭ���� Ÿ���� �׺�ȯ�� �ȵǱ� ������ ���� �׺�ȯ�� ���־���Ѵ�. �׷��� �⺻�� Ÿ���� ����ϴ� �����̴�. 
		Double ddc2= (double)1.0f+'a';
	// ����� �������� ���� ǥ�������� ���� ��� �ڵ��׺�ȯ�Ͽ� ����̵����� 
	// double�� �ƴ� Double�� ������ ������ ��� ��갪����� Double/double �����̰ų� �����׺�ȯ�� ���־���Ѵ�.
		
		System.out.println("=====��Ģ ������=====");
		int a=10;
		int c=4;
		System.out.printf("%f/ %f = %f",(float)a,(float)c,(float)a/c);
		//System.out.printf(%f,�ȿ� ���� �Ǽ��� ���־�ߵȴ�.. ���� �Ǽ��� �ƴϸ� ���� �߻�(���� ����ġ)
		
		byte ac=10;
		byte bc=20;
		//byte dsf=ac+bc;���� �߻�
		byte dsf=(byte)(ac+bc);//���� �߻�
		//�Ǵ�
		int asdfq=ac+bc;
	
	}

}
