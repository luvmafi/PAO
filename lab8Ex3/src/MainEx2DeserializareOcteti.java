import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class MainEx2DeserializareOcteti {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persoaneOcteti.txt"));
             PrintWriter writer = new PrintWriter(new FileOutputStream("persoaneOctetiDeserializare.txt"))) {
            while (true) {
                try {
                    Person person = (Person) ois.readObject();
                    writer.println(person.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println("Clasa nu a fost găsită: " + e.getMessage());
                    break;
                } catch (IOException e) {
                    System.out.println("Nu exista mai multe obiecte de citit sau eroare la citire.");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la deschiderea fișierului sau la scriere: " + e.getMessage());
        }
    }
}
