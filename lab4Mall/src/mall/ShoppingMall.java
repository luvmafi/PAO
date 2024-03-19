package mall;
import interfaces.BankCard;
public class ShoppingMall {
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void achizitie(double amount) {
        bankCard.doTransaction(amount);
    }
}

