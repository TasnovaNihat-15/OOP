package practiceProblem_06;

public class books {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String yearOfPub;
    private float price;
    private String status;


    public books(int bookId, String bookName, String bookAuthor, String yearOfPub, float price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = "Available";
    }


    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(String yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void addNewBook() {
        System.out.println("Book added: " + this.bookName);
    }

    public void deleteBook() {
        System.out.println("Book deleted: " + this.bookName);
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year of Publication: " + yearOfPub);
        System.out.println("Price: $" + price);
        System.out.println("Status: " + status);
    }

    public boolean inquiryBook() {
        return this.status.equals("Available");
    }
}


