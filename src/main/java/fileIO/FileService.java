package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileService {
    public void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner s = new Scanner(file);
        // pobieram zawartość pliku dopuki wysepuje kolejny wiersz
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
    }
    public void readCsvFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner s = new Scanner(file);

        // pobieram zawartość pliku dopuki wysepuje kolejny wiersz
        int i = 0;
        while(s.hasNext()){
            String line = s.nextLine(); // pobranie lini z pliku
            i ++;
            // pomienięcie nagłówka
            if(i == 1){
                continue;
            }
            // podziel zawartość po separatorze ;
            String elements [] = line.split(";");
            System.out.println("ID: " +elements[0]);
            System.out.println("NAME: " +elements[1]);
            System.out.println("LASTNAME: " +elements[2]);
            System.out.println("==========================");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileService fs = new FileService();
        fs.readFile("C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\fileIO\\text.txt");
        fs.readCsvFile("C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\fileIO\\data.csv");
    }

}
