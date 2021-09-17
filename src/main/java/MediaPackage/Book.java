package MediaPackage;

// класс Book -- потомок класса Media
public class Book extends Media {
    public Book(String name) {
        super(name); // вызываем конструктор базового класса (класса Media)
    }

    @Override
    public void showInfo() {
        System.out.println("It's a book: " + getName());
    }
}
