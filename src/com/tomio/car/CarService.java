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

	public Car getCarbyId(String id) {
		for (Car car : carDAO.getCars()) {
			if (car.getRegNumber().equals(id)) {
				return car;
			}
		}
		return null;
	}

	public List<Car> getElectricCars() {
		List<Car> cars = carDAO.getCars();

		if (cars.isEmpty()) {
			return null;
		}

		List<Car> electricCars = new ArrayList<Car>();
		for (Car car : cars) {
			if (car.getElectric()) {
				electricCars.add(car);
			}
		}
		return electricCars;
	}

}
