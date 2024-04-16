import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MainEx1CitireChar {
    public static void main(String[] args) {
        Map<String, List<String>> personMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("persoaneChar.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 5) {
                    String nameKey = parts[0] + " " + parts[1];
                    String record = "Nume: " + parts[0] + ", Prenume: " + parts[1] + ", Varsta: " + parts[2] + ", Suma: " + parts[3] + ", Valuta: " + parts[4];

                    if (!personMap.containsKey(nameKey)) {
                        personMap.put(nameKey, new ArrayList<>());
                    }
                    personMap.get(nameKey).add(record);
                }
            }

            for (Map.Entry<String, List<String>> entry : personMap.entrySet()) {
                if (entry.getValue().size() > 1) {
                    System.out.println("Persoane cu numele si prenumele " + entry.getKey() + ":");
                    for (String details : entry.getValue()) {
                        System.out.println(details);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier: " + e.getMessage());
        }
    }
}
