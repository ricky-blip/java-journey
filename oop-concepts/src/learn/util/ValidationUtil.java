package learn.util;

import learn.LoginRequest;
import learn.error.BlankException;
import learn.error.ValidationException;

public class ValidationUtil {
	public static void validate(LoginRequest loginRequest) throws ValidationException {
		if (loginRequest.username() == null) {
			throw new NullPointerException("Username is null");
		} else if (loginRequest.username().isBlank()) {
			throw new ValidationException("Username is blank");
		} else if (loginRequest.password() == null) {
			throw new NullPointerException("Password is null");
		} else if (loginRequest.password().isBlank()) {
			throw new ValidationException("Password is blank");
		}
	}

	public static void validateRuntime(LoginRequest loginRequest) {
		if (loginRequest.username() == null) {
			throw new NullPointerException("Username is null");
		} else if (loginRequest.username().isBlank()) {
			throw new BlankException("Username is blank");
		} else if (loginRequest.password() == null) {
			throw new NullPointerException("Password is null");
		} else if (loginRequest.password().isBlank()) {
			throw new BlankException("Password is blank");
		}
	}
}
