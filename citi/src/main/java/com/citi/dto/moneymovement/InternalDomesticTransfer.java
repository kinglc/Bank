package com.citi.dto.moneymovement;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class InternalDomesticTransfer {
    private SourceAccountsBean sourceAccounts;
    private PayeeSourceAccountCombinationsBean payeeSourceAccountCombinations;
    private String nextStartIndex;

    public SourceAccountsBean getSourceAccounts() {
        return sourceAccounts;
    }

    public void setSourceAccounts(SourceAccountsBean sourceAccounts) {
        this.sourceAccounts = sourceAccounts;
    }

    public PayeeSourceAccountCombinationsBean getPayeeSourceAccountCombinations() {
        return payeeSourceAccountCombinations;
    }

    public void setPayeeSourceAccountCombinations(PayeeSourceAccountCombinationsBean payeeSourceAccountCombinations) {
        this.payeeSourceAccountCombinations = payeeSourceAccountCombinations;
    }

    public String getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(String nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    public static class SourceAccountsBean {
        private String sourceAccountId;
        private String displaySourceAccountNumber;
        private String sourceAccountCurrencyCode;
        private String accountGroup;
        private double availableBalance;
        private double nextPaymentAmount;
        private String accountNickName;
        private String productName;

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

        public String getAccountNickName() {
            return accountNickName;
        }

        public void setAccountNickName(String accountNickName) {
            this.accountNickName = accountNickName;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
    }

    public static class PayeeSourceAccountCombinationsBean {
        private String payeeId;
        private String displayPayeeAccountNumber;
        private String payeeAccountCurrencyCode;
        private String payeeNickName;
        private SourceAccountIdsBean sourceAccountIds;

        public String getPayeeId() {
            return payeeId;
        }

        public void setPayeeId(String payeeId) {
            this.payeeId = payeeId;
        }

        public String getDisplayPayeeAccountNumber() {
            return displayPayeeAccountNumber;
        }

        public void setDisplayPayeeAccountNumber(String displayPayeeAccountNumber) {
            this.displayPayeeAccountNumber = displayPayeeAccountNumber;
        }

        public String getPayeeAccountCurrencyCode() {
            return payeeAccountCurrencyCode;
        }

        public void setPayeeAccountCurrencyCode(String payeeAccountCurrencyCode) {
            this.payeeAccountCurrencyCode = payeeAccountCurrencyCode;
        }

        public String getPayeeNickName() {
            return payeeNickName;
        }

        public void setPayeeNickName(String payeeNickName) {
            this.payeeNickName = payeeNickName;
        }

        public SourceAccountIdsBean getSourceAccountIds() {
            return sourceAccountIds;
        }

        public void setSourceAccountIds(SourceAccountIdsBean sourceAccountIds) {
            this.sourceAccountIds = sourceAccountIds;
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
