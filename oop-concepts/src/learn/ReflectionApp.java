package learn;

import learn.util.ValidationUtil;

public class ReflectionApp {
	public static void main(String[] args) {
		CreateUserRequest request = new CreateUserRequest();
		request.setUsername("11");
		request.setPassword("11");

		ValidationUtil.validationReflection(request);
	}
}
