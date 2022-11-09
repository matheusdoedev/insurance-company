package src.main.com.models;

public abstract class Insurance extends Product {
    protected String beneficiaryName;
    protected Double policyValue;

    public Insurance(String beneficiaryName, Double policyValue) {
        this.beneficiaryName = beneficiaryName;
        this.policyValue = policyValue;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public Double getPolicyValue() {
        return policyValue;
    }

    public void setPolicyValue(Double policyValue) {
        this.policyValue = policyValue;
    }
}
