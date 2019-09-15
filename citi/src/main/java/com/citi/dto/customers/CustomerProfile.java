package com.citi.dto.customers;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
public class CustomerProfile {
    private String customerType;
    private String customerSegment;
    private String partnerCustomerSegment;
    private Boolean phoneNumberUpdateAllowedFlag;
    private Boolean taxComplianceCertificationFlag;
    private Boolean addressUpdateAllowedFlag;
    private CustomerParticularsBean customerParticulars;
    private DemographicsBean demographics;
    private AddressListBean addressList;
    private EmailsBean emails;
    private PhonesBean phones;
    private IdentificationDocumentDetailsBean identificationDocumentDetails;
    private EducationDetailsBean educationDetails;
    private EmploymentDetailsBean employmentDetails;
    private FinancialInformationBean financialInformation;
    private KycInformationBean kycInformation;

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

    public Boolean isPhoneNumberUpdateAllowedFlag() {
        return phoneNumberUpdateAllowedFlag;
    }

    public void setPhoneNumberUpdateAllowedFlag(Boolean phoneNumberUpdateAllowedFlag) {
        this.phoneNumberUpdateAllowedFlag = phoneNumberUpdateAllowedFlag;
    }

    public Boolean isTaxComplianceCertificationFlag() {
        return taxComplianceCertificationFlag;
    }

    public void setTaxComplianceCertificationFlag(Boolean taxComplianceCertificationFlag) {
        this.taxComplianceCertificationFlag = taxComplianceCertificationFlag;
    }

    public Boolean isAddressUpdateAllowedFlag() {
        return addressUpdateAllowedFlag;
    }

    public void setAddressUpdateAllowedFlag(Boolean addressUpdateAllowedFlag) {
        this.addressUpdateAllowedFlag = addressUpdateAllowedFlag;
    }

    public CustomerParticularsBean getCustomerParticulars() {
        return customerParticulars;
    }

    public void setCustomerParticulars(CustomerParticularsBean customerParticulars) {
        this.customerParticulars = customerParticulars;
    }

    public DemographicsBean getDemographics() {
        return demographics;
    }

    public void setDemographics(DemographicsBean demographics) {
        this.demographics = demographics;
    }

    public AddressListBean getAddressList() {
        return addressList;
    }

    public void setAddressList(AddressListBean addressList) {
        this.addressList = addressList;
    }

    public EmailsBean getEmails() {
        return emails;
    }

    public void setEmails(EmailsBean emails) {
        this.emails = emails;
    }

    public PhonesBean getPhones() {
        return phones;
    }

    public void setPhones(PhonesBean phones) {
        this.phones = phones;
    }

    public IdentificationDocumentDetailsBean getIdentificationDocumentDetails() {
        return identificationDocumentDetails;
    }

    public void setIdentificationDocumentDetails(IdentificationDocumentDetailsBean identificationDocumentDetails) {
        this.identificationDocumentDetails = identificationDocumentDetails;
    }

    public EducationDetailsBean getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(EducationDetailsBean educationDetails) {
        this.educationDetails = educationDetails;
    }

