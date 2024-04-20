package library;

import java.time.LocalDateTime;

public class TransactionRecord {
	private String memberId;
	private String bookId;
	private String transactionType; // Borrow or Return
	private LocalDateTime transactionDate;

	public TransactionRecord(String memberId, String bookId, String transactionType) {
		this.memberId = memberId;
		this.bookId = bookId;
		this.transactionType = transactionType;
		this.transactionDate = LocalDateTime.now(); // Current date and time
	}

	public String getMemberId() {
		return memberId;
	}

	public String getBookId() {
		return bookId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
}