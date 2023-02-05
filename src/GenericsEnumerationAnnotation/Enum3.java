package GenericsEnumerationAnnotation;



enum Direction3{
	EAST(1,">"),SOUTH(2,"V"),WEST(3,"<"),NORTH(4,"^");
	
	private static final Direction3[] DIR_ARR=Direction3.values();
	private final int value;
	private final String symbol;
	Direction3(int value,String symbol){
		this.value=value;
		this.symbol=symbol;
	}
	public int getValue() {return this.value;}
	public String getSymbol() {return this.symbol;}
	
	public static Direction3 of(int dir) {
		if(dir < 1|| dir > 4) throw new IllegalArgumentException("Invali value: "+dir);
			
		return DIR_ARR[dir-1];	
	}
	
	public Direction3 rotate(int num) {
		num%=4;
		
		if(num<0) num+=4;
		
		return DIR_ARR[((value)-1+num)%4];
	}
	
	
	public String toString() {
		return name()+" ,value: "+getValue()+" ,symbol: "+getSymbol();
	}
	
	
}




public class Enum3 {

	public static void main(String[] args) {
		for(Direction3 dir: Direction3.values()) {
			//System.out.println(dir.toString());
			System.out.printf("d1=%s, %d%n", dir.name(), dir.getValue());
		}
		
		Direction3 d1=Direction3.EAST;
		Direction3 d2=Direction3.valueOf("EAST");
		Direction3 d3=Enum.valueOf(Direction3.class, "EAST");
		System.out.println("=========================");
		System.out.println("d1==d2 ? "+(d1==d2));
		System.out.println("d1==d3 ? "+(d1==d3));
		System.out.println("d2.equals(d3)"+d2.equals(d3));
		System.out.println("d1.equals(d3)"+d1.equals(d3));
		System.out.println("d1.compareTo(d2)"+(d1.compareTo(d3)==0?true:(d1.compareTo(d3)>0?"양수":"음수")));
		System.out.println("d1.compareTo(d2)"+(d2.compareTo(d3)==0?true:(d2.compareTo(d3)>0?"양수":"음수")));
		System.out.println("d1.compareTo(d2)"+(d3.compareTo(d1)==0?true:(d3.compareTo(d1)>0?"양수":"음수")));
		
		System.out.println("##########################");
		Direction3 a1=Direction3.of(1);
		Direction3 a2=Enum.valueOf(Direction3.class, "EAST");
		
		System.out.printf("%10s=%d\n",a1.name(),a1.getValue());
		System.out.printf("%10s=%d%n",a2.name(),a2.getValue());
		System.out.println(Direction3.EAST.rotate(3));
		System.out.println(Direction3.EAST.rotate(-1));
		System.out.println(Direction3.EAST.rotate(1));
		System.out.println(Direction3.EAST.rotate(2));
		System.out.println(Direction3.EAST.rotate(10));
		System.out.println(Direction3.EAST.rotate(-10));
		
	}

}
