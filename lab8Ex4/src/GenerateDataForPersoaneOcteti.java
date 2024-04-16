import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GenerateDataForPersoaneOcteti {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persoaneOcteti.txt"))) {
            oos.writeObject(new Person("Popescu", "Ion", 34, 1500, "EUR"));
            oos.writeObject(new Person("Ionescu", "Maria", 29, 2100, "USD"));
            oos.writeObject(new Person("Popescu", "Ion", 45, 1800, "EUR"));
            oos.writeObject(new Person("Vasilescu", "Ioana", 31, 1700, "RON"));
            oos.writeObject(new Person("Ionescu", "Maria", 42, 2200, "USD"));
            oos.writeObject(new Person("Popescu", "Ion", 34, 1950, "EUR"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
