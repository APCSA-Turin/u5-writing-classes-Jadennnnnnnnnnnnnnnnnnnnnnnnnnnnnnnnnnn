public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Fahrenheit 451", "Ray Bradbury");
        Books book2 = new Books("1984", "George Orwell");

        book1.displayBooks();
        book2.displayBooks();

        System.out.println("There are " + Books.getTotalBooks() + " in this shop");
    }
}
