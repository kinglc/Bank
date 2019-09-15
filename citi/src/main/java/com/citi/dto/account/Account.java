package com.citi.dto.account;

/**
 * @author: YanWenjiang
 * @date: 19/9/9
 * @descriptions:
 */
public class Account {

    private AccountGroupSummaryBean accountGroupSummary;
    private String nextStartIndex;

    public AccountGroupSummaryBean getAccountGroupSummary() {
        return accountGroupSummary;
    }

    public void setAccountGroupSummary(AccountGroupSummaryBean accountGroupSummary) {
        this.accountGroupSummary = accountGroupSummary;
    }

    public String getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(String nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    public static class AccountGroupSummaryBean {

        private String accountGroup;
        private AccountsBean accounts;
        private InsurancePoliciesBean insurancePolicies;
        private TotalCurrentBalanceBean totalCurrentBalance;
        private TotalAvailableBalanceBean totalAvailableBalance;
        private TotalOutstandingBalanceBean totalOutstandingBalance;

        public String getAccountGroup() {
            return accountGroup;
        }

        public void setAccountGroup(String accountGroup) {
            this.accountGroup = accountGroup;
        }

        public AccountsBean getAccounts() {
            return accounts;
        }

        public void setAccounts(AccountsBean accounts) {
            this.accounts = accounts;
        }

        public InsurancePoliciesBean getInsurancePolicies() {
            return insurancePolicies;
        }

        public void setInsurancePolicies(InsurancePoliciesBean insurancePolicies) {
            this.insurancePolicies = insurancePolicies;
        }

        public TotalCurrentBalanceBean getTotalCurrentBalance() {
            return totalCurrentBalance;
        }

        public void setTotalCurrentBalance(TotalCurrentBalanceBean totalCurrentBalance) {
            this.totalCurrentBalance = totalCurrentBalance;
        }

        public TotalAvailableBalanceBean getTotalAvailableBalance() {
            return totalAvailableBalance;
        }

        public void setTotalAvailableBalance(TotalAvailableBalanceBean totalAvailableBalance) {
            this.totalAvailableBalance = totalAvailableBalance;
        }

        public TotalOutstandingBalanceBean getTotalOutstandingBalance() {
            return totalOutstandingBalance;
        }

        public void setTotalOutstandingBalance(TotalOutstandingBalanceBean totalOutstandingBalance) {
            this.totalOutstandingBalance = totalOutstandingBalance;
        }

        public static class AccountsBean {

            private Object checkingAccountSummary;
            private Object savingsAccountSummary;
            private Object creditCardAccountSummary;
            private Object readyCreditAccountSummary;
            private Object loanAccountSummary;
            private Object mutualFundAccountSummary;
            private Object securitiesBrokerageAccountSummary;
            private Object callDepositAccountSummary;
            private Object premiumDepositAccountSummary;
            private Object timeDepositAccountSummary;

            public Object getCheckingAccountSummary() {
                return checkingAccountSummary;
            }

            public void setCheckingAccountSummary(Object checkingAccountSummary) {
                this.checkingAccountSummary = checkingAccountSummary;
            }

            public Object getSavingsAccountSummary() {
                return savingsAccountSummary;
            }

            public void setSavingsAccountSummary(Object savingsAccountSummary) {
                this.savingsAccountSummary = savingsAccountSummary;
            }

            public Object getCreditCardAccountSummary() {
                return creditCardAccountSummary;
            }

            public void setCreditCardAccountSummary(Object creditCardAccountSummary) {
                this.creditCardAccountSummary = creditCardAccountSummary;
            }

            public Object getReadyCreditAccountSummary() {
                return readyCreditAccountSummary;
            }

            public void setReadyCreditAccountSummary(Object readyCreditAccountSummary) {
                this.readyCreditAccountSummary = readyCreditAccountSummary;
            }

            public Object getLoanAccountSummary() {
                return loanAccountSummary;
            }

            public void setLoanAccountSummary(Object loanAccountSummary) {
                this.loanAccountSummary = loanAccountSummary;
            }

            public Object getMutualFundAccountSummary() {
                return mutualFundAccountSummary;
            }

            public void setMutualFundAccountSummary(Object mutualFundAccountSummary) {
                this.mutualFundAccountSummary = mutualFundAccountSummary;
            }

            public Object getSecuritiesBrokerageAccountSummary() {
                return securitiesBrokerageAccountSummary;
            }

            public void setSecuritiesBrokerageAccountSummary(Object securitiesBrokerageAccountSummary) {
                this.securitiesBrokerageAccountSummary = securitiesBrokerageAccountSummary;
            }

            public Object getCallDepositAccountSummary() {
                return callDepositAccountSummary;
            }

            public void setCallDepositAccountSummary(Object callDepositAccountSummary) {
                this.callDepositAccountSummary = callDepositAccountSummary;
            }

            public Object getPremiumDepositAccountSummary() {
                return premiumDepositAccountSummary;
            }

            public void setPremiumDepositAccountSummary(Object premiumDepositAccountSummary) {
                this.premiumDepositAccountSummary = premiumDepositAccountSummary;
            }

            public Object getTimeDepositAccountSummary() {
                return timeDepositAccountSummary;
            }

            public void setTimeDepositAccountSummary(Object timeDepositAccountSummary) {
                this.timeDepositAccountSummary = timeDepositAccountSummary;
            }
        }

        public static class InsurancePoliciesBean {

            private String productName;
            private String productCode;
            private String displayAccountNumber;
            private String currencyCode;
            private String accountClassification;
            private String accountStatus;
            private String displayPolicyNumber;
            private String insuranceApplicationId;
            private Double insuranceSumAssuredAmount;
            private Double totalPremiumPaidAmount;

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public String getProductCode() {
                return productCode;
            }

            public void setProductCode(String productCode) {
                this.productCode = productCode;
            }

            public String getDisplayAccountNumber() {
                return displayAccountNumber;
            }

            public void setDisplayAccountNumber(String displayAccountNumber) {
                this.displayAccountNumber = displayAccountNumber;
            }

            public String getCurrencyCode() {
                return currencyCode;
            }

            public void setCurrencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
            }

            public String getAccountClassification() {
                return accountClassification;
            }

            public void setAccountClassification(String accountClassification) {
                this.accountClassification = accountClassification;
            }

            public String getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
            }

            public String getDisplayPolicyNumber() {
                return displayPolicyNumber;
            }

            public void setDisplayPolicyNumber(String displayPolicyNumber) {
                this.displayPolicyNumber = displayPolicyNumber;
            }

            public String getInsuranceApplicationId() {
                return insuranceApplicationId;
            }

            public void setInsuranceApplicationId(String insuranceApplicationId) {
                this.insuranceApplicationId = insuranceApplicationId;
            }

            public Double getInsuranceSumAssuredAmount() {
                return insuranceSumAssuredAmount;
            }

            public void setInsuranceSumAssuredAmount(Double insuranceSumAssuredAmount) {
                this.insuranceSumAssuredAmount = insuranceSumAssuredAmount;
            }

            public Double getTotalPremiumPaidAmount() {
                return totalPremiumPaidAmount;
            }

            public void setTotalPremiumPaidAmount(Double totalPremiumPaidAmount) {
                this.totalPremiumPaidAmount = totalPremiumPaidAmount;
            }
        }

