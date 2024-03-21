import java.util.Objects;

public class Book {
        private String titleBook;
        private int yearOfPublishing;
        private Author author;

        public Book(String titleBook, int yearOfPublishing, Author author) {
                this.titleBook = titleBook;
                this.yearOfPublishing = yearOfPublishing;
                this.author = author;
        }

        public String getTitleBook() {
                return titleBook;
        }

        public int getYearOfPublishing() {
                return yearOfPublishing;
        }

        public void setYearOfPublishing(int yearOfPublishing) {
                this.yearOfPublishing = yearOfPublishing;
        }

        @Override
        public String toString() {
                return titleBook + " " + yearOfPublishing + " " + author;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Book book = (Book) o;
                return yearOfPublishing == book.yearOfPublishing && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
                return Objects.hash(titleBook, yearOfPublishing, author);
        }
}
