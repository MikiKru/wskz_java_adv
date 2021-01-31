package lect04_abstract_classes;

public class MySQLConnector extends DatabaseConnector{
    private static String jdbc = "MySQL";

    public void connect(String dbName, String user, String pasword) {
        System.out.println("Connected!");
        System.out.printf("DB Engine: %s DB Name: %s User: %s Password: %s\n",
        jdbc, dbName, user, pasword);
        super.setDbName(dbName);
        super.setUser(user);
        super.setPassword(pasword);
    }

    public void close() {
        System.out.println("Connection closed!");
    }

    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new MySQLConnector();
        databaseConnector.connect("example_db", "example_user","qwe123");
        System.out.println("Nazwa DB: " + databaseConnector.getDbName());
        databaseConnector.close();
        System.out.println(databaseConnector.getClass());
    }
}
