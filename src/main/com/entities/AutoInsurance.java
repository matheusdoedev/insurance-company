package src.main.com.entities;

import src.main.com.models.Insurance;

public class AutoInsurance extends Insurance {
    private Integer carChassisNumber;
    private Integer buildingYear;

    public AutoInsurance(String beneficiaryName, Double policyValue, Integer carChassisNumber, Integer buildingYear) {
        super(beneficiaryName, policyValue);
    }

    public Integer getCarChassisNumber() {
        return carChassisNumber;
    }

    public void setCarChassisNumber(Integer carChassisNumber) {
        this.carChassisNumber = carChassisNumber;
    }

    public Integer getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(Integer buildingYear) {
        this.buildingYear = buildingYear;
    }

    @Override
    public Double calculatePrizeValue() {
        Double currentPolicyValue = super.getPolicyValue();
        Double initialValue = currentPolicyValue * 0.9;
        int yearsOfDepreciation = 2022 - this.buildingYear;
        Double deprenciationValue = (currentPolicyValue * 0.2) * yearsOfDepreciation;

        return initialValue - deprenciationValue;
    }
}
