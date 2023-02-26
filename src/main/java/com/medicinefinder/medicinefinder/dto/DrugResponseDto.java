package com.medicinefinder.medicinefinder.dto;

public class DrugResponseDto {

    private String name;
    private String drugBrand;
    private double drugWeight;

    public DrugResponseDto(String name, String drugBrand, double drugWeight) {
        this.name = name;
        this.drugBrand = drugBrand;
        this.drugWeight = drugWeight;
    }

    public DrugResponseDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrugBrand() {
        return drugBrand;
    }

    public void setDrugBrand(String drugBrand) {
        this.drugBrand = drugBrand;
    }

    public double getDrugWeight(double drugWeight) {
        return this.drugWeight;
    }

    public void setDrugWeight(double drugWeight) {
        this.drugWeight = drugWeight;
    }
}
