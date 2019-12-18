package collections;

public class JavaCollections {
    // deklaracja
    private String names [] = new String[6];    // typy obiektowe inicjalizowane sa null
    private Integer elements [] = new Integer[10];
    private char signs [] = new char[3];        // typ char -> init -> ''
                                                // typ int -> init -> 0
                                                // typ double -> init -> 0.0
                                                // typ boolean -> init -> false
    // inicjalizacja
    private int numbers [] = {2,4,3,5,2};

    public void arrayOfPrimitivesOperations(){
        // odwołanie do elementu tablicy
        System.out.println("Trzeci element: " + numbers[2]);
        // modyfikacja wartości na trzecim elemecie
        numbers[2] = 11;
        // sprawdzenie długości
        System.out.println(numbers.length);
    }
    public void arrayOfClassTypeOperations(){
        for (Integer s : elements) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        JavaCollections jc = new JavaCollections();
        jc.arrayOfClassTypeOperations();
    }
}
