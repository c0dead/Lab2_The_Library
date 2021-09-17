package LibrariesPackage;

import MediaPackage.Book;

// библиотека только для книг
public class BookLibrary {
    public BookLibrary(Book[] books) {
        this.books = books;
    }

    // этот метод выводит список книг библиотеки
    public void showBooksCollection() {
        System.out.println("Book Library:");
        for (int i = 0; i < books.length; i++)
            books[i].showInfo();
    }

    // массив книг
    private Book[] books;
}
