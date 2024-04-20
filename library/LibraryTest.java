package library;


public class LibraryTest {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Classic");
        Book book3 = new Book("1984", "George Orwell", "Dystopian");

        Member member1 = new Member("John Doe", "M001");
        Member member2 = new Member("Jane Smith", "M002");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member1);
        library.addMember(member2);
        library.displayAllBooks();
        library.displayAllMembers();

        library.borrowBook("M001", "To Kill a Mockingbird");
        library.returnBook("M001", "To Kill a Mockingbird");

        Transaction transaction = new Transaction();
        transaction.recordBorrowTransaction("M002", "1984");
        transaction.recordReturnTransaction("M002", "1984");
        transaction.displayTransactions();
    }
}

