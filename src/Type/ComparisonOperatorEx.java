package Type;

public class ComparisonOperatorEx {

	public static void main(String[] args) {

		boolean b=true;
		char ch='C';
		
		System.out.println("b="+b);
		System.out.println("!b="+!b);
		System.out.println("!!b="+!!b);
		System.out.println("!!!b="+!!!b);
		
		System.out.printf("ch=%s%n",ch);
		System.out.printf("ch < 'a' || ch>'z=%b%n",ch<'a'||ch>'z');
		System.out.printf("!('a' <=ch && ch <='z')=%b%n",!('a' <=ch && ch <='z'));
		System.out.printf("('a' <=ch && ch <='z')=%b%n",('a' <=ch && ch <='z'));
		
		System.out.println("================");
		int x,y,z;
		int absX,absY,absZ;
		char signX,signY,signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX=x>0?x:-x;
		absY=y>0?y:-y;
		absZ=z>0?z:-z;
		
		signX=x>0?'+':(x==0?' ':'-');
		signY=y>0?'+':(y==0?' ':'-');
		signZ=z>0?'+':(z==0?' ':'-');
	
		System.out.printf("x=%c%d%n",signX,absX);
		System.out.printf("y=%c%d%n",signY,absY);
		System.out.printf("z=%c%d%n",signY,absZ);
		
		System.out.println("=======���� 1=======");
		int num=456;
		System.out.println(Math.round(num/100)*100);
		
		System.out.println("======���� 2======");
	
		int numOfApples=123;
		int sizeOfBucket=10;
		int numOfBucket=numOfApples%sizeOfBucket==0?numOfApples/sizeOfBucket:numOfApples/sizeOfBucket+1;
		System.out.println("�ʿ��� �ٱ��� ��: "+numOfBucket);
		
		System.out.println("======���� 3======");
		int num1=10;
		System.out.println(num1>0?"���":num1==0?0:"����");
		
		System.out.println("======���� 4=======");
		int fahrenheit=100;
		float celcius=Math.round((fahrenheit-32)*5/9.0*100)/100f;
		
		System.out.println("fahrenheit: "+fahrenheit);
		System.out.println("celcius: "+celcius);
	}
}


