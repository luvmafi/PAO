package models;

public class Transaction implements Cloneable {
    private int id;
    private Payment payment;
    private enums.Currency currency = enums.Currency.EUR;
    private double amount;
    private String refNmb;
    public Transaction(int id, Payment payment) {
        this.id = id;
        this.payment = payment;
        this.amount = payment.getAmount();
    }


    public int getId() {
        return id;
    }

    public Payment getPayment() {
        return payment;
    }

    public double getAmount() {
        return amount;
    }

    public String getRefNmb() {
        return refNmb;
    }

    public void setRefNmb(String refNmb) {
        this.refNmb = refNmb;
    }

    @Override
    public Transaction clone() {
        try {
            Transaction clone = (Transaction) super.clone();
            // Asigură-te că și Payment este corespunzător clonat dacă este necesar.
            // Deoarece User nu este Cloneable, referința la User va fi partajată între clone.
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", payment=" + payment +
                ", currency=" + currency +
                ", amount=" + amount +
                ", refNmb='" + refNmb + '\'' +
                '}';
    }
}
