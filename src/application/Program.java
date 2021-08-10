package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//---------- PERSONALIZADO ----------------
		
		ProductService ps = new ProductService();
		double sum = ps.filterredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
//---------- FUNCTION ----------------
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); //Function: implementando pela interface - classe
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); //Function: implementando pelo m�todo est�tico
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); //Function: implementando pelo m�todo n�o est�tico
/*
		Function<Product, String> func = p -> p.getName().toUpperCase(); //Function: declarada
		List<String> names = list.stream().map(func).collect(Collectors.toList()); //Function: declarada (continua��o)
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); //Function: Inline
		
		names.forEach(System.out::println);
*/
//---------- CONSUMER ----------------
/*
//		list.forEach(new PriceUpdate()); //Consumer: implementando pela interface da classe
//		list.forEach(Product::staticPriceUpdate); //Consumer: implementando pelo m�todo estatico da classe Product
//		list.forEach(Product::nonStaticPriceUpdate); //Consumer: implementando pelo m�todo n�o estatico da classe Product
//		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1); //Consumer: Express�o lambda declarada

		list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); //Consumer: Express�o lambda in line
		list.forEach(System.out::println);
*/		
	
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