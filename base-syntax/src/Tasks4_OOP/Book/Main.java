package Tasks4_OOP.Book;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Джордж Оруэлл", "Мужчина", "george.orwell@example.com");

        Book book = new Book("1984", author, 1949);

        System.out.println(author);
        System.out.println(book);
    }
}