public class Application {

    public static void main(String[] args) {

        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();

        System.out.println(dbConnection1.equals(dbConnection2));

        dbConnection1.connect();

        String newConnectionString = "jdbc:mysql://localhost:3306/newdatabase";
        dbConnection1.getConnectionString();
        dbConnection2.getConnectionString();
    }
}
