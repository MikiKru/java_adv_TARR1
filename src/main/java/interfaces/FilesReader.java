package interfaces;

public abstract class FilesReader {
    // metody abstrakcyjne
    public abstract void readFile();

    public void closeFile(){
        System.out.println("FILE IS CLOSED");
    }

    public FilesReader() {
        System.out.println("Jestem w konstruktorze");
    }
}
