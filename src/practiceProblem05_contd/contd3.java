package practiceProblem05_contd;

public class contd3 {
    private String title;
    private String author;


    public contd3(String title) {
        this.title = title;
        this.author = "Unknown"; // Default value if author not provided
    }


    public contd3(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

    }


    public static void main(String[] args) {
        contd3 book1 = new contd3("java");
        contd3 book2 = new contd3("Computer Organization and Architecture", "william Stallings");

        book1.displayInfo();
        book2.displayInfo();
    }
}

