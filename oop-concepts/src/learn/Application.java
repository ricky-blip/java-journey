package learn;

public class Application {
	public static final int PROCESSORS;

	//static diakses duluan
	static {
		System.out.println("Mengakses class Application");
		PROCESSORS = Runtime.getRuntime().availableProcessors();
	}
}
