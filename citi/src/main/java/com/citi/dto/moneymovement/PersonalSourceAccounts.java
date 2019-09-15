package com.citi.dto.moneymovement;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class PersonalSourceAccounts {
    private SourceAccountsBean sourceAccounts;
    private DestinationSourceAcctCombinationsBean destinationSourceAcctCombinations;

    public SourceAccountsBean getSourceAccounts() {
        return sourceAccounts;
    }

    public void setSourceAccounts(SourceAccountsBean sourceAccounts) {
        this.sourceAccounts = sourceAccounts;
    }

    public DestinationSourceAcctCombinationsBean getDestinationSourceAcctCombinations() {
        return destinationSourceAcctCombinations;
    }

    public void setDestinationSourceAcctCombinations(DestinationSourceAcctCombinationsBean destinationSourceAcctCombinations) {
        this.destinationSourceAcctCombinations = destinationSourceAcctCombinations;
    }

    public static class SourceAccountsBean {
        private String sourceAccountId;
        private String displaySourceAccountNumber;
        private String sourceAccountCurrencyCode;
        private String accountGroup;
        private double availableBalance;
        private double nextPaymentAmount;
        private String productName;
        private String accountNickName;

        public String getSourceAccountId() {
            return sourceAccountId;
        }

        public void setSourceAccountId(String sourceAccountId) {
            this.sourceAccountId = sourceAccountId;
        }

        public String getDisplaySourceAccountNumber() {
            return displaySourceAccountNumber;
        }

        public void setDisplaySourceAccountNumber(String displaySourceAccountNumber) {
            this.displaySourceAccountNumber = displaySourceAccountNumber;
        }

        public String getSourceAccountCurrencyCode() {
            return sourceAccountCurrencyCode;
        }

        public void setSourceAccountCurrencyCode(String sourceAccountCurrencyCode) {
            this.sourceAccountCurrencyCode = sourceAccountCurrencyCode;
        }

        public String getAccountGroup() {
            return accountGroup;
        }

        public void setAccountGroup(String accountGroup) {
            this.accountGroup = accountGroup;
        }

        public double getAvailableBalance() {
            return availableBalance;
        }

        public void setAvailableBalance(double availableBalance) {
            this.availableBalance = availableBalance;
        }

        public double getNextPaymentAmount() {
            return nextPaymentAmount;
        }

        public void setNextPaymentAmount(double nextPaymentAmount) {
            this.nextPaymentAmount = nextPaymentAmount;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getAccountNickName() {
            return accountNickName;
        }

        public void setAccountNickName(String accountNickName) {
            this.accountNickName = accountNickName;
        }
    }

    public static class DestinationSourceAcctCombinationsBean {
        private String destinationAccountId;
        private String displayDestinationAccountNumber;
        private String destinationAccountCurrencyCode;
        private String availableBalance;
        private String nextPaymentAmount;
        private String outstandingBalance;
        private String minimumDueAmount;
        private String lastStatementDate;
        private String paymentDueDate;
        private SourceAccountIdsBean sourceAccountIds;
        private String productName;
        private String accountNickName;

        public String getDestinationAccountId() {
            return destinationAccountId;
        }

        public void setDestinationAccountId(String destinationAccountId) {
            this.destinationAccountId = destinationAccountId;
        }

        public String getDisplayDestinationAccountNumber() {
            return displayDestinationAccountNumber;
        }

        public void setDisplayDestinationAccountNumber(String displayDestinationAccountNumber) {
            this.displayDestinationAccountNumber = displayDestinationAccountNumber;
        }

        public String getDestinationAccountCurrencyCode() {
            return destinationAccountCurrencyCode;
        }

        public void setDestinationAccountCurrencyCode(String destinationAccountCurrencyCode) {
            this.destinationAccountCurrencyCode = destinationAccountCurrencyCode;
        }

        public String getAvailableBalance() {
            return availableBalance;
        }

        public void setAvailableBalance(String availableBalance) {
            this.availableBalance = availableBalance;
        }

        public String getNextPaymentAmount() {
            return nextPaymentAmount;
        }

        public void setNextPaymentAmount(String nextPaymentAmount) {
            this.nextPaymentAmount = nextPaymentAmount;
        }

        public String getOutstandingBalance() {
            return outstandingBalance;
        }

        public void setOutstandingBalance(String outstandingBalance) {
            this.outstandingBalance = outstandingBalance;
        }

        public String getMinimumDueAmount() {
            return minimumDueAmount;
        }

        public void setMinimumDueAmount(String minimumDueAmount) {
            this.minimumDueAmount = minimumDueAmount;
        }

        public String getLastStatementDate() {
            return lastStatementDate;
        }

        public void setLastStatementDate(String lastStatementDate) {
            this.lastStatementDate = lastStatementDate;
        }

        public String getPaymentDueDate() {
            return paymentDueDate;
        }

        public void setPaymentDueDate(String paymentDueDate) {
            this.paymentDueDate = paymentDueDate;
        }

        public SourceAccountIdsBean getSourceAccountIds() {
            return sourceAccountIds;
        }

        public void setSourceAccountIds(SourceAccountIdsBean sourceAccountIds) {
            this.sourceAccountIds = sourceAccountIds;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getAccountNickName() {
            return accountNickName;
        }

        public void setAccountNickName(String accountNickName) {
            this.accountNickName = accountNickName;
        }

        public static class SourceAccountIdsBean {
            private String sourceAccountId;

            public String getSourceAccountId() {
                return sourceAccountId;
            }

            public void setSourceAccountId(String sourceAccountId) {
                this.sourceAccountId = sourceAccountId;
            }
        }
    }
}
