package MediaPackage;

// класс Newspaper -- потомок класса Media
public class Newspaper extends Media {
    public Newspaper(String name) {
        super(name); // вызываем конструктор базового класса (класса Media)
    }

    @Override
    public void showInfo() {
        System.out.println("It's a newspaper: " + getName());
    }
}
