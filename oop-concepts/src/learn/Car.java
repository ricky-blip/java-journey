package learn;

public interface Car extends HasBrand, IsMaintenance {
	//public abstract void drive(); //syntax nya harusnya seperti dikarenakan pakai interface tdk perlu
	void drive();

	int getTire();

	default boolean isBig() {
		return false;
	}
}

