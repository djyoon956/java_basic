import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10817 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numStrings = br.readLine().split(" ");
		int[] numbers = new int[3];

		for (int i = 0; i < numStrings.length; i++)
			numbers[i] = Integer.parseInt(numStrings[i]);

		int result = 0;
		int target = 0;
		if (numbers[0] > numbers[1]) {
			target = numbers[1] > numbers[2] ? numbers[1] : numbers[2];
			result = numbers[0] > target ? target : numbers[0];
		} else {
			target = numbers[0] > numbers[2] ? numbers[0] : numbers[2];
			result = numbers[1] > target ? target : numbers[1];
		}

		System.out.println(result);
	}
}
