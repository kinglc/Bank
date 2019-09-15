package com.citi.dto.cards;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class RepaymentSchedules {
    private EppAmortizationScheduleBean eppAmortizationSchedule;
    private double totalLoanCost;

    public EppAmortizationScheduleBean getEppAmortizationSchedule() {
        return eppAmortizationSchedule;
    }

    public void setEppAmortizationSchedule(EppAmortizationScheduleBean eppAmortizationSchedule) {
        this.eppAmortizationSchedule = eppAmortizationSchedule;
    }

    public double getTotalLoanCost() {
        return totalLoanCost;
    }

    public void setTotalLoanCost(double totalLoanCost) {
        this.totalLoanCost = totalLoanCost;
    }

    public static class EppAmortizationScheduleBean {
        private String installmentNumber;
        private double installmentAmount;
        private double principalAmount;
        private double installmentInterestAmount;
        private double outstandingPrincipalAmount;
        private String installmentDate;

        public String getInstallmentNumber() {
            return installmentNumber;
        }

        public void setInstallmentNumber(String installmentNumber) {
            this.installmentNumber = installmentNumber;
        }

        public double getInstallmentAmount() {
            return installmentAmount;
        }

        public void setInstallmentAmount(double installmentAmount) {
            this.installmentAmount = installmentAmount;
        }

        public double getPrincipalAmount() {
            return principalAmount;
        }

        public void setPrincipalAmount(double principalAmount) {
            this.principalAmount = principalAmount;
        }

        public double getInstallmentInterestAmount() {
            return installmentInterestAmount;
        }

        public void setInstallmentInterestAmount(double installmentInterestAmount) {
            this.installmentInterestAmount = installmentInterestAmount;
        }

        public double getOutstandingPrincipalAmount() {
            return outstandingPrincipalAmount;
        }

        public void setOutstandingPrincipalAmount(double outstandingPrincipalAmount) {
            this.outstandingPrincipalAmount = outstandingPrincipalAmount;
        }

        public String getInstallmentDate() {
            return installmentDate;
        }

        public void setInstallmentDate(String installmentDate) {
            this.installmentDate = installmentDate;
        }
    }
}
