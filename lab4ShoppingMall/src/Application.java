import card.*;
import mall.ShoppingMall;

public class Application {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard("Ion Popescu", 500);
        CreditCard creditCard = new CreditCard("Maria Ionescu");

        ShoppingMall mall = new ShoppingMall(debitCard);
        mall.achizitie(300); // Achiziție cu cardul de debit

        mall = new ShoppingMall(creditCard);
        mall.achizitie(600); // Achiziție cu cardul de credit
    }
}
