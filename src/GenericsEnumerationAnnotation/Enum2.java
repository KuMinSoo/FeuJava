package GenericsEnumerationAnnotation;

enum Direction2{
	
	EAST(1),WEST(33),SOUTH(1),NORTH(5);
	
	private final int value;
	Direction2(int value){
		this.value=value;
	}
	
	public int getValue() {
		return this.value;
	}
	
}

public class Enum2 {
	
	public static void main(String[] args) {
		Direction2 d1=Direction2.EAST;
		Direction2 d2=Direction2.WEST;
		Direction2 d3=Direction2.SOUTH;
		Direction2 d4=Direction2.NORTH;
		
		Direction2 a1=Direction2.valueOf("EAST");
		Direction2 a2=Direction2.valueOf(Direction2.class, "SOUTH");
		Direction2 a3=Enum.valueOf(Direction2.class, "NORTH");
		//�������� ��ü�� ���� ������ ���¸� ���Ѵ�.. �� ��ü�� ���� ������ �� �� ������ �� ��ü�� ������ �ִ� ���� ���ٰ�
		//�Ȱ��� �񱳵� �� ����.. �񱳴� �������� ������� ���� �� �ִ�.
		//d1��d3�� ������ value�� ������ ���Ҷ��µ� value���� ���õǰ� ��ü�� ������� �� �ȴ�.
		//�ٽ� �ѹ� �����ϸ� �������� ��ü�� ���� ������ ���¸� ������ �ְ� ���� ���ٰ� �翬�� ���� �ʴ�. �׷��� ��ϵ� ������� �� �� �� ���� . // 0, 1, 2, ,3
		System.out.println("d1=  "+toString(d1));
		System.out.println("d2=  "+toString(d2));
		System.out.println("d3=  "+toString(d3));
		System.out.println("d4=  "+toString(d4));
		
		System.out.println("d1==d3? "+(d1==d3));
		System.out.println("d1.equals(d3) :"+d1.equals(d3));
		System.out.println("d1.compareTo(d3) :"+d1.compareTo(d3));
		
		System.out.println("d1==a1? "+(d1==a1));
		System.out.println("d3.equals(a2)?"+d3.equals(a2));
		System.out.println("d4.compareTO(a3)? "+d4.compareTo(a3));
		
	}
	
	public static String toString(Direction2 d) {
		
		return "name: "+d+"/ value: "+d.getValue();
	}

}
