package learn;

public class Bus implements Car {
	public void drive() {
		System.out.println("Bus Drive");
	}

	public int getTire() {
		return 8;
	}

	public String getBrand() {
		return "HINO";
	}

	public boolean isMaintenance() {
		return false;
	}

	public boolean isBig() {
		return true;
	}
}
