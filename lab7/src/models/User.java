package models;

public class User {
    private String firstName;
    private String lastName;
    private String iban;

    public User(String firstName, String lastName, String iban) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }

}
