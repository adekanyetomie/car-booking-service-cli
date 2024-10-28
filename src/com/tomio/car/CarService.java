package com.tomio.car;

public class CarService {
	final CarArrayDataAccessService carArrayDataAccessService;

	public CarService(CarArrayDataAccessService carArrayDataAccessService) {
		this.carArrayDataAccessService = carArrayDataAccessService;
	}

	public Car[] getCars(){
	    return carArrayDataAccessService.getCars();
	}

}
