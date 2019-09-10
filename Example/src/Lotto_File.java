import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Lotto {

	public void start() {

	}

	private Set<Integer> getLottoNumber() {
		Set<Integer> numbers = new TreeSet<Integer>();
		for (int i = 0; numbers.size() < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			numbers.add(random);
		}

		return numbers;
	}

	private void saveLotteFile() {
		String path = "Lotto.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			writer.write("로또");
			writer.newLine();
			// writer.write(numbers.toString());
			writer.newLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

// 로또 번호 저장
public class Lotto_File {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.start();
	}
}
