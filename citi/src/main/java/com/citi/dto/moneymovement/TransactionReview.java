package com.citi.dto.moneymovement;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class TransactionReview {
    private String controlFlowId;
    private DebitDetailsBean debitDetails;
    private CreditDetailsBean creditDetails;
    private double foreignExchangeRate;
    private double transactionFee;
    private String feeCurrencyCode;

    public String getControlFlowId() {
        return controlFlowId;
    }

    public void setControlFlowId(String controlFlowId) {
        this.controlFlowId = controlFlowId;
    }

    public DebitDetailsBean getDebitDetails() {
        return debitDetails;
    }

    public void setDebitDetails(DebitDetailsBean debitDetails) {
        this.debitDetails = debitDetails;
    }

    public CreditDetailsBean getCreditDetails() {
        return creditDetails;
    }

    public void setCreditDetails(CreditDetailsBean creditDetails) {
        this.creditDetails = creditDetails;
    }

    public double getForeignExchangeRate() {
        return foreignExchangeRate;
    }

    public void setForeignExchangeRate(double foreignExchangeRate) {
        this.foreignExchangeRate = foreignExchangeRate;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public String getFeeCurrencyCode() {
        return feeCurrencyCode;
    }

    public void setFeeCurrencyCode(String feeCurrencyCode) {
        this.feeCurrencyCode = feeCurrencyCode;
    }

    public static class DebitDetailsBean {
        private double transactionDebitAmount;
        private String currencyCode;

        public double getTransactionDebitAmount() {
            return transactionDebitAmount;
        }

        public void setTransactionDebitAmount(double transactionDebitAmount) {
            this.transactionDebitAmount = transactionDebitAmount;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }
    }

    public static class CreditDetailsBean {
        private double transactionCreditAmount;
        private String currencyCode;

        public double getTransactionCreditAmount() {
            return transactionCreditAmount;
        }

        public void setTransactionCreditAmount(double transactionCreditAmount) {
            this.transactionCreditAmount = transactionCreditAmount;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }
    }
}
