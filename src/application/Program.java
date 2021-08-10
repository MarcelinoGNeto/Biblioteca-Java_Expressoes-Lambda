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
//		list.removeIf(Product::staticProductPredicate); //Referencia a expressão lambda do método estático de uma classe
		list.removeIf(Product::nonStaticProductPredicate); //Referencia a expressão lambda do método não estático de uma classe
		
		for (Product p : list) {
			System.out.println(p);
		}

	}
}