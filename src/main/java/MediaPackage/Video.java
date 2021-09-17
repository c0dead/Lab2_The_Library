package MediaPackage;

// класс Video -- потомок класса Media
public class Video extends Media {
    public Video(String name) {
        super(name); // вызываем конструктор базового класса (класса Media)
    }

    @Override
    public void showInfo() {
        System.out.println("It's a video: " + getName());
    }
}
