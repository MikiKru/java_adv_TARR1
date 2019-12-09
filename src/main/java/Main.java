import repetition.Repetition;

public class Main {
    public static void main(String[] args) {
        Repetition repetition = new Repetition();
//        repetition.getElements();
//        repetition.getUniqElements();
        System.out.println("Daodano element: " + repetition.addElement("Paulina"));
//        System.out.println(repetition.deleteOneElement("a"));
//        System.out.println(repetition.deleteOneElement("abba"));
        repetition.swapEllementsByIndex(1,3);


//        repetition.deleteSameElement("b");
        repetition.getElements();

    }
}
