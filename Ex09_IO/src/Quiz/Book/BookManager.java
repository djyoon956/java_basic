package Quiz.Book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class BookManager {

	Scanner scan = new Scanner(System.in);

	HashMap<String, Book> book_dic = new HashMap<String, Book>();
	File file = new File("books.txt");

	public void Run() {
		int key = 0;
		while ((key = selectMenu()) != 0) {
			switch (key) {
			case 1:
				addBook();
				break;
			case 2:
				removeBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				listBook();
				break;
			case 5:
				listISBN();
				break;
			case 6:
				saveFile();
				break;
			case 7:
				loadFile();
				break;
			default:
				System.out.println("잘못 선택하였습니다.");
				break;
			}
		}
		System.out.println("종료합니다...");
	}

	int selectMenu() {
		System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 6:파일 저장 7:파일 로드 0:종료");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void addBook() {
		String isbn;
		System.out.print("추가할 도서 ISBN:");
		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {
			System.out.println("이미 존재하는 ISBN입니다.");
			return;
		}

		String title;
		int price;

		System.out.print("도서 제목:");
		title = scan.nextLine();

		System.out.print("가격:");
		price = scan.nextInt();

		scan.nextLine();

		Book book = new Book(isbn, title, price);
		book_dic.put(isbn, book);

		System.out.println(book.toString() + " 생성하였습니다.");
	}

	void removeBook() {
		String isbn;

		System.out.print("삭제할 도서 ISBN:");
		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {
			book_dic.remove(isbn);
			System.out.println("삭제하였습니다.");
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}

	void searchBook() {
		String isbn;

		System.out.print("검색할 도서 ISBN:");
		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {
			Book book = book_dic.get(isbn);
			System.out.println("검색 결과>>" + book.toString());
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}

	void listBook() {
		System.out.println("도서 목록");

		int cnt = book_dic.size();
		System.out.println("도서 수:" + cnt);

		for (Book book : book_dic.values()) {
			System.out.println(book.toString());
		}
	}

	void listISBN() {
		System.out.println("ISBN 목록");

		int cnt = book_dic.size();
		System.out.println("도서 수:" + cnt);

		for (String isbn : book_dic.keySet()) {
			System.out.println(isbn);
		}
	}

	void saveFile() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			for (Book book : book_dic.values()) {
				bw.write(book.toString());
				bw.newLine();
			}
			System.out.println("저장 완료 : " + file.getAbsolutePath());
		} catch (Exception e) {
			System.out.println("파일 저장 중 오류 발생!");
			e.printStackTrace();
		}
	}

	void loadFile() {
		if (!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.print(line);
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("파일 로드 중 오류 발생!");
			e.printStackTrace();
		}
	}
}