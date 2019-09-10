import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class CustomDateFormat {

	public static String date() {
		return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
	}

	public static String time() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
}

class Lotto {

	public void start() {
		int count = inputCount();
		List<Set<Integer>> lottos = getLottoNumber(count);
		String output = printLotto(lottos);
		saveLotteFile(output);
	}

	private int inputCount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("로또 출력 횟수를 입력 하세요. (1회부터 최대 5회까지 가능)");
		int inputNumber = 0;
		while (true) {
			System.out.print(">> ");
			if (scanner.hasNextInt()) {
				inputNumber = scanner.nextInt();
				if (inputNumber > 0 && inputNumber < 6)
					break;
			} else
				scanner.next();
		}

		return inputNumber;
	}

	private List<Set<Integer>> getLottoNumber(int count) {
		List<Set<Integer>> lottos = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Set<Integer> numbers = new TreeSet<Integer>();
			while (numbers.size() < 6) {
				int random = (int) (Math.random() * 45) + 1;
				numbers.add(random);
			}

			lottos.add(numbers);
		}

		return lottos;
	}

	private void saveLotteFile(String output) {
		String path = "Lotto.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
			writer.write("발행일 : " + CustomDateFormat.date() + " " + CustomDateFormat.time());
			writer.newLine();
			writer.write(output);
			writer.newLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private String printLotto(List<Set<Integer>> lottos) {
		String lottoString = "";
		for (int i = 0; i < lottos.size(); i++) {
			String output = (char) (65 + i) + " 자동 ";
			lottoString += output;
			Iterator<Integer> iterator = lottos.get(i).iterator();
			System.out.print(output);
			while (iterator.hasNext()) {
				output = String.format("%02d ", iterator.next());
				lottoString += output;
				System.out.print(output);
			}
			output = "\n";
			lottoString += output;
			System.out.print(output);
		}
		return lottoString;
	}
}

public class Lotto_main {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.start();
	}
}
