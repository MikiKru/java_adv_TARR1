import repetition.Repetition;

public class Main {
    public static void main(String[] args) {
        Repetition repetition = new Repetition();
//        repetition.getElements();
//        repetition.getUniqElements();
        System.out.println("Daodano element: " + repetition.addElement("Paulina"));
        System.out.println(repetition.deleteElement("a"));
        repetition.getElements();
    }
}
