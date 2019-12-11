package interfaces;

public class Main {
    public static void main(String[] args) {
//        DatabaseConnector db = new DatabaseConnector();
//        -> nie możan utworzyć obiektu interfejsu
        DatabaseConnectorImpl db = new DatabaseConnectorImpl();
        System.out.println("ŁĄCZENIE Z BAZĄ:");
        if(db.databaseDriverCheck()){
            db.setConnection(
                    "miki",
                    "123", "java_app");
            db.executeQuerry("SELECT * FROM users");
            db.closeConnecion();
        } else {
            System.out.println("NOT CONNECTED: BAD CREDENTIALS");
        }
    }
}
