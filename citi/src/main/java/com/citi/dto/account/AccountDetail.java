package com.citi.dto.account;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class AccountDetail {

    private CreditCardAccountBean creditCardAccount;
    private ReadyCreditAccountBean readyCreditAccount;
    private CheckingAccountBean checkingAccount;
    private SavingsAccountBean savingsAccount;
    private TimeDepositAccountBean timeDepositAccount;
    private LoanAccountBean loanAccount;
    private MutualFundAccountBean mutualFundAccount;
    private SecuritiesBrokerageAccountBean securitiesBrokerageAccount;
    private CallDepositAccountBean callDepositAccount;
    private PremiumDepositAccountBean premiumDepositAccount;

    public CreditCardAccountBean getCreditCardAccount() {
        return creditCardAccount;
    }

    public void setCreditCardAccount(CreditCardAccountBean creditCardAccount) {
        this.creditCardAccount = creditCardAccount;
    }

    public ReadyCreditAccountBean getReadyCreditAccount() {
        return readyCreditAccount;
    }

    public void setReadyCreditAccount(ReadyCreditAccountBean readyCreditAccount) {
        this.readyCreditAccount = readyCreditAccount;
    }

    public CheckingAccountBean getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccountBean checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public SavingsAccountBean getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccountBean savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public TimeDepositAccountBean getTimeDepositAccount() {
        return timeDepositAccount;
    }

    public void setTimeDepositAccount(TimeDepositAccountBean timeDepositAccount) {
        this.timeDepositAccount = timeDepositAccount;
    }

    public LoanAccountBean getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(LoanAccountBean loanAccount) {
        this.loanAccount = loanAccount;
    }

    public MutualFundAccountBean getMutualFundAccount() {
        return mutualFundAccount;
    }

    public void setMutualFundAccount(MutualFundAccountBean mutualFundAccount) {
        this.mutualFundAccount = mutualFundAccount;
    }

    public SecuritiesBrokerageAccountBean getSecuritiesBrokerageAccount() {
        return securitiesBrokerageAccount;
    }

    public void setSecuritiesBrokerageAccount(SecuritiesBrokerageAccountBean securitiesBrokerageAccount) {
        this.securitiesBrokerageAccount = securitiesBrokerageAccount;
    }

    public CallDepositAccountBean getCallDepositAccount() {
        return callDepositAccount;
    }

    public void setCallDepositAccount(CallDepositAccountBean callDepositAccount) {
        this.callDepositAccount = callDepositAccount;
    }

    public PremiumDepositAccountBean getPremiumDepositAccount() {
        return premiumDepositAccount;
    }

    public void setPremiumDepositAccount(PremiumDepositAccountBean premiumDepositAccount) {
        this.premiumDepositAccount = premiumDepositAccount;
    }

    public static class CreditCardAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private String currencyCode;
        private double outstandingBalance;
        private double lastStatementBalance;
        private String lastStatementDate;
        private double creditUsed;
        private double creditLimit;
        private double availableCredit;
        private double cashAdvanceLimit;
        private double cashAdvanceAvailableAmount;
        private double lastPaymentAmount;
        private String lastPaymentDate;
        private double minimumDueAmount;
        private String paymentDueDate;
        private double availablePointBalance;

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

        public double getOutstandingBalance() {
            return outstandingBalance;
        }

        public void setOutstandingBalance(double outstandingBalance) {
            this.outstandingBalance = outstandingBalance;
        }

        public double getLastStatementBalance() {
            return lastStatementBalance;
        }

        public void setLastStatementBalance(double lastStatementBalance) {
            this.lastStatementBalance = lastStatementBalance;
        }

        public String getLastStatementDate() {
            return lastStatementDate;
        }

        public void setLastStatementDate(String lastStatementDate) {
            this.lastStatementDate = lastStatementDate;
        }

        public double getCreditUsed() {
            return creditUsed;
        }

        public void setCreditUsed(double creditUsed) {
            this.creditUsed = creditUsed;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public void setCreditLimit(double creditLimit) {
            this.creditLimit = creditLimit;
        }

        public double getAvailableCredit() {
            return availableCredit;
        }

        public void setAvailableCredit(double availableCredit) {
            this.availableCredit = availableCredit;
        }

        public double getCashAdvanceLimit() {
            return cashAdvanceLimit;
        }

        public void setCashAdvanceLimit(double cashAdvanceLimit) {
            this.cashAdvanceLimit = cashAdvanceLimit;
        }

        public double getCashAdvanceAvailableAmount() {
            return cashAdvanceAvailableAmount;
        }

        public void setCashAdvanceAvailableAmount(double cashAdvanceAvailableAmount) {
            this.cashAdvanceAvailableAmount = cashAdvanceAvailableAmount;
        }

        public double getLastPaymentAmount() {
            return lastPaymentAmount;
        }

        public void setLastPaymentAmount(double lastPaymentAmount) {
            this.lastPaymentAmount = lastPaymentAmount;
        }

        public String getLastPaymentDate() {
            return lastPaymentDate;
        }

        public void setLastPaymentDate(String lastPaymentDate) {
            this.lastPaymentDate = lastPaymentDate;
        }

        public double getMinimumDueAmount() {
            return minimumDueAmount;
        }

        public void setMinimumDueAmount(double minimumDueAmount) {
            this.minimumDueAmount = minimumDueAmount;
        }

        public String getPaymentDueDate() {
            return paymentDueDate;
        }

        public void setPaymentDueDate(String paymentDueDate) {
            this.paymentDueDate = paymentDueDate;
        }

        public double getAvailablePointBalance() {
            return availablePointBalance;
        }

        public void setAvailablePointBalance(double availablePointBalance) {
            this.availablePointBalance = availablePointBalance;
        }
    }

    public static class ReadyCreditAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private String currencyCode;
        private double outstandingBalance;
        private double lastStatementBalance;
        private String lastStatementDate;
        private double minimumDueAmount;
        private double creditLimit;
        private double availableCredit;
        private double cashAdvanceLimit;
        private double cashAdvanceAvailableAmount;
        private double lastPaymentAmount;
        private String lastPaymentDate;
        private double nextPaymentAmount;
        private String nextPaymentDate;

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

        public double getOutstandingBalance() {
            return outstandingBalance;
        }

        public void setOutstandingBalance(double outstandingBalance) {
            this.outstandingBalance = outstandingBalance;
        }

        public double getLastStatementBalance() {
            return lastStatementBalance;
        }

        public void setLastStatementBalance(double lastStatementBalance) {
            this.lastStatementBalance = lastStatementBalance;
        }

        public String getLastStatementDate() {
            return lastStatementDate;
        }

        public void setLastStatementDate(String lastStatementDate) {
            this.lastStatementDate = lastStatementDate;
        }

        public double getMinimumDueAmount() {
            return minimumDueAmount;
        }

        public void setMinimumDueAmount(double minimumDueAmount) {
            this.minimumDueAmount = minimumDueAmount;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public void setCreditLimit(double creditLimit) {
            this.creditLimit = creditLimit;
        }

        public double getAvailableCredit() {
            return availableCredit;
        }

        public void setAvailableCredit(double availableCredit) {
            this.availableCredit = availableCredit;
        }

        public double getCashAdvanceLimit() {
            return cashAdvanceLimit;
        }

        public void setCashAdvanceLimit(double cashAdvanceLimit) {
            this.cashAdvanceLimit = cashAdvanceLimit;
        }

        public double getCashAdvanceAvailableAmount() {
            return cashAdvanceAvailableAmount;
        }

        public void setCashAdvanceAvailableAmount(double cashAdvanceAvailableAmount) {
            this.cashAdvanceAvailableAmount = cashAdvanceAvailableAmount;
        }

        public double getLastPaymentAmount() {
            return lastPaymentAmount;
        }

        public void setLastPaymentAmount(double lastPaymentAmount) {
            this.lastPaymentAmount = lastPaymentAmount;
        }

        public String getLastPaymentDate() {
            return lastPaymentDate;
        }

        public void setLastPaymentDate(String lastPaymentDate) {
            this.lastPaymentDate = lastPaymentDate;
        }

        public double getNextPaymentAmount() {
            return nextPaymentAmount;
        }

        public void setNextPaymentAmount(double nextPaymentAmount) {
            this.nextPaymentAmount = nextPaymentAmount;
        }

        public String getNextPaymentDate() {
            return nextPaymentDate;
        }

        public void setNextPaymentDate(String nextPaymentDate) {
            this.nextPaymentDate = nextPaymentDate;
        }
    }

    public static class CheckingAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private double currentBalance;
        private double availableBalance;
        private double overdraftLimit;
        private double availableOverdraftLimit;
        private String currencyCode;
        private String lastStatementDate;
        private double holdAmount;
        private double floatAmount;
        private double totalInterestAmount;
        private String openingDate;

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

        public double getCurrentBalance() {
            return currentBalance;
        }

        public void setCurrentBalance(double currentBalance) {
            this.currentBalance = currentBalance;
        }

        public double getAvailableBalance() {
            return availableBalance;
        }

        public void setAvailableBalance(double availableBalance) {
            this.availableBalance = availableBalance;
        }

        public double getOverdraftLimit() {
            return overdraftLimit;
        }

        public void setOverdraftLimit(double overdraftLimit) {
            this.overdraftLimit = overdraftLimit;
        }

        public double getAvailableOverdraftLimit() {
            return availableOverdraftLimit;
        }

        public void setAvailableOverdraftLimit(double availableOverdraftLimit) {
            this.availableOverdraftLimit = availableOverdraftLimit;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getLastStatementDate() {
            return lastStatementDate;
        }

        public void setLastStatementDate(String lastStatementDate) {
            this.lastStatementDate = lastStatementDate;
        }

        public double getHoldAmount() {
            return holdAmount;
        }

        public void setHoldAmount(double holdAmount) {
            this.holdAmount = holdAmount;
        }

        public double getFloatAmount() {
            return floatAmount;
        }

        public void setFloatAmount(double floatAmount) {
            this.floatAmount = floatAmount;
        }

        public double getTotalInterestAmount() {
            return totalInterestAmount;
        }

        public void setTotalInterestAmount(double totalInterestAmount) {
            this.totalInterestAmount = totalInterestAmount;
        }

        public String getOpeningDate() {
            return openingDate;
        }

        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
        }
    }

    public static class SavingsAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private double currentBalance;
        private double availableBalance;
        private String currencyCode;
        private String lastStatementDate;
        private double holdAmount;
        private String openingDate;
        private double floatAmount;
        private double totalInterestAmount;

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

        public double getCurrentBalance() {
            return currentBalance;
        }

        public void setCurrentBalance(double currentBalance) {
            this.currentBalance = currentBalance;
        }

        public double getAvailableBalance() {
            return availableBalance;
        }

        public void setAvailableBalance(double availableBalance) {
            this.availableBalance = availableBalance;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getLastStatementDate() {
            return lastStatementDate;
        }

        public void setLastStatementDate(String lastStatementDate) {
            this.lastStatementDate = lastStatementDate;
        }

        public double getHoldAmount() {
            return holdAmount;
        }

        public void setHoldAmount(double holdAmount) {
            this.holdAmount = holdAmount;
        }

        public String getOpeningDate() {
            return openingDate;
        }

        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
        }

        public double getFloatAmount() {
            return floatAmount;
        }

        public void setFloatAmount(double floatAmount) {
            this.floatAmount = floatAmount;
        }

        public double getTotalInterestAmount() {
            return totalInterestAmount;
        }

        public void setTotalInterestAmount(double totalInterestAmount) {
            this.totalInterestAmount = totalInterestAmount;
        }
    }

    public static class TimeDepositAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private double originalPrincipalAmount;
        private String currencyCode;
        private double interestRate;
        private String openingDate;
        private String maturityDate;
        private String nextInterestPaymentDate;
        private double interestAmountDue;
        private String renewalInstructions;
        private int tenorTerm;
        private String tenorPeriod;
        private double baseCurrencyMaturityAmount;
        private double maturityInterestAmount;
        private double lastInterestPaymentAmount;

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

        public double getOriginalPrincipalAmount() {
            return originalPrincipalAmount;
        }

        public void setOriginalPrincipalAmount(double originalPrincipalAmount) {
            this.originalPrincipalAmount = originalPrincipalAmount;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public String getOpeningDate() {
            return openingDate;
        }

        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
        }

        public String getMaturityDate() {
            return maturityDate;
        }

        public void setMaturityDate(String maturityDate) {
            this.maturityDate = maturityDate;
        }

        public String getNextInterestPaymentDate() {
            return nextInterestPaymentDate;
        }

        public void setNextInterestPaymentDate(String nextInterestPaymentDate) {
            this.nextInterestPaymentDate = nextInterestPaymentDate;
        }

        public double getInterestAmountDue() {
            return interestAmountDue;
        }

        public void setInterestAmountDue(double interestAmountDue) {
            this.interestAmountDue = interestAmountDue;
        }

        public String getRenewalInstructions() {
            return renewalInstructions;
        }

        public void setRenewalInstructions(String renewalInstructions) {
            this.renewalInstructions = renewalInstructions;
        }

        public int getTenorTerm() {
            return tenorTerm;
        }

        public void setTenorTerm(int tenorTerm) {
            this.tenorTerm = tenorTerm;
        }

        public String getTenorPeriod() {
            return tenorPeriod;
        }

        public void setTenorPeriod(String tenorPeriod) {
            this.tenorPeriod = tenorPeriod;
        }

        public double getBaseCurrencyMaturityAmount() {
            return baseCurrencyMaturityAmount;
        }

        public void setBaseCurrencyMaturityAmount(double baseCurrencyMaturityAmount) {
            this.baseCurrencyMaturityAmount = baseCurrencyMaturityAmount;
        }

        public double getMaturityInterestAmount() {
            return maturityInterestAmount;
        }

        public void setMaturityInterestAmount(double maturityInterestAmount) {
            this.maturityInterestAmount = maturityInterestAmount;
        }

        public double getLastInterestPaymentAmount() {
            return lastInterestPaymentAmount;
        }

        public void setLastInterestPaymentAmount(double lastInterestPaymentAmount) {
            this.lastInterestPaymentAmount = lastInterestPaymentAmount;
        }
    }

    public static class LoanAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private double originalPrincipalAmount;
        private double currentPrincipalAmount;
        private double outstandingBalance;
        private String currencyCode;
        private String maturityDate;
        private String openingDate;
        private String lastPaymentDate;
        private double lastPaymentAmount;
        private double interestAmount;
        private String interestAccumulationPeriod;
        private double nextPaymentAmount;
        private String nextPaymentDate;
        private String paymentFrequency;
        private String interestType;
        private double interestRate;
        private double effectiveInterestRate;
        private double installmentAmount;
        private double remainingTermNumber;
        private double pastDueAmount;
        private double paidPrincipalAmount;
        private double lateChargeAmount;

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

        public double getOriginalPrincipalAmount() {
            return originalPrincipalAmount;
        }

        public void setOriginalPrincipalAmount(double originalPrincipalAmount) {
            this.originalPrincipalAmount = originalPrincipalAmount;
        }

        public double getCurrentPrincipalAmount() {
            return currentPrincipalAmount;
        }

        public void setCurrentPrincipalAmount(double currentPrincipalAmount) {
            this.currentPrincipalAmount = currentPrincipalAmount;
        }

        public double getOutstandingBalance() {
            return outstandingBalance;
        }

        public void setOutstandingBalance(double outstandingBalance) {
            this.outstandingBalance = outstandingBalance;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getMaturityDate() {
            return maturityDate;
        }

        public void setMaturityDate(String maturityDate) {
            this.maturityDate = maturityDate;
        }

        public String getOpeningDate() {
            return openingDate;
        }

        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
        }

        public String getLastPaymentDate() {
            return lastPaymentDate;
        }

        public void setLastPaymentDate(String lastPaymentDate) {
            this.lastPaymentDate = lastPaymentDate;
        }

        public double getLastPaymentAmount() {
            return lastPaymentAmount;
        }

        public void setLastPaymentAmount(double lastPaymentAmount) {
            this.lastPaymentAmount = lastPaymentAmount;
        }

        public double getInterestAmount() {
            return interestAmount;
        }

        public void setInterestAmount(double interestAmount) {
            this.interestAmount = interestAmount;
        }

        public String getInterestAccumulationPeriod() {
            return interestAccumulationPeriod;
        }

        public void setInterestAccumulationPeriod(String interestAccumulationPeriod) {
            this.interestAccumulationPeriod = interestAccumulationPeriod;
        }

        public double getNextPaymentAmount() {
            return nextPaymentAmount;
        }

        public void setNextPaymentAmount(double nextPaymentAmount) {
            this.nextPaymentAmount = nextPaymentAmount;
        }

        public String getNextPaymentDate() {
            return nextPaymentDate;
        }

        public void setNextPaymentDate(String nextPaymentDate) {
            this.nextPaymentDate = nextPaymentDate;
        }

        public String getPaymentFrequency() {
            return paymentFrequency;
        }

        public void setPaymentFrequency(String paymentFrequency) {
            this.paymentFrequency = paymentFrequency;
        }

        public String getInterestType() {
            return interestType;
        }

        public void setInterestType(String interestType) {
            this.interestType = interestType;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public double getEffectiveInterestRate() {
            return effectiveInterestRate;
        }

        public void setEffectiveInterestRate(double effectiveInterestRate) {
            this.effectiveInterestRate = effectiveInterestRate;
        }

        public double getInstallmentAmount() {
            return installmentAmount;
        }

        public void setInstallmentAmount(double installmentAmount) {
            this.installmentAmount = installmentAmount;
        }

        public double getRemainingTermNumber() {
            return remainingTermNumber;
        }

        public void setRemainingTermNumber(double remainingTermNumber) {
            this.remainingTermNumber = remainingTermNumber;
        }

        public double getPastDueAmount() {
            return pastDueAmount;
        }

        public void setPastDueAmount(double pastDueAmount) {
            this.pastDueAmount = pastDueAmount;
        }

        public double getPaidPrincipalAmount() {
            return paidPrincipalAmount;
        }

        public void setPaidPrincipalAmount(double paidPrincipalAmount) {
            this.paidPrincipalAmount = paidPrincipalAmount;
        }

        public double getLateChargeAmount() {
            return lateChargeAmount;
        }

        public void setLateChargeAmount(double lateChargeAmount) {
            this.lateChargeAmount = lateChargeAmount;
        }
    }

    public static class MutualFundAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private String currencyCode;
        private String totalNetAssetValueAmount;
        private String totalTransactionAmount;
        private String totalUnrealizedGains;
        private RelationshipBean relationship;
        private MutualFundBean mutualFund;

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

        public String getTotalNetAssetValueAmount() {
            return totalNetAssetValueAmount;
        }

        public void setTotalNetAssetValueAmount(String totalNetAssetValueAmount) {
            this.totalNetAssetValueAmount = totalNetAssetValueAmount;
        }

        public String getTotalTransactionAmount() {
            return totalTransactionAmount;
        }

        public void setTotalTransactionAmount(String totalTransactionAmount) {
            this.totalTransactionAmount = totalTransactionAmount;
        }

        public String getTotalUnrealizedGains() {
            return totalUnrealizedGains;
        }

        public void setTotalUnrealizedGains(String totalUnrealizedGains) {
            this.totalUnrealizedGains = totalUnrealizedGains;
        }

        public RelationshipBean getRelationship() {
            return relationship;
        }

        public void setRelationship(RelationshipBean relationship) {
            this.relationship = relationship;
        }

        public MutualFundBean getMutualFund() {
            return mutualFund;
        }

        public void setMutualFund(MutualFundBean mutualFund) {
            this.mutualFund = mutualFund;
        }

        public static class RelationshipBean {

            private String relationshipName;
            private String relationshipType;

            public String getRelationshipName() {
                return relationshipName;
            }

            public void setRelationshipName(String relationshipName) {
                this.relationshipName = relationshipName;
            }

            public String getRelationshipType() {
                return relationshipType;
            }

            public void setRelationshipType(String relationshipType) {
                this.relationshipType = relationshipType;
            }
        }

        public static class MutualFundBean {

            private double netAssetValueAmount;
            private String fundCode;
            private String fundName;
            private double investmentAmount;
            private String currencyCode;
            private String maturityDate;
            private double availableUnits;
            private double settledUnits;
            private double assignedUnits;
            private double confirmedUnits;
            private double pendingUnits;
            private int blockUnits;
            private double unrealizedGains;
            private double unrealizedPercentageGain;
            private double latestPrice;

            public double getNetAssetValueAmount() {
                return netAssetValueAmount;
            }

            public void setNetAssetValueAmount(double netAssetValueAmount) {
                this.netAssetValueAmount = netAssetValueAmount;
            }

            public String getFundCode() {
                return fundCode;
            }

            public void setFundCode(String fundCode) {
                this.fundCode = fundCode;
            }

            public String getFundName() {
                return fundName;
            }

            public void setFundName(String fundName) {
                this.fundName = fundName;
            }

            public double getInvestmentAmount() {
                return investmentAmount;
            }

            public void setInvestmentAmount(double investmentAmount) {
                this.investmentAmount = investmentAmount;
            }

            public String getCurrencyCode() {
                return currencyCode;
            }

            public void setCurrencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
            }

            public String getMaturityDate() {
                return maturityDate;
            }

            public void setMaturityDate(String maturityDate) {
                this.maturityDate = maturityDate;
            }

            public double getAvailableUnits() {
                return availableUnits;
            }

            public void setAvailableUnits(double availableUnits) {
                this.availableUnits = availableUnits;
            }

            public double getSettledUnits() {
                return settledUnits;
            }

            public void setSettledUnits(double settledUnits) {
                this.settledUnits = settledUnits;
            }

            public double getAssignedUnits() {
                return assignedUnits;
            }

            public void setAssignedUnits(double assignedUnits) {
                this.assignedUnits = assignedUnits;
            }

            public double getConfirmedUnits() {
                return confirmedUnits;
            }

            public void setConfirmedUnits(double confirmedUnits) {
                this.confirmedUnits = confirmedUnits;
            }

            public double getPendingUnits() {
                return pendingUnits;
            }

            public void setPendingUnits(double pendingUnits) {
                this.pendingUnits = pendingUnits;
            }

            public int getBlockUnits() {
                return blockUnits;
            }

            public void setBlockUnits(int blockUnits) {
                this.blockUnits = blockUnits;
            }

            public double getUnrealizedGains() {
                return unrealizedGains;
            }

            public void setUnrealizedGains(double unrealizedGains) {
                this.unrealizedGains = unrealizedGains;
            }

            public double getUnrealizedPercentageGain() {
                return unrealizedPercentageGain;
            }

            public void setUnrealizedPercentageGain(double unrealizedPercentageGain) {
                this.unrealizedPercentageGain = unrealizedPercentageGain;
            }

            public double getLatestPrice() {
                return latestPrice;
            }

            public void setLatestPrice(double latestPrice) {
                this.latestPrice = latestPrice;
            }
        }
    }

    public static class SecuritiesBrokerageAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private String currencyCode;
        private String totalSecuritiesValueAmount;
        private String totalTransactionAmount;
        private String totalUnrealizedGains;
        private RelationshipBeanX relationship;
        private SecurityBean security;

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

        public String getTotalSecuritiesValueAmount() {
            return totalSecuritiesValueAmount;
        }

        public void setTotalSecuritiesValueAmount(String totalSecuritiesValueAmount) {
            this.totalSecuritiesValueAmount = totalSecuritiesValueAmount;
        }

        public String getTotalTransactionAmount() {
            return totalTransactionAmount;
        }

        public void setTotalTransactionAmount(String totalTransactionAmount) {
            this.totalTransactionAmount = totalTransactionAmount;
        }

        public String getTotalUnrealizedGains() {
            return totalUnrealizedGains;
        }

        public void setTotalUnrealizedGains(String totalUnrealizedGains) {
            this.totalUnrealizedGains = totalUnrealizedGains;
        }

        public RelationshipBeanX getRelationship() {
            return relationship;
        }

        public void setRelationship(RelationshipBeanX relationship) {
            this.relationship = relationship;
        }

        public SecurityBean getSecurity() {
            return security;
        }

        public void setSecurity(SecurityBean security) {
            this.security = security;
        }

        public static class RelationshipBeanX {
            /**
             * relationshipName : Javier Perez Cuellar- Individual
             * relationshipType : SOLE_OWNER
             */

            private String relationshipName;
            private String relationshipType;

            public String getRelationshipName() {
                return relationshipName;
            }

            public void setRelationshipName(String relationshipName) {
                this.relationshipName = relationshipName;
            }

            public String getRelationshipType() {
                return relationshipType;
            }

            public void setRelationshipType(String relationshipType) {
                this.relationshipType = relationshipType;
            }
        }

        public static class SecurityBean {

            private String securityName;
            private String stockCode;
            private String stockMarketCode;
            private double marketValueAmount;
            private double investmentAmount;
            private String currencyCode;
            private double averageUnitCost;
            private String maturityDate;
            private double availableUnits;
            private int settledUnits;
            private int assignedUnits;
            private int confirmedUnits;
            private int pendingUnits;
            private int blockUnits;
            private double unrealizedGains;
            private double unrealizedPercentageGain;
            private double latestPrice;

            public String getSecurityName() {
                return securityName;
            }

            public void setSecurityName(String securityName) {
                this.securityName = securityName;
            }

            public String getStockCode() {
                return stockCode;
            }

            public void setStockCode(String stockCode) {
                this.stockCode = stockCode;
            }

            public String getStockMarketCode() {
                return stockMarketCode;
            }

            public void setStockMarketCode(String stockMarketCode) {
                this.stockMarketCode = stockMarketCode;
            }

            public double getMarketValueAmount() {
                return marketValueAmount;
            }

            public void setMarketValueAmount(double marketValueAmount) {
                this.marketValueAmount = marketValueAmount;
            }

            public double getInvestmentAmount() {
                return investmentAmount;
            }

            public void setInvestmentAmount(double investmentAmount) {
                this.investmentAmount = investmentAmount;
            }

            public String getCurrencyCode() {
                return currencyCode;
            }

            public void setCurrencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
            }

            public double getAverageUnitCost() {
                return averageUnitCost;
            }

            public void setAverageUnitCost(double averageUnitCost) {
                this.averageUnitCost = averageUnitCost;
            }

            public String getMaturityDate() {
                return maturityDate;
            }

            public void setMaturityDate(String maturityDate) {
                this.maturityDate = maturityDate;
            }

            public double getAvailableUnits() {
                return availableUnits;
            }

            public void setAvailableUnits(double availableUnits) {
                this.availableUnits = availableUnits;
            }

            public int getSettledUnits() {
                return settledUnits;
            }

            public void setSettledUnits(int settledUnits) {
                this.settledUnits = settledUnits;
            }

            public int getAssignedUnits() {
                return assignedUnits;
            }

            public void setAssignedUnits(int assignedUnits) {
                this.assignedUnits = assignedUnits;
            }

            public int getConfirmedUnits() {
                return confirmedUnits;
            }

            public void setConfirmedUnits(int confirmedUnits) {
                this.confirmedUnits = confirmedUnits;
            }

            public int getPendingUnits() {
                return pendingUnits;
            }

            public void setPendingUnits(int pendingUnits) {
                this.pendingUnits = pendingUnits;
            }

            public int getBlockUnits() {
                return blockUnits;
            }

            public void setBlockUnits(int blockUnits) {
                this.blockUnits = blockUnits;
            }

            public double getUnrealizedGains() {
                return unrealizedGains;
            }

            public void setUnrealizedGains(double unrealizedGains) {
                this.unrealizedGains = unrealizedGains;
            }

            public double getUnrealizedPercentageGain() {
                return unrealizedPercentageGain;
            }

            public void setUnrealizedPercentageGain(double unrealizedPercentageGain) {
                this.unrealizedPercentageGain = unrealizedPercentageGain;
            }

            public double getLatestPrice() {
                return latestPrice;
            }

            public void setLatestPrice(double latestPrice) {
                this.latestPrice = latestPrice;
            }
        }
    }

    public static class CallDepositAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private String currencyCode;
        private double availableBalance;
        private double currentBalance;
        private double interestRate;
        private String openingDate;
        private double baseCurrencyMaturityAmount;
        private double lastInterestPaymentAmount;
        private String lastInterestPaymentDate;

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

        public double getAvailableBalance() {
            return availableBalance;
        }

        public void setAvailableBalance(double availableBalance) {
            this.availableBalance = availableBalance;
        }

        public double getCurrentBalance() {
            return currentBalance;
        }

        public void setCurrentBalance(double currentBalance) {
            this.currentBalance = currentBalance;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public String getOpeningDate() {
            return openingDate;
        }

        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
        }

        public double getBaseCurrencyMaturityAmount() {
            return baseCurrencyMaturityAmount;
        }

        public void setBaseCurrencyMaturityAmount(double baseCurrencyMaturityAmount) {
            this.baseCurrencyMaturityAmount = baseCurrencyMaturityAmount;
        }

        public double getLastInterestPaymentAmount() {
            return lastInterestPaymentAmount;
        }

        public void setLastInterestPaymentAmount(double lastInterestPaymentAmount) {
            this.lastInterestPaymentAmount = lastInterestPaymentAmount;
        }

        public String getLastInterestPaymentDate() {
            return lastInterestPaymentDate;
        }

        public void setLastInterestPaymentDate(String lastInterestPaymentDate) {
            this.lastInterestPaymentDate = lastInterestPaymentDate;
        }
    }

    public static class PremiumDepositAccountBean {

        private String productName;
        private String productCode;
        private String displayAccountNumber;
        private double baseCurrencyPrincipalAmount;
        private String baseCurrencyCode;
        private double alternateCurrencyPrincipalAmount;
        private String openingDate;
        private String alternateCurrencyCode;
        private String baseCurrencyDisposalAccount;
        private String alternateCurrencyDisposalAccount;
        private double baseCurrencyInterestAmount;
        private double alternateCurrencyInterestAmount;
        private double baseCurrencyMaturityAmount;
        private double alternateCurrencyMaturityAmount;
        private double baseCurrencyPremiumAmount;
        private String maturityDate;
        private double strikePrice;
        private double customerInterestRate;
        private double accruedInterestRate;
        private double benchmarkInterestRate;
        private String dealStatus;
        private String expiryDate;
        private int tenorTerm;
        private String tenorPeriod;
        private RelationshipBeanXX relationship;

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

        public double getBaseCurrencyPrincipalAmount() {
            return baseCurrencyPrincipalAmount;
        }

        public void setBaseCurrencyPrincipalAmount(double baseCurrencyPrincipalAmount) {
            this.baseCurrencyPrincipalAmount = baseCurrencyPrincipalAmount;
        }

        public String getBaseCurrencyCode() {
            return baseCurrencyCode;
        }

        public void setBaseCurrencyCode(String baseCurrencyCode) {
            this.baseCurrencyCode = baseCurrencyCode;
        }

        public double getAlternateCurrencyPrincipalAmount() {
            return alternateCurrencyPrincipalAmount;
        }

        public void setAlternateCurrencyPrincipalAmount(double alternateCurrencyPrincipalAmount) {
            this.alternateCurrencyPrincipalAmount = alternateCurrencyPrincipalAmount;
        }

        public String getOpeningDate() {
            return openingDate;
        }

        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
        }

        public String getAlternateCurrencyCode() {
            return alternateCurrencyCode;
        }

        public void setAlternateCurrencyCode(String alternateCurrencyCode) {
            this.alternateCurrencyCode = alternateCurrencyCode;
        }

        public String getBaseCurrencyDisposalAccount() {
            return baseCurrencyDisposalAccount;
        }

        public void setBaseCurrencyDisposalAccount(String baseCurrencyDisposalAccount) {
            this.baseCurrencyDisposalAccount = baseCurrencyDisposalAccount;
        }

        public String getAlternateCurrencyDisposalAccount() {
            return alternateCurrencyDisposalAccount;
        }

        public void setAlternateCurrencyDisposalAccount(String alternateCurrencyDisposalAccount) {
            this.alternateCurrencyDisposalAccount = alternateCurrencyDisposalAccount;
        }

        public double getBaseCurrencyInterestAmount() {
            return baseCurrencyInterestAmount;
        }

        public void setBaseCurrencyInterestAmount(double baseCurrencyInterestAmount) {
            this.baseCurrencyInterestAmount = baseCurrencyInterestAmount;
        }

        public double getAlternateCurrencyInterestAmount() {
            return alternateCurrencyInterestAmount;
        }

        public void setAlternateCurrencyInterestAmount(double alternateCurrencyInterestAmount) {
            this.alternateCurrencyInterestAmount = alternateCurrencyInterestAmount;
        }

        public double getBaseCurrencyMaturityAmount() {
            return baseCurrencyMaturityAmount;
        }

        public void setBaseCurrencyMaturityAmount(double baseCurrencyMaturityAmount) {
            this.baseCurrencyMaturityAmount = baseCurrencyMaturityAmount;
        }

        public double getAlternateCurrencyMaturityAmount() {
            return alternateCurrencyMaturityAmount;
        }

        public void setAlternateCurrencyMaturityAmount(double alternateCurrencyMaturityAmount) {
            this.alternateCurrencyMaturityAmount = alternateCurrencyMaturityAmount;
        }

        public double getBaseCurrencyPremiumAmount() {
            return baseCurrencyPremiumAmount;
        }

        public void setBaseCurrencyPremiumAmount(double baseCurrencyPremiumAmount) {
            this.baseCurrencyPremiumAmount = baseCurrencyPremiumAmount;
        }

        public String getMaturityDate() {
            return maturityDate;
        }

        public void setMaturityDate(String maturityDate) {
            this.maturityDate = maturityDate;
        }

        public double getStrikePrice() {
            return strikePrice;
        }

        public void setStrikePrice(double strikePrice) {
            this.strikePrice = strikePrice;
        }

        public double getCustomerInterestRate() {
            return customerInterestRate;
        }

        public void setCustomerInterestRate(double customerInterestRate) {
            this.customerInterestRate = customerInterestRate;
        }

        public double getAccruedInterestRate() {
            return accruedInterestRate;
        }

        public void setAccruedInterestRate(double accruedInterestRate) {
            this.accruedInterestRate = accruedInterestRate;
        }

        public double getBenchmarkInterestRate() {
            return benchmarkInterestRate;
        }

        public void setBenchmarkInterestRate(double benchmarkInterestRate) {
            this.benchmarkInterestRate = benchmarkInterestRate;
        }

        public String getDealStatus() {
            return dealStatus;
        }

        public void setDealStatus(String dealStatus) {
            this.dealStatus = dealStatus;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public int getTenorTerm() {
            return tenorTerm;
        }

        public void setTenorTerm(int tenorTerm) {
            this.tenorTerm = tenorTerm;
        }

        public String getTenorPeriod() {
            return tenorPeriod;
        }

        public void setTenorPeriod(String tenorPeriod) {
            this.tenorPeriod = tenorPeriod;
        }

        public RelationshipBeanXX getRelationship() {
            return relationship;
        }

        public void setRelationship(RelationshipBeanXX relationship) {
            this.relationship = relationship;
        }

        public static class RelationshipBeanXX {

            private String relationshipName;
            private String relationshipType;

            public String getRelationshipName() {
                return relationshipName;
            }

            public void setRelationshipName(String relationshipName) {
                this.relationshipName = relationshipName;
            }

            public String getRelationshipType() {
                return relationshipType;
            }

            public void setRelationshipType(String relationshipType) {
                this.relationshipType = relationshipType;
            }
        }
    }
}
