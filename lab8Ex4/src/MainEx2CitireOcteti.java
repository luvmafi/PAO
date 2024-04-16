import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;

public class MainEx2CitireOcteti {
    public static void main(String[] args) {
        Map<String, List<Person>> personMap = new HashMap<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persoaneOcteti.txt"))) {
            while (true) {
                try {
                    Person person = (Person) ois.readObject();
                    String key = person.getNume() + " " + person.getPrenume();
                    personMap.computeIfAbsent(key, k -> new ArrayList<>()).add(person);
                } catch (ClassNotFoundException e) {
                    System.out.println("Clasa nu a fost gasita: " + e.getMessage());
                    break;
                } catch (IOException e) {
                    break;
                }
            }

            personMap.forEach((key, value) -> {
                if (value.size() > 1) {
                    System.out.println("Persoane cu numele " + key + ":");
                    value.forEach(System.out::println);
                }
            });
        } catch (IOException e) {
            System.out.println("Eroare la deschiderea fisierului: " + e.getMessage());
        }
    }
}