        public static class TotalCurrentBalanceBean {

            private String localCurrencyCode;
            private Double localCurrencyBalanceAmount;
            private String foreignCurrencyCode;
            private Double foreignCurrencyBalanceAmount;

            public String getLocalCurrencyCode() {
                return localCurrencyCode;
            }

            public void setLocalCurrencyCode(String localCurrencyCode) {
                this.localCurrencyCode = localCurrencyCode;
            }

            public Double getLocalCurrencyBalanceAmount() {
                return localCurrencyBalanceAmount;
            }

            public void setLocalCurrencyBalanceAmount(Double localCurrencyBalanceAmount) {
                this.localCurrencyBalanceAmount = localCurrencyBalanceAmount;
            }

            public String getForeignCurrencyCode() {
                return foreignCurrencyCode;
            }

            public void setForeignCurrencyCode(String foreignCurrencyCode) {
                this.foreignCurrencyCode = foreignCurrencyCode;
            }

            public Double getForeignCurrencyBalanceAmount() {
                return foreignCurrencyBalanceAmount;
            }

            public void setForeignCurrencyBalanceAmount(Double foreignCurrencyBalanceAmount) {
                this.foreignCurrencyBalanceAmount = foreignCurrencyBalanceAmount;
            }
        }

        public static class TotalAvailableBalanceBean {

            private String localCurrencyCode;
            private Double localCurrencyBalanceAmount;
            private String foreignCurrencyCode;
            private Double foreignCurrencyBalanceAmount;

            public String getLocalCurrencyCode() {
                return localCurrencyCode;
            }

            public void setLocalCurrencyCode(String localCurrencyCode) {
                this.localCurrencyCode = localCurrencyCode;
            }

            public Double getLocalCurrencyBalanceAmount() {
                return localCurrencyBalanceAmount;
            }

            public void setLocalCurrencyBalanceAmount(Double localCurrencyBalanceAmount) {
                this.localCurrencyBalanceAmount = localCurrencyBalanceAmount;
            }

            public String getForeignCurrencyCode() {
                return foreignCurrencyCode;
            }

            public void setForeignCurrencyCode(String foreignCurrencyCode) {
                this.foreignCurrencyCode = foreignCurrencyCode;
            }

            public Double getForeignCurrencyBalanceAmount() {
                return foreignCurrencyBalanceAmount;
            }

            public void setForeignCurrencyBalanceAmount(Double foreignCurrencyBalanceAmount) {
                this.foreignCurrencyBalanceAmount = foreignCurrencyBalanceAmount;
            }
        }

        public static class TotalOutstandingBalanceBean {

            private String localCurrencyCode;
            private double localCurrencyBalanceAmount;
            private String foreignCurrencyCode;
            private double foreignCurrencyBalanceAmount;

            public String getLocalCurrencyCode() {
                return localCurrencyCode;
            }

            public void setLocalCurrencyCode(String localCurrencyCode) {
                this.localCurrencyCode = localCurrencyCode;
            }

            public double getLocalCurrencyBalanceAmount() {
                return localCurrencyBalanceAmount;
            }

            public void setLocalCurrencyBalanceAmount(double localCurrencyBalanceAmount) {
                this.localCurrencyBalanceAmount = localCurrencyBalanceAmount;
            }

            public String getForeignCurrencyCode() {
                return foreignCurrencyCode;
            }

            public void setForeignCurrencyCode(String foreignCurrencyCode) {
                this.foreignCurrencyCode = foreignCurrencyCode;
            }

            public double getForeignCurrencyBalanceAmount() {
                return foreignCurrencyBalanceAmount;
            }

            public void setForeignCurrencyBalanceAmount(double foreignCurrencyBalanceAmount) {
                this.foreignCurrencyBalanceAmount = foreignCurrencyBalanceAmount;
            }
        }
    }
}
