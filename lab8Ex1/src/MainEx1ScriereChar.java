import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEx1ScriereChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("persoaneChar.txt", true))) {
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

                    String line = nume + ";" + prenume + ";" + varsta + ";" + suma + ";" + valuta;
                    writer.write(line);
                    writer.newLine();

                    System.out.print("Doriti sa introduceti o alta persoana? (da/nu): ");
                    String answer = scanner.nextLine();
                    if (!"da".equalsIgnoreCase(answer)) {
                        break;
                    }
                } catch (SumTooHighException e) {
                    System.out.println(e.getMessage());
                    continue;
                    
                } catch (NumberFormatException e) {
                    System.out.println("Varsta si suma trebuie sa fie numere valide.");
                }
            }
        } catch (IOException e) {
            System.out.println("Nu s-a putut scrie in fisier.");
        } finally {
            scanner.close();
        }
    }
}