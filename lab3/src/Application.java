import model.Professor;
import model.Student;
import service.StorageService;
import java.util.Scanner;

public class Application {
    private static StorageService storageService = new StorageService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Available commands: create, read, update, delete, quit");
            System.out.print("Enter command: ");
            String command = scanner.nextLine().trim();

            switch (command) {
                case "create":
                    handleCreate();
                    break;
                case "read":
                    handleRead();
                    break;
                case "update":
                    break;
                case "delete":
                    break;
                case "quit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }

    private static void handleCreate() {

        System.out.print("Enter type of person: ");
        String type = scanner.nextLine().trim();

        System.out.print("name: ");
        String name = scanner.nextLine().trim();

        System.out.print("phone number: ");
        String phoneNumber = scanner.nextLine().trim();

        System.out.print("email: ");
        String email = scanner.nextLine().trim();

        if ("student".equals(type)) {
            System.out.print("student number: ");
            int studentNumber = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("average mark: ");
            double averageMark = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("class: ");
            int classNumber = Integer.parseInt(scanner.nextLine().trim());

            Student student = new Student(name, phoneNumber, email, studentNumber, averageMark, classNumber);
            storageService.createPerson(student);
        } else if ("profesor".equals(type)) {
            System.out.print("course: ");
            String course = scanner.nextLine().trim();

            System.out.print("year: ");
            int year = Integer.parseInt(scanner.nextLine().trim());

            Professor profesor = new Professor(name, phoneNumber, email, course, year);
            storageService.createPerson(profesor);
        } else {
            System.out.println("Invalid type of person.");
        }
    }

    private static void handleRead() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();

        storageService.readPerson(name);
    }
}
