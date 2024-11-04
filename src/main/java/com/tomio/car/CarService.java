package com.tomio.car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
	final CarDAO carDAO;

	public CarService(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

	public List<Car> getCars(){
	    return carDAO.getCars();
	}

	public Car getCarById(String id) {
		for (Car car : getCars()) {
			if (car.getRegNumber().equals(id)) {
				return car;
			}
		}
		return null;
	}

	public List<Car> getElectricCars() {
		return getCars().stream().filter(Car::getElectric).toList();
	}

}
