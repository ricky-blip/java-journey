package learn;

import learn.util.MathUtil;

public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Constant.APPLICATION);
		System.out.println(Constant.VERSION);

		System.out.println(MathUtil.sum(1, 2, 3));

		Country.City city = new Country.City();
		city.setName("Pal");

		System.out.println(city.getName());

		System.out.println(Application.PROCESSORS);
	}
}
