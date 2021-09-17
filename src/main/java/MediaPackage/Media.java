package MediaPackage;

// абстрактный класс Media
public abstract class Media {
    public Media(String name) {
        this.name = name;
    }

    // у всех медифайлов есть метод showInfo
    public abstract void showInfo();

    public String getName() {
        return name;
    }

    // у всех медиафайлов есть название
    private String name;
}
