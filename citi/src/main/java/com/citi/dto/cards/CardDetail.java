package com.citi.dto.cards;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class CardDetail {
    private String cardId;
    private String displayCardNumber;
    private String localCardActivationIndicator;
    private String overseasCardActivationIndicator;
    private boolean perpetualActivationFlag;
    private String overseasCardActivationStartDate;
    private String overseasCardActivationEndDate;
    private double currentCreditLimitAmount;
    private double maximumPermanentCreditLimitAmount;
    private double maximumTemporaryCreditLimitAmount;
    private String subCardType;
    private String cardHolderType;
    private String cardIssueReason;
    private CardFunctionsAllowedBean cardFunctionsAllowed;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getDisplayCardNumber() {
        return displayCardNumber;
    }

    public void setDisplayCardNumber(String displayCardNumber) {
        this.displayCardNumber = displayCardNumber;
    }

    public String getLocalCardActivationIndicator() {
        return localCardActivationIndicator;
    }

    public void setLocalCardActivationIndicator(String localCardActivationIndicator) {
        this.localCardActivationIndicator = localCardActivationIndicator;
    }

    public String getOverseasCardActivationIndicator() {
        return overseasCardActivationIndicator;
    }

    public void setOverseasCardActivationIndicator(String overseasCardActivationIndicator) {
        this.overseasCardActivationIndicator = overseasCardActivationIndicator;
    }

    public boolean isPerpetualActivationFlag() {
        return perpetualActivationFlag;
    }

    public void setPerpetualActivationFlag(boolean perpetualActivationFlag) {
        this.perpetualActivationFlag = perpetualActivationFlag;
    }

    public String getOverseasCardActivationStartDate() {
        return overseasCardActivationStartDate;
    }

    public void setOverseasCardActivationStartDate(String overseasCardActivationStartDate) {
        this.overseasCardActivationStartDate = overseasCardActivationStartDate;
    }

    public String getOverseasCardActivationEndDate() {
        return overseasCardActivationEndDate;
    }

    public void setOverseasCardActivationEndDate(String overseasCardActivationEndDate) {
        this.overseasCardActivationEndDate = overseasCardActivationEndDate;
    }

    public double getCurrentCreditLimitAmount() {
        return currentCreditLimitAmount;
    }

    public void setCurrentCreditLimitAmount(double currentCreditLimitAmount) {
        this.currentCreditLimitAmount = currentCreditLimitAmount;
    }

    public double getMaximumPermanentCreditLimitAmount() {
        return maximumPermanentCreditLimitAmount;
    }

    public void setMaximumPermanentCreditLimitAmount(double maximumPermanentCreditLimitAmount) {
        this.maximumPermanentCreditLimitAmount = maximumPermanentCreditLimitAmount;
    }

    public double getMaximumTemporaryCreditLimitAmount() {
        return maximumTemporaryCreditLimitAmount;
    }

    public void setMaximumTemporaryCreditLimitAmount(double maximumTemporaryCreditLimitAmount) {
        this.maximumTemporaryCreditLimitAmount = maximumTemporaryCreditLimitAmount;
    }

    public String getSubCardType() {
        return subCardType;
    }

    public void setSubCardType(String subCardType) {
        this.subCardType = subCardType;
    }

    public String getCardHolderType() {
        return cardHolderType;
    }

    public void setCardHolderType(String cardHolderType) {
        this.cardHolderType = cardHolderType;
    }

    public String getCardIssueReason() {
        return cardIssueReason;
    }

    public void setCardIssueReason(String cardIssueReason) {
        this.cardIssueReason = cardIssueReason;
    }

    public CardFunctionsAllowedBean getCardFunctionsAllowed() {
        return cardFunctionsAllowed;
    }

    public void setCardFunctionsAllowed(CardFunctionsAllowedBean cardFunctionsAllowed) {
        this.cardFunctionsAllowed = cardFunctionsAllowed;
    }

    public static class CardFunctionsAllowedBean {
        private String cardFunction;

        public String getCardFunction() {
            return cardFunction;
        }

        public void setCardFunction(String cardFunction) {
            this.cardFunction = cardFunction;
        }
    }
}
