package card;
import interfaces.BankCard;
public class CreditCard implements BankCard {
    private static double spentAmount = 0;
    private String utilizator;

    public CreditCard(String utilizator) {
        this.utilizator = utilizator;
    }

    @Override
    public void doTransaction(double amount) {
        spentAmount += amount;
        System.out.println("Utilizator " + utilizator + " a cheltuit " + amount);
        System.out.println("Suma cheltuita cu cardurile de credit este:  " + spentAmount);
    }
}
