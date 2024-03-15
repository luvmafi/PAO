package service;

import model.Person;
import model.Professor;
import model.Student;
import java.util.ArrayList;
import java.util.List;

public class StorageService {
    private List<Student> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();

    public void createPerson(Person person) {
        if (person instanceof Student) {
            for (Student student : students) {
                if (student.getName().equals(person.getName())) {
                    System.out.println("Already existing");
                    return;
                }
            }
            students.add((Student) person);
        } else if (person instanceof Professor) {
            for (Professor professor : professors) {
                if (professor.getName().equals(person.getName())) {
                    System.out.println("Already existing");
                    return;
                }
            }
            professors.add((Professor) person);
        }
    }

    public void readPerson(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student.getName() + " " + student.getPhoneNumber() + " " + student.getEmailAddress() + " " + student.getStudentNumber() + " " + student.getAverageMark() + " " + student.getClassNumber());
                return;
            }
        }
        for (Professor professor : professors) {
            if (professor.getName().equals(name)) {
                System.out.println(professor.getName() + " " + professor.getPhoneNumber() + " " + professor.getEmailAddress() + " " + professor.getCourse() + " " + professor.getYear());
                return;
            }
        }
        System.out.println("Not found");
    }


}
