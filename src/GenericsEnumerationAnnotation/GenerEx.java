package GenericsEnumerationAnnotation;

class Apple extends Fruit{}
class Grape extends Fruit{}


class Box<T extends Fruit>{
	T item;
	
	void setItem(T item) {
		this.item=item;
	}
	
	T getItem() {
		return this.item;
	}
	
}

public class GenerEx {

	public static void main(String[] args) {
		Box<?> b= new Box();
		Box<? extends Object> c = new Box();
		Box<?> d=new Box<>();
		Box e=new Box<Fruit>();
		Box<Grape> f=new Box<>();
		Box<?>q=new Box<Apple>();
	}

}
