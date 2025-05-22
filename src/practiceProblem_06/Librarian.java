package practiceProblem_06;


public class Librarian {
    private int id;
    private String name;
    private boolean verifyMemberId;


    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
        this.verifyMemberId = false;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVerifyMemberId() {
        return verifyMemberId;
    }

    public void setVerifyMemberId(boolean verifyMemberId) {
        this.verifyMemberId = verifyMemberId;
    }


    public books searchBookname(String bookName, books[] books) {
        for (books book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null;
    }



    public void orderBooks(books book) {
        System.out.println("Book ordered: " + book.getBookName() + " by Librarian " + this.name);
    }

    public void sellBook(books book) {
        if (book.getStatus().equals("Available")) {
            System.out.println("Book: " + book.getBookName() );
            book.setStatus("Sold");
        } else {
            System.out.println("Book is not available for sale");
        }
    }
}