package taskManager.controller;

public interface FileManager {
    public final String FILE_PATH = "C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\taskManager\\resource\\tasks.csv";
    // metoda zapisująca dane o taskach i użytkownikach do pliku
    void saveTasksToFile();
}
