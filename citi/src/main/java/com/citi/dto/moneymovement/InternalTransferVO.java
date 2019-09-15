package com.citi.dto.moneymovement;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class InternalTransferVO {
    private String sourceAccountId;
    private double transactionAmount;
    private String transferCurrencyIndicator;
    private String payeeId;
    private String chargeBearer;
    private String paymentMethod;
    private String fxDealReferenceNumber;
    private String transferPurpose;

    public String getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransferCurrencyIndicator() {
        return transferCurrencyIndicator;
    }

    public void setTransferCurrencyIndicator(String transferCurrencyIndicator) {
        this.transferCurrencyIndicator = transferCurrencyIndicator;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(String chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getFxDealReferenceNumber() {
        return fxDealReferenceNumber;
    }

    public void setFxDealReferenceNumber(String fxDealReferenceNumber) {
        this.fxDealReferenceNumber = fxDealReferenceNumber;
    }

    public String getTransferPurpose() {
        return transferPurpose;
    }

    public void setTransferPurpose(String transferPurpose) {
        this.transferPurpose = transferPurpose;
    }
}
