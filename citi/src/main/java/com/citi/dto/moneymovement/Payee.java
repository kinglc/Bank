package com.citi.dto.moneymovement;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class Payee {
    private PayeeListBean payeeList;
    private String nextStartIndex;

    public PayeeListBean getPayeeList() {
        return payeeList;
    }

    public void setPayeeList(PayeeListBean payeeList) {
        this.payeeList = payeeList;
    }

    public String getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(String nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    public static class PayeeListBean {
        private String payeeId;
        private String payeeName;
        private String payeeNickname;
        private String paymentType;
        private String displayAccountNumber;
        private String accountId;
        private String currencyCode;
        private PaymentMethodsBean paymentMethods;
        private String payeeStatus;
        private String merchantNumber;

        public String getPayeeId() {
            return payeeId;
        }

        public void setPayeeId(String payeeId) {
            this.payeeId = payeeId;
        }

        public String getPayeeName() {
            return payeeName;
        }

        public void setPayeeName(String payeeName) {
            this.payeeName = payeeName;
        }

        public String getPayeeNickname() {
            return payeeNickname;
        }

        public void setPayeeNickname(String payeeNickname) {
            this.payeeNickname = payeeNickname;
        }

        public String getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(String paymentType) {
            this.paymentType = paymentType;
        }

        public String getDisplayAccountNumber() {
            return displayAccountNumber;
        }

        public void setDisplayAccountNumber(String displayAccountNumber) {
            this.displayAccountNumber = displayAccountNumber;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public PaymentMethodsBean getPaymentMethods() {
            return paymentMethods;
        }

        public void setPaymentMethods(PaymentMethodsBean paymentMethods) {
            this.paymentMethods = paymentMethods;
        }

        public String getPayeeStatus() {
            return payeeStatus;
        }

        public void setPayeeStatus(String payeeStatus) {
            this.payeeStatus = payeeStatus;
        }

        public String getMerchantNumber() {
            return merchantNumber;
        }

        public void setMerchantNumber(String merchantNumber) {
            this.merchantNumber = merchantNumber;
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
    }
}
