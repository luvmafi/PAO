package services;

import interfaces.ConversionCalculation;
import enums.Currency;

public class ConversionCalculationImpl implements ConversionCalculation {

    @Override
    public double convertCurrencyToEur(double amount, Currency currency) {
        double bani;
        switch (currency) {
            case USD->
                bani = amount * 0.92;
            case GBP->
                bani = amount * 1.18;
            case RON->
                bani= amount * 0.20;
            case EUR->
                bani = amount;
            default->
                throw new IllegalArgumentException("Valuta necunoscuta: " + currency);
        }
        return bani;
    }


}
