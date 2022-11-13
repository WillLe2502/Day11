package day11;

public class SquareInteger {
	public static void main(String args[]) {
		int a = 4;
		int b = 9;
		squares(a, b);

	}

	public static int squares(int a, int b) {
		double sqrtValue = 0;

		for (int i = a; i <= b; i++) {

			sqrtValue = Math.sqrt(i);

//			System.out.println(i);
//			System.out.println(sqrtValue);

			if (sqrtValue == (int) sqrtValue) {
				System.out.println(i);
			}
		}
		return 0;
	}
}
