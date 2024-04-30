import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // grupare dupa numarul de angajati
        List<Magazin> magazine = Arrays.asList(
                new Magazin("Magazin1", 15),
                new Magazin("Magazin2", 20),
                new Magazin("Magazin3", 15),
                new Magazin("Magazin4", 10)
        );

        Map<Integer, List<Magazin>> grupateDupaAngajati = magazine.stream()
                .collect(Collectors.groupingBy(Magazin::getNumarAngajati));

        grupateDupaAngajati.forEach((numarAngajati, magList) -> {
            System.out.println("Magazine cu " + numarAngajati + " angajati: " + magList);
        });
        // suma numarului de angajati din toate magazinele
        int totalAngajati = magazine.stream().collect(Collectors.summingInt(Magazin::getNumarAngajati));

        System.out.println("Total angajati in toate magazinele: " + totalAngajati);

    }
}