package com.citi.dto.account;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class Transactions {

    private TransactionsBean transactions;
    private InvestmentTransactionBean investmentTransaction;
    private String nextStartIndex;

    public TransactionsBean getTransactions() {
        return transactions;
    }

    public void setTransactions(TransactionsBean transactions) {
        this.transactions = transactions;
    }

    public InvestmentTransactionBean getInvestmentTransaction() {
        return investmentTransaction;
    }

    public void setInvestmentTransaction(InvestmentTransactionBean investmentTransaction) {
        this.investmentTransaction = investmentTransaction;
    }

    public String getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(String nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    public static class TransactionsBean {
        private String displayAccountNumber;
        private String transactionDate;
        private String transactionDescription;
        private String transactionReferenceId;
        private String checkSerialNumber;
        private double transactionAmount;
        private String currencyCode;
        private double foreignTransactionAmount;
        private String foreignCurrencyCode;
        private double foreignExchangeRate;
        private String transactionType;
        private String transactionStatus;
        private double runningBalance;
        private String transactionPostingDate;
        private String transactionCode;
        private String merchantName;
        private String eligibleForEqualPaymentPlan;

        public String getDisplayAccountNumber() {
            return displayAccountNumber;
        }

        public void setDisplayAccountNumber(String displayAccountNumber) {
            this.displayAccountNumber = displayAccountNumber;
        }

        public String getTransactionDate() {
            return transactionDate;
        }

        public void setTransactionDate(String transactionDate) {
            this.transactionDate = transactionDate;
        }

        public String getTransactionDescription() {
            return transactionDescription;
        }

        public void setTransactionDescription(String transactionDescription) {
            this.transactionDescription = transactionDescription;
        }

        public String getTransactionReferenceId() {
            return transactionReferenceId;
        }

        public void setTransactionReferenceId(String transactionReferenceId) {
            this.transactionReferenceId = transactionReferenceId;
        }

        public String getCheckSerialNumber() {
            return checkSerialNumber;
        }

        public void setCheckSerialNumber(String checkSerialNumber) {
            this.checkSerialNumber = checkSerialNumber;
        }

        public double getTransactionAmount() {
            return transactionAmount;
        }

        public void setTransactionAmount(double transactionAmount) {
            this.transactionAmount = transactionAmount;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public double getForeignTransactionAmount() {
            return foreignTransactionAmount;
        }

        public void setForeignTransactionAmount(double foreignTransactionAmount) {
            this.foreignTransactionAmount = foreignTransactionAmount;
        }

        public String getForeignCurrencyCode() {
            return foreignCurrencyCode;
        }

        public void setForeignCurrencyCode(String foreignCurrencyCode) {
            this.foreignCurrencyCode = foreignCurrencyCode;
        }

        public double getForeignExchangeRate() {
            return foreignExchangeRate;
        }

        public void setForeignExchangeRate(double foreignExchangeRate) {
            this.foreignExchangeRate = foreignExchangeRate;
        }

        public String getTransactionType() {
            return transactionType;
        }

        public void setTransactionType(String transactionType) {
            this.transactionType = transactionType;
        }

        public String getTransactionStatus() {
            return transactionStatus;
        }

        public void setTransactionStatus(String transactionStatus) {
            this.transactionStatus = transactionStatus;
        }

        public double getRunningBalance() {
            return runningBalance;
        }

        public void setRunningBalance(double runningBalance) {
            this.runningBalance = runningBalance;
        }

        public String getTransactionPostingDate() {
            return transactionPostingDate;
        }

        public void setTransactionPostingDate(String transactionPostingDate) {
            this.transactionPostingDate = transactionPostingDate;
        }

        public String getTransactionCode() {
            return transactionCode;
        }

        public void setTransactionCode(String transactionCode) {
            this.transactionCode = transactionCode;
        }

        public String getMerchantName() {
            return merchantName;
        }

        public void setMerchantName(String merchantName) {
            this.merchantName = merchantName;
        }

        public String getEligibleForEqualPaymentPlan() {
            return eligibleForEqualPaymentPlan;
        }

        public void setEligibleForEqualPaymentPlan(String eligibleForEqualPaymentPlan) {
            this.eligibleForEqualPaymentPlan = eligibleForEqualPaymentPlan;
        }
    }

    public static class InvestmentTransactionBean {
        private String orderDate;
        private String orderReferenceId;
        private String orderType;
        private String code;
        private String name;
        private String currencyCode;
        private double transactionAmount;
        private double price;
        private String orderStatus;
        private double grossAmount;
        private int orderQuantity;
        private String orderMedium;
        private int filledQuantity;
        private int balanceQuantity;
        private String stockMarketCode;

        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public String getOrderReferenceId() {
            return orderReferenceId;
        }

        public void setOrderReferenceId(String orderReferenceId) {
            this.orderReferenceId = orderReferenceId;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public double getTransactionAmount() {
            return transactionAmount;
        }

        public void setTransactionAmount(double transactionAmount) {
            this.transactionAmount = transactionAmount;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public double getGrossAmount() {
            return grossAmount;
        }

        public void setGrossAmount(double grossAmount) {
            this.grossAmount = grossAmount;
        }

        public int getOrderQuantity() {
            return orderQuantity;
        }

        public void setOrderQuantity(int orderQuantity) {
            this.orderQuantity = orderQuantity;
        }

        public String getOrderMedium() {
            return orderMedium;
        }

        public void setOrderMedium(String orderMedium) {
            this.orderMedium = orderMedium;
        }

        public int getFilledQuantity() {
            return filledQuantity;
        }

        public void setFilledQuantity(int filledQuantity) {
            this.filledQuantity = filledQuantity;
        }

        public int getBalanceQuantity() {
            return balanceQuantity;
        }

        public void setBalanceQuantity(int balanceQuantity) {
            this.balanceQuantity = balanceQuantity;
        }

        public String getStockMarketCode() {
            return stockMarketCode;
        }

        public void setStockMarketCode(String stockMarketCode) {
            this.stockMarketCode = stockMarketCode;
        }
    }
}
