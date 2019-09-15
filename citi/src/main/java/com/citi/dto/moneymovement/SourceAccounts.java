package com.citi.dto.moneymovement;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class SourceAccounts {
    private SourceAccountsBean sourceAccounts;
    private PayeeSourceAccountCombinationsBean payeeSourceAccountCombinations;
    private DestinationSourceAcctCombinationsBean destinationSourceAcctCombinations;
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

    public DestinationSourceAcctCombinationsBean getDestinationSourceAcctCombinations() {
        return destinationSourceAcctCombinations;
    }

    public void setDestinationSourceAcctCombinations(DestinationSourceAcctCombinationsBean destinationSourceAcctCombinations) {
        this.destinationSourceAcctCombinations = destinationSourceAcctCombinations;
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

    public static class PayeeSourceAccountCombinationsBean {
        private String payeeId;
        private String displayPayeeAccountNumber;
        private String payeeAccountCurrencyCode;
        private String payeeNickName;
        private BankDetailsBean bankDetails;
        private String paymentType;
        private PaymentMethodsBean paymentMethods;
        private String merchantNumber;
        private String payeeName;
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

        public BankDetailsBean getBankDetails() {
            return bankDetails;
        }

        public void setBankDetails(BankDetailsBean bankDetails) {
            this.bankDetails = bankDetails;
        }

        public String getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(String paymentType) {
            this.paymentType = paymentType;
        }

        public PaymentMethodsBean getPaymentMethods() {
            return paymentMethods;
        }

        public void setPaymentMethods(PaymentMethodsBean paymentMethods) {
            this.paymentMethods = paymentMethods;
        }

        public String getMerchantNumber() {
            return merchantNumber;
        }

        public void setMerchantNumber(String merchantNumber) {
            this.merchantNumber = merchantNumber;
        }

        public String getPayeeName() {
            return payeeName;
        }

        public void setPayeeName(String payeeName) {
            this.payeeName = payeeName;
        }

        public SourceAccountIdsBean getSourceAccountIds() {
            return sourceAccountIds;
        }

        public void setSourceAccountIds(SourceAccountIdsBean sourceAccountIds) {
            this.sourceAccountIds = sourceAccountIds;
        }

        public static class BankDetailsBean {
            private String bankCode;
            private String bankName;

            public String getBankCode() {
                return bankCode;
            }

            public void setBankCode(String bankCode) {
                this.bankCode = bankCode;
            }

            public String getBankName() {
                return bankName;
            }

            public void setBankName(String bankName) {
                this.bankName = bankName;
            }
        }

        public static class PaymentMethodsBean {
            private String paymentMethod;

            public String getPaymentMethod() {
                return paymentMethod;
            }

            public void setPaymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
            }
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

    public static class DestinationSourceAcctCombinationsBean {
        private String destinationAccountId;
        private String displayDestinationAccountNumber;
        private String destinationAccountCurrencyCode;
        private String productName;
        private double availableBalance;
        private double nextPaymentAmount;
        private double outstandingBalance;
        private double minimumDueAmount;
        private String lastStatementDate;
        private String paymentDueDate;
        private SourceAccountIdsBeanX sourceAccountIds;
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

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
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

        public double getOutstandingBalance() {
            return outstandingBalance;
        }

        public void setOutstandingBalance(double outstandingBalance) {
            this.outstandingBalance = outstandingBalance;
        }

        public double getMinimumDueAmount() {
            return minimumDueAmount;
        }

        public void setMinimumDueAmount(double minimumDueAmount) {
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

        public SourceAccountIdsBeanX getSourceAccountIds() {
            return sourceAccountIds;
        }

        public void setSourceAccountIds(SourceAccountIdsBeanX sourceAccountIds) {
            this.sourceAccountIds = sourceAccountIds;
        }

        public String getAccountNickName() {
            return accountNickName;
        }

        public void setAccountNickName(String accountNickName) {
            this.accountNickName = accountNickName;
        }

        public static class SourceAccountIdsBeanX {
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
