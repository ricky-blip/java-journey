package learn;

public class EnumApp {
	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.setName("Ricky");
		cust.setLevel(Level.VIP);

		System.out.println(cust.getName());
		System.out.println(cust.getLevel());
		System.out.println(cust.getLevel().getDescription());

		String levelName = Level.VIP.name();
		System.out.println(levelName);

		Level lvl = Level.valueOf("PREMIUM");
		System.out.println(lvl);

		Level[] levels = Level.values();
		for (var lev : levels) {
			System.out.print(lev);
		}

	}
}