    public EmploymentDetailsBean getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(EmploymentDetailsBean employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public FinancialInformationBean getFinancialInformation() {
        return financialInformation;
    }

    public void setFinancialInformation(FinancialInformationBean financialInformation) {
        this.financialInformation = financialInformation;
    }

    public KycInformationBean getKycInformation() {
        return kycInformation;
    }

    public void setKycInformation(KycInformationBean kycInformation) {
        this.kycInformation = kycInformation;
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

    public static class DemographicsBean {
        private String dateOfBirth;
        private String placeOfBirth;
        private String countryOfBirth;
        private String residenceCountryCode;
        private String nationality;
        private String maritalStatus;
        private String residencyStatus;
        private String residenceType;
        private String secondOtherNationalityCountryCode;
        private String thirdOtherNationalityCountryCode;
        private String fourthOtherNationalityCountryCode;
        private String fifthOtherNationalityCountryCode;

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getPlaceOfBirth() {
            return placeOfBirth;
        }

        public void setPlaceOfBirth(String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
        }

        public String getCountryOfBirth() {
            return countryOfBirth;
        }

        public void setCountryOfBirth(String countryOfBirth) {
            this.countryOfBirth = countryOfBirth;
        }

        public String getResidenceCountryCode() {
            return residenceCountryCode;
        }

        public void setResidenceCountryCode(String residenceCountryCode) {
            this.residenceCountryCode = residenceCountryCode;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getMaritalStatus() {
            return maritalStatus;
        }

        public void setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public String getResidencyStatus() {
            return residencyStatus;
        }

        public void setResidencyStatus(String residencyStatus) {
            this.residencyStatus = residencyStatus;
        }

        public String getResidenceType() {
            return residenceType;
        }

        public void setResidenceType(String residenceType) {
            this.residenceType = residenceType;
        }

        public String getSecondOtherNationalityCountryCode() {
            return secondOtherNationalityCountryCode;
        }

        public void setSecondOtherNationalityCountryCode(String secondOtherNationalityCountryCode) {
            this.secondOtherNationalityCountryCode = secondOtherNationalityCountryCode;
        }

        public String getThirdOtherNationalityCountryCode() {
            return thirdOtherNationalityCountryCode;
        }

        public void setThirdOtherNationalityCountryCode(String thirdOtherNationalityCountryCode) {
            this.thirdOtherNationalityCountryCode = thirdOtherNationalityCountryCode;
        }

        public String getFourthOtherNationalityCountryCode() {
            return fourthOtherNationalityCountryCode;
        }

        public void setFourthOtherNationalityCountryCode(String fourthOtherNationalityCountryCode) {
            this.fourthOtherNationalityCountryCode = fourthOtherNationalityCountryCode;
        }

        public String getFifthOtherNationalityCountryCode() {
            return fifthOtherNationalityCountryCode;
        }

        public void setFifthOtherNationalityCountryCode(String fifthOtherNationalityCountryCode) {
            this.fifthOtherNationalityCountryCode = fifthOtherNationalityCountryCode;
        }
    }

    public static class AddressListBean {
        private int addressKey;
        private String addressline1;
        private String addressline2;
        private String addressline3;
        private String addressline4;
        private String addressType;
        private String district;
        private String city;
        private String state;
        private String postalCode;
        private String countryName;
        private CountrySpecificAddressBean countrySpecificAddress;

        public int getAddressKey() {
            return addressKey;
        }

        public void setAddressKey(int addressKey) {
            this.addressKey = addressKey;
        }

        public String getAddressline1() {
            return addressline1;
        }

        public void setAddressline1(String addressline1) {
            this.addressline1 = addressline1;
        }

        public String getAddressline2() {
            return addressline2;
        }

        public void setAddressline2(String addressline2) {
            this.addressline2 = addressline2;
        }

        public String getAddressline3() {
            return addressline3;
        }

        public void setAddressline3(String addressline3) {
            this.addressline3 = addressline3;
        }

        public String getAddressline4() {
            return addressline4;
        }

        public void setAddressline4(String addressline4) {
            this.addressline4 = addressline4;
        }

        public String getAddressType() {
            return addressType;
        }

        public void setAddressType(String addressType) {
            this.addressType = addressType;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public CountrySpecificAddressBean getCountrySpecificAddress() {
            return countrySpecificAddress;
        }

        public void setCountrySpecificAddress(CountrySpecificAddressBean countrySpecificAddress) {
            this.countrySpecificAddress = countrySpecificAddress;
        }

        public static class CountrySpecificAddressBean {
            private String village;
            private String subDistrict;
            private String regencyCode;

            public String getVillage() {
                return village;
            }

            public void setVillage(String village) {
                this.village = village;
            }

            public String getSubDistrict() {
                return subDistrict;
            }

            public void setSubDistrict(String subDistrict) {
                this.subDistrict = subDistrict;
            }

            public String getRegencyCode() {
                return regencyCode;
            }

            public void setRegencyCode(String regencyCode) {
                this.regencyCode = regencyCode;
            }
        }
    }

    public static class EmailsBean {
        private int emailKey;
        private String emailAddress;
        private String preferredEmailFlag;
        private String emailType;

        public int getEmailKey() {
            return emailKey;
        }

        public void setEmailKey(int emailKey) {
            this.emailKey = emailKey;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public String getPreferredEmailFlag() {
            return preferredEmailFlag;
        }

        public void setPreferredEmailFlag(String preferredEmailFlag) {
            this.preferredEmailFlag = preferredEmailFlag;
        }

        public String getEmailType() {
            return emailType;
        }

        public void setEmailType(String emailType) {
            this.emailType = emailType;
        }
    }

    public static class PhonesBean {
        private int phoneKey;
        private String phoneType;
        private String phoneNumber;
        private String phoneCountryCode;
        private String areaCode;
        private String extension;

        public int getPhoneKey() {
            return phoneKey;
        }

        public void setPhoneKey(int phoneKey) {
            this.phoneKey = phoneKey;
        }

        public String getPhoneType() {
            return phoneType;
        }

        public void setPhoneType(String phoneType) {
            this.phoneType = phoneType;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneCountryCode() {
            return phoneCountryCode;
        }

        public void setPhoneCountryCode(String phoneCountryCode) {
            this.phoneCountryCode = phoneCountryCode;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }
    }

    public static class IdentificationDocumentDetailsBean {
        private String idType;
        private Boolean primaryIdFlag;
        private String idNumber;
        private String idExpiryDate;
        private String idIssueDate;
        private String idIssuePlace;
        private String idIssueCountry;

        public String getIdType() {
            return idType;
        }

        public void setIdType(String idType) {
            this.idType = idType;
        }

        public Boolean isPrimaryIdFlag() {
            return primaryIdFlag;
        }

        public void setPrimaryIdFlag(Boolean primaryIdFlag) {
            this.primaryIdFlag = primaryIdFlag;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public String getIdExpiryDate() {
            return idExpiryDate;
        }

        public void setIdExpiryDate(String idExpiryDate) {
            this.idExpiryDate = idExpiryDate;
        }

        public String getIdIssueDate() {
            return idIssueDate;
        }

        public void setIdIssueDate(String idIssueDate) {
            this.idIssueDate = idIssueDate;
        }

        public String getIdIssuePlace() {
            return idIssuePlace;
        }

        public void setIdIssuePlace(String idIssuePlace) {
            this.idIssuePlace = idIssuePlace;
        }

        public String getIdIssueCountry() {
            return idIssueCountry;
        }

        public void setIdIssueCountry(String idIssueCountry) {
            this.idIssueCountry = idIssueCountry;
        }
    }

    public static class EducationDetailsBean {
        private String highestEducationLevel;

        public String getHighestEducationLevel() {
            return highestEducationLevel;
        }

        public void setHighestEducationLevel(String highestEducationLevel) {
            this.highestEducationLevel = highestEducationLevel;
        }
    }

    public static class EmploymentDetailsBean {
        private String employerName;
        private String jobTitle;
        private String occupationCode;
        private String otherOccupationDescription;
        private String industryCode;
        private int employmentDurationInYears;
        private String emailAddress;
        private String employmentStatus;
        private String employmentStartDate;

        public String getEmployerName() {
            return employerName;
        }

        public void setEmployerName(String employerName) {
            this.employerName = employerName;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public String getOccupationCode() {
            return occupationCode;
        }

        public void setOccupationCode(String occupationCode) {
            this.occupationCode = occupationCode;
        }

        public String getOtherOccupationDescription() {
            return otherOccupationDescription;
        }

        public void setOtherOccupationDescription(String otherOccupationDescription) {
            this.otherOccupationDescription = otherOccupationDescription;
        }

        public String getIndustryCode() {
            return industryCode;
        }

        public void setIndustryCode(String industryCode) {
            this.industryCode = industryCode;
        }

        public int getEmploymentDurationInYears() {
            return employmentDurationInYears;
        }

        public void setEmploymentDurationInYears(int employmentDurationInYears) {
            this.employmentDurationInYears = employmentDurationInYears;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public String getEmploymentStatus() {
            return employmentStatus;
        }

        public void setEmploymentStatus(String employmentStatus) {
            this.employmentStatus = employmentStatus;
        }

        public String getEmploymentStartDate() {
            return employmentStartDate;
        }

        public void setEmploymentStartDate(String employmentStartDate) {
            this.employmentStartDate = employmentStartDate;
        }
    }

    public static class FinancialInformationBean {
        private IncomeDetailsBean incomeDetails;

        public IncomeDetailsBean getIncomeDetails() {
            return incomeDetails;
        }

        public void setIncomeDetails(IncomeDetailsBean incomeDetails) {
            this.incomeDetails = incomeDetails;
        }

        public static class IncomeDetailsBean {
            private String incomeType;
            private double fixedAmount;
            private double variableAmount;
            private String frequency;

            public String getIncomeType() {
                return incomeType;
            }

            public void setIncomeType(String incomeType) {
                this.incomeType = incomeType;
            }

            public double getFixedAmount() {
                return fixedAmount;
            }

            public void setFixedAmount(double fixedAmount) {
                this.fixedAmount = fixedAmount;
            }

            public double getVariableAmount() {
                return variableAmount;
            }

            public void setVariableAmount(double variableAmount) {
                this.variableAmount = variableAmount;
            }

            public String getFrequency() {
                return frequency;
            }

            public void setFrequency(String frequency) {
                this.frequency = frequency;
            }
        }
    }

    public static class KycInformationBean {
        private String usTaxStatus;
        private String usTaxId;
        private String usTaxIdCertificationDate;
        private String nonResidentTaxCertificationStrtDate;
        private String nonResidentTaxCertificationExpDate;
        private String usResidencyStatus;

        public String getUsTaxStatus() {
            return usTaxStatus;
        }

        public void setUsTaxStatus(String usTaxStatus) {
            this.usTaxStatus = usTaxStatus;
        }

        public String getUsTaxId() {
            return usTaxId;
        }

        public void setUsTaxId(String usTaxId) {
            this.usTaxId = usTaxId;
        }

        public String getUsTaxIdCertificationDate() {
            return usTaxIdCertificationDate;
        }

        public void setUsTaxIdCertificationDate(String usTaxIdCertificationDate) {
            this.usTaxIdCertificationDate = usTaxIdCertificationDate;
        }

        public String getNonResidentTaxCertificationStrtDate() {
            return nonResidentTaxCertificationStrtDate;
        }

        public void setNonResidentTaxCertificationStrtDate(String nonResidentTaxCertificationStrtDate) {
            this.nonResidentTaxCertificationStrtDate = nonResidentTaxCertificationStrtDate;
        }

        public String getNonResidentTaxCertificationExpDate() {
            return nonResidentTaxCertificationExpDate;
        }

        public void setNonResidentTaxCertificationExpDate(String nonResidentTaxCertificationExpDate) {
            this.nonResidentTaxCertificationExpDate = nonResidentTaxCertificationExpDate;
        }

        public String getUsResidencyStatus() {
            return usResidencyStatus;
        }

        public void setUsResidencyStatus(String usResidencyStatus) {
            this.usResidencyStatus = usResidencyStatus;
        }
    }
}
