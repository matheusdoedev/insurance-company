package src.main.com.entities;

import src.main.com.models.Address;
import src.main.com.models.Insurance;

public class HouseInsurance extends Insurance {
    private Address houseAddress;
    private int houseConstructionYear;

    public HouseInsurance(String beneficiaryName, Double policyValue, Address houseAddress, int houseConstructionYear) {
        super(beneficiaryName, policyValue);
        this.houseAddress = houseAddress;
        this.houseConstructionYear = houseConstructionYear;
    }

    public Address getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(Address houseAddress) {
        this.houseAddress = houseAddress;
    }

    public int getHouseConstructionYear() {
        return houseConstructionYear;
    }

    public void setHouseConstructionYear(int houseConstructionYear) {
        this.houseConstructionYear = houseConstructionYear;
    }

    @Override
    public Double calculatePrizeValue() {
        Double currentPolicyValue = super.getPolicyValue();

        return currentPolicyValue - ((currentPolicyValue * 0.2) * (2022 - houseConstructionYear));
    }
}
