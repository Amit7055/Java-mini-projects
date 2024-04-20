package library;
import java.util.Scanner;

public class LibraryTest {
	public static void main(String[] args) {
		// Create books
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
		Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Classic");
		Book book3 = new Book("1984", "George Orwell", "Dystopian");
		Member member1 = new Member("John Doe", "M101");
		Member member2 = new Member("Jane Smith", "M202");
		Library library = new Library();
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addMember(member1);
		library.addMember(member2);
		Member member;
		Book book;
		Validation validation = new Validation();
		Scanner scanner = new Scanner(System.in);
		boolean exit = true;
		int ch;

		while (exit) {
			System.out.println("-------Library-------");
			System.out.println("1. Book");
			System.out.println("2. Member");
			System.out.println("3. Exit");

			System.out.println("1. addMember");
			System.out.println("1. removeMember");
			System.out.println("1. updateMember");
			System.out.println("1. borrowBook");
			System.out.println("1. returnBook");

			ch = scanner.nextInt();
			boolean exit2 = true;
			switch (ch) {
			case 1: {

				while (exit2) {
					System.out.println("-------Books-------");
					System.out.println("1. Add Book");
					System.out.println("2. Remove Book");
					System.out.println("3. Update Book");
					System.out.println("4. Search");
					System.out.println("5. Display All Books");
					System.out.println("6. Exit");
					int chh = scanner.nextInt();

					switch (chh) {
					case 1: {
						System.out.println("To Add Book please enter following Details");
						System.out.println();

						book = Input.getData();

						if (book == null) {
							System.out.println("Enter valid inputs....");
						} else {
							System.out.println("Successfull");
							library.addBook(book);
						}
						System.out.println();
						break;
					}
					case 2: {
						scanner.nextLine();
						System.out.println("To Remove Book please enter following Details");
						System.out.println("Enter the title of book");
						String title = scanner.nextLine();
						library.removeBook(title);
						System.out.println();
						break;
					}
					case 3: {
						scanner.nextLine();
						System.out.println("To Update Book please enter following Details");
						System.out.println("Enter the title of book");
						String title = scanner.nextLine();
						Book updateBook;
						updateBook = Input.getData();
						if (updateBook == null) {
							System.out.println("Enter valid inputs....");
						} else {
							library.updateBook(title, updateBook);
						}
						System.out.println();
						break;
					}
					case 4: {
						boolean exit3 = true;

						while (exit3) {
							System.out.println("-------------Search-------------");
							System.out.println("1. Search Book By Title");
							System.out.println("2. Search Book By Author");
							System.out.println("3. Search Book By Category");
							int choice = scanner.nextInt();

							switch (choice) {
							case 1: {
								
								break;
							}
							case 2: {

								break;
							}
							case 3: {

								break;
							}
							case 4: {
								exit3 = false;
								break;
							}
							default:
								System.out.println("Invalid Data...");
							}

						}

						break;
					}
					case 5: {
						library.displayAllBooks();
						break;
					}
					case 6: {
						System.out.println("Exiting....");
						exit2 = false;
						break;
					}
					default:
						System.out.println("Invalid choice....");
					}
				}

				break;
			}
			case 2: {

				break;
			}
			case 3: {
				System.out.println("Exiting....");
				exit = false;
				break;
			}
			default:
				System.out.println("Invalid choice....");
			}

		}

//		Member member;
//		member = Input.name(asd);
//		library.addMember(member);
//		member = Input.name(sdad);
//		library.addMember(member);
//		library.displayAllMembers();

//		library.displayAllBooks();
//		library.displayAllMembers();
//		library.borrowBook("M001", "To Kill a Mockingbird");
//		library.returnBook("M001", "To Kill a Mockingbird");
//		Transaction transaction = new Transaction();
//		transaction.recordBorrowTransaction("M002", "1984");
//		transaction.recordReturnTransaction("M002", "1984");
//		transaction.displayTransactions();

	}
}
