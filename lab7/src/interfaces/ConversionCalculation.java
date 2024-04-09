package interfaces;

import enums.Currency;

public interface ConversionCalculation {
    double convertCurrencyToEur(double amount, Currency currency);
    void calculateRate();
}
