package tests;

public class MyObjects {
    int a = 1;
    public static void main(String[] args) {
        MyObjects t1 = new MyObjects();
        MyObjects t2 = t1;
        MyObjects t3 = null;
        System.out.println(++t2.a);
//        System.out.println(t3.a);
    }
}
