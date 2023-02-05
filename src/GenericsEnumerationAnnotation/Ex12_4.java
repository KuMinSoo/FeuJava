package GenericsEnumerationAnnotation;

import java.util.ArrayList;

class Fruit2 {
	public String toString() {
		return "Fruit";
	}
}

class Apple2 extends Fruit2 {
	public String toString() {
		return "Apple";
	}
}

class Grapes extends Fruit2 {
	public String toString() {
		return "Grape";
	}
}

class Juice {
	String name;

	Juice(String name) {
		this.name = name + "Jucie";
	}

	public String toString() {
		return name;
	}
}

class FruitBox2<T extends Fruit2> extends Box2<T> {
}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
		for (Fruit2 fru : box.getList()) {
			tmp += fru.toString()+" ";
		}
		return new Juice(tmp);
	}
}

public class Ex12_4 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox=new FruitBox2<>();
		FruitBox2<Apple2> appleBox=new FruitBox2<>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grapes());
		
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		
	}

}
