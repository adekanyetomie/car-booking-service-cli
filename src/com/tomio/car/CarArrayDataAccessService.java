package com.tomio.car;

public class CarArrayDataAccessService implements CarDAO {
    private static final Car[] cars;

    static {
        cars = new Car[] {
                new Car("1234", 100.23, "Audi", false ),
                new Car("5678", 120.50, "BMW", false ),
                new Car("9101", 200.00, "Tesla", true ),
                new Car("9102", 250.00, "Benz", true ),
        };
    }

    @Override
    public Car[] getCars() {
        return cars;
    }



}
