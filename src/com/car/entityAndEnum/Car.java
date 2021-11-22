package com.car.entityAndEnum;

public class Car {

	private String matricule;
	private String marque;
	private CarType CarType;

	public Car() {

	}

	public String toString() {
		return "Car Matricule: " + this.getMatricule() + "  Marque: " + this.getMarque() + "   Type: "
				+ this.getCarType();
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public CarType getCarType() {
		return CarType;
	}

	public void setCarType(CarType carType) {
		CarType = carType;
	}

	public void setCarType(String carTypeS) {
		for (CarType c : CarType.values()) {
			if (carTypeS.equals(c))
				CarType = c;
		}

	}

}
