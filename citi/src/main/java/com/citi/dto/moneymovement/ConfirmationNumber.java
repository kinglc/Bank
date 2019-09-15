package com.citi.dto.moneymovement;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class ConfirmationNumber {
    private SourceAccountBean sourceAccount;
    private DestinationAccountBean destinationAccount;
    private String transactionReferenceId;

    public SourceAccountBean getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(SourceAccountBean sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public DestinationAccountBean getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(DestinationAccountBean destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }

    public static class SourceAccountBean {
        private String displaySourceAccountNumber;
        private double sourceAccountAvailableBalance;
        private String sourceCurrencyCode;

        public String getDisplaySourceAccountNumber() {
            return displaySourceAccountNumber;
        }

        public void setDisplaySourceAccountNumber(String displaySourceAccountNumber) {
            this.displaySourceAccountNumber = displaySourceAccountNumber;
        }

        public double getSourceAccountAvailableBalance() {
            return sourceAccountAvailableBalance;
        }

        public void setSourceAccountAvailableBalance(double sourceAccountAvailableBalance) {
            this.sourceAccountAvailableBalance = sourceAccountAvailableBalance;
        }

        public String getSourceCurrencyCode() {
            return sourceCurrencyCode;
        }

        public void setSourceCurrencyCode(String sourceCurrencyCode) {
            this.sourceCurrencyCode = sourceCurrencyCode;
        }
    }

    public static class DestinationAccountBean {
        private String displayDestinationAccountNumber;
        private int destinationAccountAvailableBalance;
        private String destinationCurrencyCode;

        public String getDisplayDestinationAccountNumber() {
            return displayDestinationAccountNumber;
        }

        public void setDisplayDestinationAccountNumber(String displayDestinationAccountNumber) {
            this.displayDestinationAccountNumber = displayDestinationAccountNumber;
        }

        public int getDestinationAccountAvailableBalance() {
            return destinationAccountAvailableBalance;
        }

        public void setDestinationAccountAvailableBalance(int destinationAccountAvailableBalance) {
            this.destinationAccountAvailableBalance = destinationAccountAvailableBalance;
        }

        public String getDestinationCurrencyCode() {
            return destinationCurrencyCode;
        }

        public void setDestinationCurrencyCode(String destinationCurrencyCode) {
            this.destinationCurrencyCode = destinationCurrencyCode;
        }
    }
}
