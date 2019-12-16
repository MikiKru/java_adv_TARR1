package exceptions;

import java.util.InputMismatchException;

public class Reception {
    public void bookRoom(int roomNo){
        try {
            if (roomNo == 13) {
                // ręczne zgłoszenie wyjątku -> po to by go obsłużyć
                throw new InputMismatchException(); // tworzę obiekt wyjątku
            }
            System.out.println("Przypisano gości do pokoju numer " + roomNo);
        } catch (InputMismatchException e){
            System.out.println("W naszym hotelu nie można przypisać gości do pokoju nr 13");
        }
    }

    public static void main(String[] args) {
        new Reception().bookRoom(13);
    }

}
