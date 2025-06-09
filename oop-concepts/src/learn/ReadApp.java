package learn;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
	public static void main(String[] args) {
		//--------------Ini tanpa Try with Resource
//		BufferedReader reader = null;
		//		try {
		//			reader = new BufferedReader(new FileReader("README.md"));
		//			while (true) {
		//				String text = reader.readLine();
		//				if (text == null) {
		//					break;
		//				}
		//				System.out.println(text);
		//			}
		//		} catch (Throwable throwable) {
		//			System.out.println("Error membaca file " + throwable.getMessage());
		//		} finally {
		//			if (reader != null) {
		//				try {
		//					reader.close();
		//					System.out.println("Sukses menutup");
		//				} catch (IOException exception) {
		//					System.out.println("Error menuturp resource " + exception.getMessage());
		//				}
		//			}
		//		}

		//--------------ini memakai Try with Resource
		try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

			while (true) {
				String text = reader.readLine();
				if (text == null) {
					break;
				}
				System.out.println(text);
			}
		} catch (Throwable throwable) {
			System.out.println("Error membaca file " + throwable.getMessage());
		}
	}
}
