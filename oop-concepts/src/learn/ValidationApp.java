package learn;

import learn.error.ValidationException;
import learn.util.ValidationUtil;

public class ValidationApp {
	public static void main(String[] args) {
//		LoginRequest loginRequest = new LoginRequest(null, null);
		LoginRequest loginRequest = new LoginRequest("R", "Pass");

		try {
			ValidationUtil.validate(loginRequest);
			System.out.println("Data Valid!!!");
		} catch (ValidationException e) {
			System.out.println("ValidationException!!!");
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException!!!");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error atau tidak, tetap dipanggil");
		}

		//Runtime
		LoginRequest loginRequest2 = new LoginRequest(null, null);
		ValidationUtil.validateRuntime(loginRequest2);
		System.out.println("Success");
	}
}
