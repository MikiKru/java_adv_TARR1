package christmasExercises;

import java.util.Random;

public class ChristmasTreeFactoryImpl implements ChristmasTreeFactory {

    @Override
    public void produceNrandomSizechristmasTrees(int n) {
        // produkujemy N choinek o rozmiarach losowych z zakresu 5 - 10
        for (int i = 0; i < n; i++) {
            ChristmasTreeImpl ct = new ChristmasTreeImpl();
            String tree = ct.produceChristmasTree(new Random().nextInt(6) + 5);     // metoda zwraca choinke
//            nextInt(6)        -> 0 - 5
//            nextInt(6) + 5    -> 5 - 10
            ChristmasTreeFactory.christmasTrees.add(tree);
        }
    }
    @Override
    public void consumeRandomChristmasTree() {
        // losowo wybierana i usuwana jest choinka z listy
        // jako wynik wyświetl sprzedaną choinkę
        if(ChristmasTreeFactory.christmasTrees.size() > 0) {
            int index = new Random().nextInt(ChristmasTreeFactory.christmasTrees.size()); // losowo wybrany index
            System.out.println("Sprzedano choinkę");
            System.out.println(ChristmasTreeFactory.christmasTrees.remove(index));
        } else {
            System.out.println("Spóźniłeś się! Wszystkie choinki zostały sprzedane");
        }
    }
    @Override
    public void getAllChristmasTrees() {    // wszystkie elementy z listy z interfejsu
        for (String tree : ChristmasTreeFactory.christmasTrees){
            System.out.println("Choinka nr: " + ChristmasTreeFactory.christmasTrees.indexOf(tree));
            System.out.println(tree);
        }
    }
    public static void main(String[] args) {
        ChristmasTreeFactoryImpl ctfi = new ChristmasTreeFactoryImpl();
        ctfi.produceNrandomSizechristmasTrees(5);
        ctfi.getAllChristmasTrees();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
    }
}
