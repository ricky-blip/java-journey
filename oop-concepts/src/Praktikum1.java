import java.util.Scanner;

/*RR_praktikum_1_JF
Ouput dari input Tid4k $@ma adalah 268
*/
public class Praktikum1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan Kata : ");
		String input = scanner.nextLine();

		int totalAscii = 0;
		int lowerCaseAscii = 0;

		for (char i : input.toCharArray()) {
			totalAscii += (int) i; //loop semua inputan
			if (Character.isLowerCase(i)) { //ambil data lowercase
				lowerCaseAscii += (int) i;
			}
		}

		System.out.println("Hasil : " + (totalAscii - lowerCaseAscii));
	}
}