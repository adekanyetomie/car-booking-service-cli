package com.tomio.car;

public class CarService {

	public Car[] getCars(){
		CarArrayDataAccessService carArrayDataAccessService = new CarArrayDataAccessService();
	    return carArrayDataAccessService.getCars();
	}

}
