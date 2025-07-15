package week2.day1;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library Lib = new Library();
		System.out.println(Lib.addBook("Da Vinci Code"));
		Lib.issueBook();
		

	}

}
