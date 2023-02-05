package GenericsEnumerationAnnotation;

import java.util.ArrayList;

class Product{}
class Tv extends Product {}
class Audio extends Product{}

public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product> productList=new ArrayList<Product>();
		ArrayList<Tv> TvList=new ArrayList<Tv>();
		
		productList.add(new Tv());
		productList.add(new Audio());
		
		TvList.add(new Tv());
		TvList.add(new Tv());
		
		PrintAll(productList);
			

	}

	public static void PrintAll(ArrayList<Product> list) {
		for(Product pro : list) {
			System.out.println(pro);
		}
	}
}
