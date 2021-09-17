package LibrariesPackage;

import MediaPackage.Media;

// общая библиотека (библиотека для любых медиафайлов)
// библиотека может хранить <T extends Media>, т. е. объекты класса Media и потомков класса Media
public class GeneralLibrary<T extends Media> {
    public GeneralLibrary(T[] media) {
        this.media = media;
    }

    // этот метод выводит список медиафайлов библиотеки
    public void showMediaCollection() {
        System.out.println("General Library:");
        for (int i = 0; i < media.length; i++)
            media[i].showInfo();
    }

    // массив медиафайлов
    private T[] media;

}
