package tests;

class Ex1{
    int b = 20; // widoczne w całej klasie
    public static void main(String[] args) {
        new Ex1().pass();
    }
    public void pass(){
        int a =10 , b=20;   // widoczne tylko w metodzie
        print(a) ;
    }
    public void print(int a){
        int c = b/a;
        System.out.print(c);
    }
}
