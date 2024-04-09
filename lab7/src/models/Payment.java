    package models;
    import enums.Currency;

    public class Payment implements Cloneable {
        private double amount;
        private Currency currency;
        private User user;
        private String purpose;


        public Payment(double amount, Currency currency, User user, String purpose) {
            this.amount = amount;
            this.currency = currency;
            this.user = user;
            this.purpose = purpose;
        }

        public double getAmount() {
            return amount;
        }

        public Currency getCurrency() {
            return currency;
        }

        public User getUser() {
            return user;
        }

        public String getPurpose() {
            return purpose;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public void setPurpose(String purpose) {
            this.purpose = purpose;
        }


        public Payment clone() {
            try {
                return (Payment) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public String toString() {
            return "Payment{" +
                    "amount=" + amount +
                    ", currency=" + currency +
                    ", user=" + user +
                    ", purpose='" + purpose + '\'' +
                    '}';
        }

    }
