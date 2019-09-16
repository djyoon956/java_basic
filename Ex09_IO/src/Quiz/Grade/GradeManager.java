package Quiz.Grade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GradeManager {
	private Map<Integer, Grade> grades;
	private Scanner scanner;
	private String defaultPath;
	private int count;

	public GradeManager() {
		grades = new HashMap<Integer, Grade>();
		scanner = new Scanner(System.in);
		defaultPath = "grade.txt";
		count = 1;
	}

	public void run() {
		while (true) {
			System.out.println("성적 관리 프로그램");
			System.out.print("<1>추가 <2>삭제 <3>출력 <4>저장 <5>로드 <6>종료 : ");

			switch (scanner.nextInt()) {
			case 1:
				add();
				break;
			case 2:
				delete();
				break;
			case 3:
				print();
				break;
			case 4:
				save();
				break;
			case 5:
				load();
				break;
			case 6:
				System.out.println("프로그램 종료.");
				System.exit(0);
				break;
			}
		}
	}

	private void add() {
		Grade grade = new Grade();
		grades.put(count, grade.input(grade));
		count++;
	}

	private void delete() {
		System.out.print("삭제 번호 : ");
		int num = scanner.nextInt();

		Grade target = grades.get(num);
		if (target != null) {
			grades.remove(num);
			System.out.println("삭제 완료.");
		} else {
			System.out.println("고객넘버를 잘못입력하셨습니다. 해당 정보가 없습니다.");
		}
	}

	private void print() {
		System.out.println("count : " + grades.size());

		System.out.println("번호\t수학\t자바\t파이선\t평균\t등급");
		for (Integer key : grades.keySet()) {
			Grade target = grades.get(key);
			System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f\t%s\n", key, target.getMath(), target.getJava(),
					target.getPython(), target.getAvg(), target.getYou());
		}
	}

	private void save() {
		File file = new File(defaultPath);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(grades);
			System.out.println("저장 완료 : " + file.getAbsolutePath());
		} catch (Exception e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}
	}

	private void load() {
		File file = new File(defaultPath);
		if (!file.exists()) {
			System.out.println(file.getName() + "파일이 존재하지 않습니다.");
			return;
		}

		grades.clear();
		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(file))) {
			grades = (Map<Integer, Grade>) oos.readObject();

			System.out.println("번호\t수학\t자바\t파이선\t평균\t등급");
			print();
		} catch (Exception e) {
			System.out.println("불러오는데 실패하였습니다.");
			e.printStackTrace();
		}
	}
}
