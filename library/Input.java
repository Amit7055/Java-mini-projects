package project2;

import java.util.Scanner;

public class Input {

	static int id = 1;

	public static Member name(String name) {
		int idd = id++;
		String memberId = "M00" + idd;
		Member member = new Member(name, memberId);
		return member;
	}

	public static Book getData() {
		Scanner scanner = new Scanner(System.in);
		Validation validation = new Validation();

		System.out.println("Enter title of the book");
		String title = scanner.nextLine();

		System.out.println("Enter the name of author");
		String author = scanner.nextLine();

		System.out.println("Enter category of the book");
		String category = scanner.next();

		if (validation.checkAll(title, author, category)) {
			Book book = new Book(title, author, category);
			return book;
		} else {
			return null;
		}

	}

}
