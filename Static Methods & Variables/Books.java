public class Books {
    private static int totalBooks = 0;
    private String title;
    private String author;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void displayBooks() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
