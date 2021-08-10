package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//---------- CONSUMER ----------------
//		list.forEach(new PriceUpdate()); //Consumer: implementando pela interface da classe
//		list.forEach(Product::staticPriceUpdate); //Consumer: implementando pelo m�todo estatico da classe Product
//		list.forEach(Product::nonStaticPriceUpdate); //Consumer: implementando pelo m�todo n�o estatico da classe Product
//		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1); //Consumer: Express�o lambda declarada

		list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); //Consumer: Express�o lambda in line
		list.forEach(System.out::println);
		
		
		
		
	
// --------- PREDICATE ----------------		
/*
		list.removeIf(new ProductPredicate()); //Referecia a expressao lambda de uma classe
		list.removeIf(Product::staticProductPredicate); //Referencia a express�o lambda do m�todo est�tico de uma classe
		list.removeIf(Product::nonStaticProductPredicate); //Referencia a express�o lambda do m�todo n�o est�tico de uma classe

		Predicate<Product> pred = p -> p.getPrice() >= 100.0; //express�o lambda declarada
		list.removeIf(pred); //complemento da implementa��o da express�o lambda declarada

		list.removeIf(p -> p.getPrice() >= 100.0); //in line - express�o lambda completa declarada na mesma linha
		
		for (Product p : list) {
			System.out.println(p);

		}
*/
		
	}
}