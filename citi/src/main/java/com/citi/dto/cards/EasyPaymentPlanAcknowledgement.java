package com.citi.dto.cards;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class EasyPaymentPlanAcknowledgement {
    private long referenceId;
    private Double installmentAmount;
    private Double principalAmount;
    private Double installmentInterestAmount;
    private Double initialInterestAmount;
    private Double statementUnpaidBalanceAmount;

    public long getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(long referenceId) {
        this.referenceId = referenceId;
    }

    public Double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(Double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public Double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(Double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public Double getInstallmentInterestAmount() {
        return installmentInterestAmount;
    }

    public void setInstallmentInterestAmount(Double installmentInterestAmount) {
        this.installmentInterestAmount = installmentInterestAmount;
    }

    public Double getInitialInterestAmount() {
        return initialInterestAmount;
    }

    public void setInitialInterestAmount(Double initialInterestAmount) {
        this.initialInterestAmount = initialInterestAmount;
    }

    public Double getStatementUnpaidBalanceAmount() {
        return statementUnpaidBalanceAmount;
    }

    public void setStatementUnpaidBalanceAmount(Double statementUnpaidBalanceAmount) {
        this.statementUnpaidBalanceAmount = statementUnpaidBalanceAmount;
    }
}
