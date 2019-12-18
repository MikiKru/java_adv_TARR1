package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollections {
//    List<Integer> numbers = new List<>(); - nie można utworzyć obiektu integfejsu
    private List<Integer> numbers = new ArrayList<>();  // polimorfizm typem Listwywołuje konstruktor ArrayList
    private ArrayList<Integer> numbers2 = new ArrayList<>(
            Arrays.asList(1,1,1,5,4,3,2,1)); // inicjalizacja listy
    public void getElements(){
        for (Integer i : numbers2) {
            System.out.println(i);
        }
    }
    public void listOperations(){
//        numbers2.set(2, 15);                    // modyfiakcja wartości na indeksie 2
//        System.out.println(numbers2.get(2));    // zwraca wartośc na indeksie 2
//        System.out.println(numbers2.size());
        // dynamiczne modyfikowanie rozmiaru listy
        numbers2.add(11);               // dodawanie
        numbers2.remove(1);                     // usuwanie
        numbers2.remove(numbers2.indexOf(1));        // usuwanie
    }
    public void deleteAllElementsByValue(int value){
        List<Integer> auxList = new ArrayList<>(Arrays.asList(value));
        // usuń część wspólną list numbers i auxList
        numbers2.removeAll(auxList);
    }
    public static void main(String[] args) {
        ListCollections lc = new ListCollections();
        lc.listOperations();
        lc.deleteAllElementsByValue(1);
        lc.getElements();
    }
}
