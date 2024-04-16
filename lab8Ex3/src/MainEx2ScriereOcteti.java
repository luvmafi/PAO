import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainEx2ScriereOcteti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persoaneOcteti.txt"))) {
            while (true) {
                try {
                    System.out.print("Nume: ");
                    String nume = scanner.nextLine();
                    System.out.print("Prenume: ");
                    String prenume = scanner.nextLine();
                    System.out.print("Varsta: ");
                    int varsta = Integer.parseInt(scanner.nextLine());
                    System.out.print("Suma: ");
                    int suma = Integer.parseInt(scanner.nextLine());
                    System.out.print("Valuta: ");
                    String valuta = scanner.nextLine();

                    if (suma > 2000) {
                        throw new SumTooHighException("Suma nu poate fi mai mare de 2000.");
                    }

                    Person person = new Person(nume, prenume, varsta, suma, valuta);
                    oos.writeObject(person);

                    System.out.print("Doriti să adaugati o alta persoana? (da/nu): ");
                    String answer = scanner.nextLine();
                    if (!"da".equalsIgnoreCase(answer)) {
                        break;
                    }
                } catch (SumTooHighException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Varsta si suma trebuie sa fie numere valide.");
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la scrierea în fisier: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}