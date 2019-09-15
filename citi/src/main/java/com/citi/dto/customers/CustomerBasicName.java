package com.citi.dto.customers;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class CustomerBasicName {
    private String customerType;
    private String customerSegment;
    private String partnerCustomerSegment;
    private CustomerParticularsBean customerParticulars;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerSegment() {
        return customerSegment;
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    public String getPartnerCustomerSegment() {
        return partnerCustomerSegment;
    }

    public void setPartnerCustomerSegment(String partnerCustomerSegment) {
        this.partnerCustomerSegment = partnerCustomerSegment;
    }

    public CustomerParticularsBean getCustomerParticulars() {
        return customerParticulars;
    }

    public void setCustomerParticulars(CustomerParticularsBean customerParticulars) {
        this.customerParticulars = customerParticulars;
    }

    public static class CustomerParticularsBean {
        private NamesBean names;
        private String prefix;
        private String suffix;

        public NamesBean getNames() {
            return names;
        }

        public void setNames(NamesBean names) {
            this.names = names;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getSuffix() {
            return suffix;
        }

        public void setSuffix(String suffix) {
            this.suffix = suffix;
        }

        public static class NamesBean {
            private String firstName;
            private String lastName;
            private String nameType;
            private String middleName;
            private String fullName;

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getNameType() {
                return nameType;
            }

            public void setNameType(String nameType) {
                this.nameType = nameType;
            }

            public String getMiddleName() {
                return middleName;
            }

            public void setMiddleName(String middleName) {
                this.middleName = middleName;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }
        }
    }
}
