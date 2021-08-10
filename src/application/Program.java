package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		list.removeIf(new ProductPredicate()); //Referecia a expressao lambda de uma classe
//		list.removeIf(Product::staticProductPredicate); //Referencia a express�o lambda do m�todo est�tico de uma classe
		list.removeIf(Product::nonStaticProductPredicate); //Referencia a express�o lambda do m�todo n�o est�tico de uma classe
		
		for (Product p : list) {
			System.out.println(p);
		}

	}
}