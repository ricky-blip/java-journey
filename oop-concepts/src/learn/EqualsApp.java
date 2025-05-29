package learn;

public class EqualsApp {
	public static void main(String[] args) {
		String first = "Eko";
		first = first + " " + "SSSS";

		System.out.println(first);

		String second = "Eko SSSS";
		System.out.println(second);

		System.out.println(first == second); //tidak bisa membandingkan seperti ini, cuma banding object
		System.out.println(first.equals(second)); //ini bisa
		
		String third = "Eko SSSS";
		System.out.println(second == third); //bisa, dikarenakan lgsg membandingkan untuk optimize memory
		System.out.println(second.equals(third)); //ini bisa
	}
}
