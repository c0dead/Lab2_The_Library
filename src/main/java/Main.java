import LibrariesPackage.BookLibrary;
import LibrariesPackage.GeneralLibrary;
import MediaPackage.Book;
import MediaPackage.Media;
import MediaPackage.Newspaper;
import MediaPackage.Video;

public class Main {
    public static void main(String[] args) {
        // создаём массив книг
        Book[] books = new Book[2];
        books[0] = new Book("Harry Potter and the Philosopher's Stone");
        books[1] = new Book("Dracula");

        // создаём библиотеку только для книг
        BookLibrary bookLib = new BookLibrary(books);
        bookLib.showBooksCollection();

        // создаём массив медиафайлов
        Media[] media = new Media[3];
        media[0] = new Book("1984");
        media[1] = new Newspaper("The Guardian");
        media[2] = new Video("Queen -- Live Aid Performance");

        // создаём общую библиотеку для всех медиафайлов
        GeneralLibrary<Media> genLib = new GeneralLibrary<Media>(media);
        genLib.showMediaCollection();
    }
}
