
public class Example {
	public static void main(String[] args) {

		int index = 10;

		System.out.println("-------------------------");
		for (int i = 1; i <= index; i++) {
			for (int j = index - i; j < index; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------");
		for (int i = 1; i <= index; i++) {
			for (int j = index - i; j > -1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------");
		for (int i = 1; i < index; i++) {
			for (int j = index; j > 0; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");

			}
			System.out.println();
		}
		System.out.println("-------------------------");
		for (int i = 1; i <= index; i++) {
			for (int j = index - i; j > -1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
