package src.main.com.entities;

import src.main.com.models.Insurance;

public class LifeInsurance extends Insurance {
    private Integer beneficiaryAge;

    public LifeInsurance(
            String beneficiaryName,
            Double policyValue,
            Integer beneficiaryAge) {
        super(beneficiaryName, policyValue);
    }

    public Integer getBeneficiaryAge() {
        return beneficiaryAge;
    }

    public void setBeneficiaryAge(Integer beneficiaryAge) {
        this.beneficiaryAge = beneficiaryAge;
    }

    @Override
    public Double calculatePrizeValue() {
        Double currentPolicyValue = super.getPolicyValue();

        if (this.beneficiaryAge >= 50) {
            return currentPolicyValue + (currentPolicyValue * 0.1);
        }
        return currentPolicyValue;
    }
}
