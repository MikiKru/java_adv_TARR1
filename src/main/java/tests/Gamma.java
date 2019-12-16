package tests;

public class Gamma extends Beta {
    String getType() {
        return "gamma";
    }
    public static void main(String[] args) {
        Alpha g1 = new Alpha();
        Alpha g2 = new Beta();
        Alpha g3 = new Gamma();

//        System.out.println(g1.getClass().getName());
//        System.out.println(g2.getClass().getName());
//        System.out.println(g3.getClass().getName());

        System.out.println(g1.getType());
        System.out.println(g2.getType());
        System.out.println(g3.getType());

    }
}

