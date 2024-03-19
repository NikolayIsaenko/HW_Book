public class Main {
    public static void main(String[] args) {
        // Книга 1
        System.out.println(" Книга 1 ");
        Author book = new Author("Joanne", "Rowling");
        System.out.println(book.getNameAuthor() + " " + book.getSecondNameAuthor());
        Book intelligence = new Book("Harry Potter and the Philosopher's Stone",1997, book);
        System.out.println(intelligence.getTitleBook() + " " + intelligence.getYearOfPublishing());
        intelligence.setYearOfPublishing(2001);
        System.out.println("Год издательства поменялся на - " + intelligence.getYearOfPublishing());
        System.out.println();
        // Книга 2
        System.out.println(" Книга 2 ");
        book = new Author("Stephen", "King");
        intelligence = new Book("It", 1986, book );
        System.out.println(book.getNameAuthor() + " " + book.getSecondNameAuthor());
        System.out.println(intelligence.getTitleBook() + " " + intelligence.getYearOfPublishing());
    }
}