package learn;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Avanza();
		System.out.println(car.getTire());
//		System.out.println(car.drive());
		car.drive();
	}

}
