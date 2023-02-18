package OOP2;

public class AbstractClass {

	public static void main(String[] args) {
		Unit[] group= {new Marine(),new Tank(), new DropShip()};
		int i=0;
		for(Unit a: group) {
			a.move(100, 200);
		}

	}

}
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {};
}
class Marine extends Unit{

	@Override
	void move(int x, int y) {
		System.out.printf("Marine[x=%d , y=%d]%n",x,y);
	}
	void stimPack() {}
	
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("Tank[x="+x+", y="+y+"]");
	}
	void changeMode() {
		
	}
	
}

class DropShip extends Unit{
	
	@Override
	void move(int y, int yy) {
		System.out.println("DropShip[x="+y+"y="+yy+"]");
	}
	void load() {}
	void unload() {}
	
}