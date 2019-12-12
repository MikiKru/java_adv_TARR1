package taskManager.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileManager {
    public final String FILE_PATH = "C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\taskManager\\resource\\tasks.csv";
    // metoda zapisująca dane o taskach i użytkownikach do pliku
    void saveTasksToFile() throws IOException;
    void getDataFromFile() throws FileNotFoundException;
}
