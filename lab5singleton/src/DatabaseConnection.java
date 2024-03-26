public class DatabaseConnection {

    private static DatabaseConnection instance;

    private String connectionString;


    private DatabaseConnection() {
        this.connectionString = "jdbc:mysql://localhost:3306/mydatabase";
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void connect() {
        System.out.println("Connecting to database with " + connectionString);
    }
}
