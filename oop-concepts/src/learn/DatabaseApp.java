package learn;

import learn.error.DatabaseError;

public class DatabaseApp {
	public static void main(String[] args) {
		//tidak direkomdasikan memakai try catch
		connectDatabase("Ricky", null);
		System.out.println("Sukses");
	}

	public static void connectDatabase(String username, String password) {
		if (username == null || password == null) {
			throw new DatabaseError("Tidak bisa konek ke database");
		}
	}
}
