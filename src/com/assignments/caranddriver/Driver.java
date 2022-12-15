package com.assignments.caranddriver;

public class Driver extends Car {

	public Driver() {
		super();
	}

	public Driver(int gas, int status) {
		super(gas, status);
	}
	
//	METHODS
//	public void drive() {
//		int gas = this.getGas();
//		this.setGas(gas - 1);
//	}
	
	public int getGas() {
		return gas;
	}
	
}
