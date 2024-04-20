package library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	private HashMap<String, Book> books;
	private HashMap<String, Member> members;

	public Library() {
		this.books = new HashMap<>();
		this.members = new HashMap<>();
	}

	public void addBook(Book book) {
		books.put(book.getTitle(), book);
	}

	public void removeBook(String bookId) {
		books.remove(bookId);
	}

	public void updateBook(String bookId, Book updatedBook) {
		books.put(bookId, updatedBook);
	}

	public Book searchBookByTitle(String title) {
		return books.get(title);
	}

	public ArrayList<Book> searchBookByAuthor(String author) {
		ArrayList<Book> result = new ArrayList<>();
		for (Book book : books.values()) {
			if (book.getAuthor().equals(author)) {
				result.add(book);
			}
		}
		return result;
	}

	public ArrayList<Book> searchBookByCategory(String category) {
		ArrayList<Book> result = new ArrayList<>();
		for (Book book : books.values()) {
			if (book.getCategory().equals(category)) {
				result.add(book);
			}
		}
		return result;
	}

	public void addMember(Member member) {
		members.put(member.getMemberId(), member);
	}

	public void removeMember(String memberId) {
		members.remove(memberId);
	}

	public void updateMember(String memberId, Member updatedMember) {
		members.put(memberId, updatedMember);
	}

	public Member getMemberById(String memberId) {
		return members.get(memberId);
	}

	public void borrowBook(String memberId, String bookId) {
		Member member = members.get(memberId);
		Book book = books.get(bookId);
		if (member != null && book != null && book.isAvailability()) {
			member.borrowBook(book);
			book.setAvailability(false);
		} else {
			System.out.println("Invalid member ID or book ID, or book is not available.");
		}
	}

	public void returnBook(String memberId, String bookId) {
		Member member = members.get(memberId);
		Book book = books.get(bookId);
		if (member != null && book != null && !book.isAvailability()) {
			member.returnBook(book);
			book.setAvailability(true);
		} else {
			System.out.println("Invalid member ID or book ID, or book is already available.");
		}
	}

	public void displayAllBooks() {
		System.out.println("All Books:");
		for (Book book : books.values()) {
			System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Category: " + book.getCategory()
					+ ", Available: " + book.isAvailability());
		}
	}

	public void displayAllMembers() {
		System.out.println("All Members:");
		for (Member member : members.values()) {
			System.out.println("Name: " + member.getName() + "\nID: " + member.getMemberId());
		}
	}
}
