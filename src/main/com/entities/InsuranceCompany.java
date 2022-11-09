package src.main.com.entities;

import src.main.com.enums.InsuranceType;

public class InsuranceCompany {
    private String name;

    public InsuranceCompany(String name) {
        this.name = name;
    }

    void sellProduct(InsuranceType type) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}