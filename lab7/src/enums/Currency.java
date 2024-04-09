package enums;

public enum Currency {
    USD("United States", "US"),
    RON("Romania", "RO"),
    EUR("European Union", "EU"),
    GBP("Great Britain", "GB");

    private final String countryName;
    private final String countryCode;

    Currency(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
