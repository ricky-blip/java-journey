package learn;

public class ProductApp {
	public static void main(String[] args) {
		Product prod = new Product("Mac ", 50_000_000);
		System.out.println(prod.name);
		System.out.println(prod.price);

		System.out.println(prod);

		Product prod2 = new Product("Mac ", 50_000_000);

		System.out.println(prod.equals(prod2));
		System.out.println(prod.hashCode() == prod2.hashCode());

	}
}
