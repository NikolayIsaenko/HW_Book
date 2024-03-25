public class Main {
    public static void main(String[] args) {
        // Книга 1
        System.out.println(" Книга 1 ");
        Author book = new Author("Joanne", "Rowling");
        System.out.println(book.getNameAuthor() + " " + book.getSecondNameAuthor());
        Book intelligence = new Book("Harry Potter and the Philosopher's Stone", 1997, book);
        System.out.println(intelligence.getTitleBook() + " " + intelligence.getYearOfPublishing());
        intelligence.setYearOfPublishing(2001);
        System.out.println("Год издательства поменялся на - " + intelligence.getYearOfPublishing());
        System.out.println();
        // Книга 2
        System.out.println(" Книга 2 ");
        Author book1 = new Author("Stephen", "King");
        Book intelligence1 = new Book("It", 1986, book1);
        System.out.println(book1.getNameAuthor() + " " + book1.getSecondNameAuthor());
        System.out.println(intelligence1.getTitleBook() + " " + intelligence1.getYearOfPublishing());
        System.out.println();
        // Тема 2. Задачи на 3 метода
        System.out.println("Тема 2. Задачи на 3 метода");
        // Метод toString
        System.out.println(" Метод toString");
        System.out.println();
        System.out.println(book.toString());
        System.out.println(book1.toString());
        System.out.println(intelligence.toString());
        System.out.println(intelligence1.toString());
        System.out.println();
        // Метод equals и hash
        System.out.println("Метод equals и hash");
        System.out.println(book.equals(book1));
        System.out.println(intelligence1.equals(intelligence));
    }
}