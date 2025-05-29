package learn;

public class CompanyApp {
	public static void main(String[] args) {
		Company company = new Company();
		company.setName("Ricky Zaman Now");

		Company.Employee employee = company.new Employee();
		employee.setName("Ricky");

		System.out.println(employee.getName());
		System.out.println(employee.getCompany());
	}
}
