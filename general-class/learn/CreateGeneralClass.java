package learn;

public class CreateGeneralClass<T, U> {
	private T product;
	private U price;

	public CreateGeneralClass(T product, U price) {
		this.product = product;
		this.price = price;
	}

	public T getProduct() {
		return product;
	}

	public void setProduct(T product) {
		this.product = product;
	}

	public U getPrice() {
		return price;
	}

	public void setPrice(U price) {
		this.price = price;
	}
}
