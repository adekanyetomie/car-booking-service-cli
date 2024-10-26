package com.tomio.car;

import java.util.Objects;

public class Car {
    private String regNumber;
    private Double dailyRentalPrice;
    private String brand;
    private Boolean isElectric;

    public Car(String regNumber, Double dailyRentalPrice, String brand, Boolean isElectric) {
        this.regNumber = regNumber;
        this.dailyRentalPrice = dailyRentalPrice;
        this.brand = brand;
        this.isElectric = isElectric;
    }

    public Car() {}

    public String getRegNumber() {
        return regNumber;
    }

    public Double getDailyRentalPrice() {
        return dailyRentalPrice;
    }

    public String getBrand() {
        return brand;
    }

    public Boolean getElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", dailyRentalPrice=" + dailyRentalPrice +
                ", brand='" + brand + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(regNumber, car.regNumber) && Objects.equals(dailyRentalPrice, car.dailyRentalPrice) && Objects.equals(brand, car.brand) && Objects.equals(isElectric, car.isElectric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, dailyRentalPrice, brand, isElectric);
    }
}
