package learn;

public class RecordApp {
	public static void main(String[] args) {
		LoginRequest loginRequest = new LoginRequest("Ricky", "123");
		System.out.println(loginRequest.username());
		System.out.println(loginRequest.password());
		System.out.println(loginRequest);

		System.out.println(new LoginRequest());
		System.out.println(new LoginRequest("user saja"));
		System.out.println(new LoginRequest("pakai", "2"));
	}
}
