package GenericsEnumerationAnnotation;

import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}

class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy{public String toString() {return "Toy";}}
class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
	ArrayList<T> list=new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}

interface Eatable{}

public class Ex12_3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox=new FruitBox<>();
		FruitBox<Apple> appleBox=new FruitBox<Apple>();
		FruitBox<Grape> grapeBox=new FruitBox<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Grape());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());

		grapeBox.add(new Grape());
		grapeBox.add(new Grape());
		
		System.out.println("FruitBox: "+fruitBox.toString());
		System.out.println("appleBox: "+appleBox);
		System.out.println("grapeBox: "+grapeBox);
	}

}
