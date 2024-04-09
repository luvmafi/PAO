import models.Payment;
import models.Transaction;
import models.User;
import enums.Currency;
import services.ConversionCalculationImpl;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Transaction> transactions = new ArrayList<>();
    private static int transactionIdCounter = 1;

    public static void main(String[] args) {
        ConversionCalculationImpl conversionService = new ConversionCalculationImpl();

        User user1 = new User("John", "Doe", "RO01XXXX");

        processPayment(new Payment(100, Currency.USD, user1, "Shopping"), conversionService);
        processPayment(new Payment(200, Currency.GBP, user1, "Books"), conversionService);

        stornTransaction(1);

        System.out.println("All Transactions:");
        transactions.forEach(t -> System.out.println("Transaction ID: " + t.getId() + ", User: " + t.getPayment().getUser().getFirstName() + ", Amount: " + t.getAmount() + " EUR, RefNmb: " + t.getRefNmb()));

        System.out.println("\nCountries/Zones for payments:");
        transactions.stream()
                .map(t -> t.getPayment().getCurrency().getCountryName())
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nTransactions for User: " + user1.getFirstName() + " " + user1.getLastName());
        transactions.stream()
                .filter(t -> t.getPayment().getUser().equals(user1))
                .forEach(t -> System.out.println("Transaction ID: " + t.getId() + ", Initial Amount: " + t.getPayment().getAmount() + " " + t.getPayment().getCurrency() + ", Converted Amount: " + t.getAmount() + " EUR"));
    }

    private static void processPayment(Payment payment, ConversionCalculationImpl conversionService) {
        double convertedAmount = conversionService.convertCurrencyToEur(payment.getAmount(), payment.getCurrency());
        payment.setAmount(convertedAmount);
        Transaction transaction = new Transaction(transactionIdCounter++, payment);
        transactions.add(transaction);
    }

    private static void stornTransaction(int originalTransactionId) {
        Transaction originalTransaction = transactions.stream()
                .filter(t -> t.getId() == originalTransactionId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Transaction not found"));

        Transaction stornoTransaction = originalTransaction.clone();
        stornoTransaction.getPayment().setAmount(-originalTransaction.getPayment().getAmount());
        stornoTransaction.setRefNmb(Integer.toString(originalTransaction.getId()));
        transactions.add(stornoTransaction);
    }
}
