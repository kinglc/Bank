package com.citi.dto.cards;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class EasyPaymentPlan {

    private int tenor;
    private double effectiveInterestRate;
    private double annualPercentageRate;
    private double installmentAmount;
    private String oneTimeProcessingFeeIndicator;
    private double oneTimeProcessingFeeAmount;
    private double oneTimeProcessingFeePercentage;
    private String offerIndicator;

    public int getTenor() {
        return tenor;
    }

    public void setTenor(int tenor) {
        this.tenor = tenor;
    }

    public double getEffectiveInterestRate() {
        return effectiveInterestRate;
    }

    public void setEffectiveInterestRate(double effectiveInterestRate) {
        this.effectiveInterestRate = effectiveInterestRate;
    }

    public double getAnnualPercentageRate() {
        return annualPercentageRate;
    }

    public void setAnnualPercentageRate(double annualPercentageRate) {
        this.annualPercentageRate = annualPercentageRate;
    }

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getOneTimeProcessingFeeIndicator() {
        return oneTimeProcessingFeeIndicator;
    }

    public void setOneTimeProcessingFeeIndicator(String oneTimeProcessingFeeIndicator) {
        this.oneTimeProcessingFeeIndicator = oneTimeProcessingFeeIndicator;
    }

    public double getOneTimeProcessingFeeAmount() {
        return oneTimeProcessingFeeAmount;
    }

    public void setOneTimeProcessingFeeAmount(double oneTimeProcessingFeeAmount) {
        this.oneTimeProcessingFeeAmount = oneTimeProcessingFeeAmount;
    }

    public double getOneTimeProcessingFeePercentage() {
        return oneTimeProcessingFeePercentage;
    }

    public void setOneTimeProcessingFeePercentage(double oneTimeProcessingFeePercentage) {
        this.oneTimeProcessingFeePercentage = oneTimeProcessingFeePercentage;
    }

    public String getOfferIndicator() {
        return offerIndicator;
    }

    public void setOfferIndicator(String offerIndicator) {
        this.offerIndicator = offerIndicator;
    }
}
