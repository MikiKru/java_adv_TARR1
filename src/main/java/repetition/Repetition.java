package repetition;


import java.util.*;

public class Repetition {
    // 1. lista napisów
    private List<String> elements = new LinkedList<>(
            Arrays.asList("a", "b", "b", "a")
    );

    // 2. Wypisz elementy listy
    public void getElements() {
        for (String s : elements) {
            System.out.println(s);
        }
    }
    // 3. Wypisz unikatowe elementy z listy
    public void getUniqElements() {
        Set<String> uniqElements = new HashSet<>(elements);
        for (String uniqElement : uniqElements) {
            System.out.print(uniqElement + " ");
        }
    }
    // 4. Dodawanie elemntu do listy podanego w argumencie metody
    public String addElement( String element){
        elements.add(element);
        return element;
    }
    public String deleteOneElement (String deleteElement){
        if (elements.remove(deleteElement)){
            return "usunieto element "+ deleteElement;

        }else{
            return "w liscie nie ma takiego elementu "+ deleteElement;
        }
    }
    public void  deleteSameElement (String deleteElement) {
        int index = 0;
        while(index < elements.size()){      // zwraca true dopóki jest jakiś elelement do usunięcia
            if(elements.get(index).equals(deleteElement)){
                elements.remove(deleteElement);
                index --;
            }
            index ++;
        }
        //        for (String s : elements) {
//            if (s.equals(deleteElement)) {
//                elements.remove(deleteElement);
//            }
//        }
    }





}
