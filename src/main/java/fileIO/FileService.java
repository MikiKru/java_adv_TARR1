package fileIO;

import java.io.*;
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
        s.close();
    }
    public void insertDataIntoFile(String path, String data) throws FileNotFoundException {
        // nie wymaga aby plik istniał
        // zostanie automatycznie utworzony nowy plik
        // wykonuje nadpisanie istniejącej zawartości pliku
        PrintWriter pw = new PrintWriter(new File(path));
        pw.println("NAGŁÓWEK");
        pw.println(data);
        pw.close();
    }
    public void appendDataIntoFile(String path, String data) throws IOException {
        FileWriter fw = new FileWriter(new File(path), true);
        fw.append(data+"\n");
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        FileService fs = new FileService();
//        fs.readFile("C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\fileIO\\text.txt");
//        fs.readCsvFile("C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\fileIO\\data.csv");
//        fs.insertDataIntoFile(
//                "C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\fileIO\\fromFileReader.txt",
//                "ALA MA PSA");
        fs.appendDataIntoFile("C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\fileIO\\append.txt",
                "dodajemy dane");
    }

}
